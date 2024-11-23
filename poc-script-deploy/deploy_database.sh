#!/bin/bash

set -o errexit
set -o nounset
set -o pipefail

# Variáveis globais
REPO_URL="https://github.com/Grupo-6-Projeto-Volt/DataBase.git"
BRANCH="main"
WORK_DIR="/tmp/database-deploy"
DB_FILE="bd_volt.sql"
MYSQL_ROOT_PASSWORD="root"
MYSQL_USER="sptech"
MYSQL_USER_PASSWORD="sptech"
DATABASE_NAME="bd_volt"

# Função para instalar dependências
install_dependencies() {
    printf "Instalando dependências...\n"
    if [[ -f /etc/os-release ]]; then
        . /etc/os-release
        case "$ID" in
            ubuntu|debian)
                sudo apt update
                sudo apt install -y git mysql-server
                ;;
            fedora|centos|rhel)
                sudo dnf install -y git mysql-server
                ;;
            arch)
                sudo pacman -Syu --noconfirm git mysql
                ;;
            *)
                printf "Erro: Distribuição Linux '%s' não suportada para instalação automática.\n" "$ID" >&2
                return 1
                ;;
        esac
    else
        printf "Erro: Não foi possível determinar a distribuição Linux.\n" >&2
        return 1
    fi
}

# Função para configurar o MySQL
configure_mysql() {
    printf "Configurando MySQL...\n"
    sudo systemctl start mysql || sudo systemctl start mariadb

    printf "Criando usuário '%s' e banco de dados '%s'...\n" "$MYSQL_USER" "$DATABASE_NAME"
    mysql -u root -p"$MYSQL_ROOT_PASSWORD" <<-EOSQL
        CREATE USER IF NOT EXISTS '$MYSQL_USER'@'localhost' IDENTIFIED BY '$MYSQL_USER_PASSWORD';
        GRANT ALL PRIVILEGES ON *.* TO '$MYSQL_USER'@'localhost';
        FLUSH PRIVILEGES;
        CREATE DATABASE IF NOT EXISTS $DATABASE_NAME;
EOSQL
}

clone_repository() {
    printf "Clonando repositório...\n"
    if [[ -d "$WORK_DIR" ]]; then
        printf "Diretório de trabalho já existe. Limpando...\n"
        rm -rf "$WORK_DIR"
    fi

    git clone --branch "$BRANCH" "$REPO_URL" "$WORK_DIR"
}

import_database() {
    printf "Importando banco de dados...\n"
    local db_file_path="$WORK_DIR/$DB_FILE"
    if [[ ! -f "$db_file_path" ]]; then
        printf "Erro: Arquivo '%s' não encontrado no repositório.\n" "$DB_FILE" >&2
        return 1
    fi

    mysql -u root -p"$MYSQL_ROOT_PASSWORD" "$DATABASE_NAME" < "$db_file_path"
    printf "Banco de dados importado com sucesso.\n"
}

main() {
    install_dependencies
    configure_mysql
    clone_repository
    import_database
}

main "$@"
