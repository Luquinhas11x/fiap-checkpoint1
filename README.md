# Checkpoint 1

Aplicação Java com container para primeria avaliação do 3ºSIT


## Pré-requisitos

- Java 17+
- Docker 
- Apache Maven
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

git clone https://github.com/acnaweb/ping.git

#### Instalação

```
git clone https://github.com/Luquinhas11x/fiap-checkpoint1.git
```

## Execução

### Maven
* Limpar o diretório de saída do projeto Maven

```
mvn clean
```

* Compilar o projeto Maven

```
mvn package
```

#### Docker
* Criar nova imagem Docker

```
docker build -t fiap-checkpoint1
```

* Executar container

spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> ping
```

## Container Registry


#### Docker Hub

* Login

```
docker login
```

* Criar imagem pronta para upload (método 1 - criando nova imagem)

```
docker build -t fiap-checkpoint1 .
```

* Criar imagem pronta para upload (método 2 - renomeando imagem existente)

```
docker tag fiap-checkpoint1 ludushark/fiap-checkpoint1
```

* Upload de imagem para o Docker Hub

```
docker push ludushark/fiap-checkpoint1
```

#### Navegação
- Base

http://localhost:8080

- Endpoint que retorna string "Pong"

http://localhost:8080/ping

## Features (Funcionalidades)

- Múltiplos profiles

## Contatos

- Lucas Santana de Paula - lukinha11x@gmail.com

## Referencias

 - [GitHub com as intruções](https://github.com/acnaweb/microservices-2024/tree/main)