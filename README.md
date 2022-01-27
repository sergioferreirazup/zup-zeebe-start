# zup-zeebe-start
### Projeto base para utilização de Zeebe com Spring Boot
---
## Componentes/Funcionalidades

- Web Api
- Flyway
- Postgres Datasource
- Zeebe Configuration
- Zeebe Deployment
- Zeebe Starter
- Zeebe Worker
---
## Pré-requisitos
- Java 11
- Maven
- Docker/-compose
---
## Inicialização da Infraestrutura

```shell
$ cd infrastructure
$ docker-compose up -d
```
---

## Serviços

Serviço | URL | Acesso
------------ | ------------- | -------------
Application | [`http://localhost:8000`](http://localhost:8000) | `<no-auth>`
Operate | [`http://localhost:8080`](http://localhost:8080) | `demo:demo`
Grafana | [`http://localhost:3000`](http://localhost:3000) | `admin:pass`
Postgres | [`http://localhost:5432`](http://localhost:5432) | `zeebe_poc:zeebe_poc`
Elasticsearch | [`http://localhost:9200`](http://localhost:9200) | `<no-auth>`
---
## Demonstração
```curl
curl -X POST http://localhost:8000/demo
```