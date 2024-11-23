#!/bin/bash

set -o errexit
set -o nounset
set -o pipefail

# Variáveis globais
REPO_URL="https://github.com/Grupo-6-Projeto-Volt/BackEnd.git"
BRANCH="main"
ENV_VARS="DB_DRIVER=com.mysql.cj.jdbc.Driver;DB_PASSWORD=sptech;DB_URL=jdbc:mysql://localhost:3306/bd_volt;DB_USERNAME=sptech;JWT_SECRET=1D08EWyxTWMzgPWZL2FNcQjOSfLLyrDISspdBkWFxJUOadpcNNblmbNT1kF2zR22AWcMUF1HPMkCSApDGyiO6eFqfwCFPxd6"
WORK_DIR="/tmp/backend-deploy"
MAVEN_BINARY="mvn"

# Função para instalar dependências
install_dependencies() {
    printf "Instalando dependências...\n"
    
    if [[ -f /etc/os-release ]]; then
        . /etc/os-release
        case "$ID" in
            ubuntu|debian)
                sudo apt update
                sudo apt install -y git openjdk-17-jdk maven
                ;;
            fedora|centos|rhel)
                sudo dnf install -y git java-17-openjdk maven
                ;;
            arch)
                sudo pacman -Syu --noconfirm git jdk17-openjdk maven
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

    for cmd in git java "$MAVEN_BINARY"; do
        if ! command -v "$cmd" &>/dev/null; then
            printf "Erro: '%s' não está instalado.\n" "$cmd" >&2
            return 1
        fi
    done
}

# Função para configurar o ambiente
setup_environment() {
    printf "Configurando variáveis de ambiente...\n"
    export $ENV_VARS
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

# Função para construir o projeto com Maven
build_project() {
    printf "Construindo o projeto com Maven...\n"
    cd "$WORK_DIR"
    "$MAVEN_BINARY" clean package -Dmaven.test.skip=true
}

# Função para encontrar o JAR gerado
find_jar() {
    printf "Procurando o arquivo JAR gerado...\n"
    
    local jar_file
    jar_file=$(find target -type f -name "*.jar" | head -n 1)

    if [[ -z "$jar_file" ]]; then
        printf "Erro: Nenhum arquivo JAR foi encontrado.\n" >&2
        return 1
    fi

    printf "Arquivo JAR encontrado: %s\n" "$jar_file"
    echo "$jar_file"
}

run_application() {
    local jar_file="$1"
    printf "Executando a aplicação...\n"
    java -jar "$jar_file"
}

main() {
    install_dependencies
    validate_dependencies
    setup_environment
    clone_repository
    build_project

    local jar_file
    jar_file=$(find_jar)

    run_application "$jar_file"
}

main "$@"
