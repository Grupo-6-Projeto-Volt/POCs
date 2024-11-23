#!/bin/bash

set -o errexit
set -o nounset
set -o pipefail

# Variáveis globais
REPO_URL="https://github.com/Grupo-6-Projeto-Volt/FrontEnd.git"
BRANCH="main"
WORK_DIR="/tmp/frontend-deploy"
CLIENT_DIR="Cliente"
ENV_FILE="$WORK_DIR/$CLIENT_DIR/.env"
API_URL="http://localhost:8080"

# Função para instalar dependências
install_dependencies() {
    printf "Instalando dependências...\n"
    if [[ -f /etc/os-release ]]; then
        . /etc/os-release
        case "$ID" in
            ubuntu|debian)
                sudo apt update
                sudo apt install -y git nodejs npm
                ;;
            fedora|centos|rhel)
                sudo dnf install -y git nodejs npm
                ;;
            arch)
                sudo pacman -Syu --noconfirm git nodejs npm
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

# Função para validar dependências
validate_dependencies() {
    printf "Validando dependências...\n"
    for cmd in git node npm; do
        if ! command -v "$cmd" &>/dev/null; then
            printf "Erro: '%s' não está instalado.\n" "$cmd" >&2
            return 1
        fi
    done
}

# Função para clonar o repositório
clone_repository() {
    printf "Clonando repositório...\n"
    if [[ -d "$WORK_DIR" ]]; then
        printf "Diretório de trabalho já existe. Limpando...\n"
        rm -rf "$WORK_DIR"
    fi

    git clone --branch "$BRANCH" "$REPO_URL" "$WORK_DIR"
}

# Função para criar o arquivo .env
create_env_file() {
    printf "Criando arquivo .env...\n"
    mkdir -p "$(dirname "$ENV_FILE")"
    printf "REACT_APP_API_URL=\"%s\"\n" "$API_URL" > "$ENV_FILE"
}

# Função para instalar dependências do projeto
install_project_dependencies() {
    printf "Instalando dependências do projeto...\n"
    cd "$WORK_DIR/$CLIENT_DIR"
    npm install
}

run_application() {
    printf "Iniciando aplicação React...\n"
    npm start
}

main() {
    install_dependencies
    validate_dependencies
    clone_repository
    create_env_file
    install_project_dependencies
    run_application
}

main "$@"
