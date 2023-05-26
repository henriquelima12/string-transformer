# string-transformer

## Manual para execução:

### Requisitos:
* IDE (Eclipse, IntelliJ, etc...)
* Java 17
* Maven 3.9.2
* MySQL 8.0.33
* HTTP Client (Postman, Insomnia, etc...)

*Obs: Antes de executar, criar um novo banco de dados chamado "db", com nome de usuario "root" e senha "root"

### Endpoints da aplicação

* salvar string e obtê-la invertida:
#### POST http://localhost:8081/strings/{string}
