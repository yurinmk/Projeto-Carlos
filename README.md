# Avaliação Sprint Boot (Projeto Maven)
### Ferramentas/Extensões

- ##### Java 11
- ##### Spring Dev Tools
- ##### Spring Data JPA
- ##### Spring WEB
- ##### Lombok
- ##### H2 DataBase

## Importante

> `Note: Projeto rodará na porta 8080`

## URLs e Bodys

##### GET - Listar todos os alunos
----
```sh
http://localhost:8080/api/aluno/listarAlunos
```
##### GET - Procurar aluno por nome
----
```sh
http://localhost:8080/api/aluno/procurarAluno?name=Yuri%20Christian
```
##### GET - Procurar aluno por curso
----
```sh
http://localhost:8080/api/aluno/procurarAlunoPorCurso?course=SPI
```
##### POST - Criar aluno
----
```sh
http://localhost:8080/api/aluno/criarAluno

Body
{
	"name": "string",
	"cpf": "string"
	"rg": "string",
	"address": "string",
	"course": "string"
}
```
##### PUT - Editar aluno
----
```sh
http://localhost:8080/api/aluno/editarAluno

Body
{
    "id": number,
	"name": "string",
	"cpf": "string"
	"rg": "string",
	"address": "string",
	"course": "string"
}
```

##### DELETE - Deletar aluno
----
```sh
http://localhost:8080/api/aluno/excluirAluno/1
```

## Importante

> `Note: O projeto já está criando e inserindo as informações no banco, mas por vias das dúvidas, segue...`
## Banco de Dados 

##### CREATE
----
```sh
CREATE TABLE STUDENT(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR,
    CPF VARCHAR,
    RG VARCHAR,
    ADDRESS VARCHAR,
    COURSE VARCHAR
);
```

##### INSERTS
----
```sh
INSERT INTO STUDENT (name, cpf, rg, address, course) VALUES('Yuri Christian','00000000000','000000000','Qualquer um','SPI')
INSERT INTO STUDENT (name, cpf, rg, address, course) VALUES('Ericleiton Macedo','00000000000','000000000','Qualquer um','SPI')
INSERT INTO STUDENT (name, cpf, rg, address, course) VALUES('Najla Menezes','00000000000','000000000','Qualquer um','Recursos Humanos')
INSERT INTO STUDENT (name, cpf, rg, address, course) VALUES('Romany','00000000000','000000000','Qualquer um','Engenharia')
INSERT INTO STUDENT (name, cpf, rg, address, course) VALUES('Julio M.','00000000000','000000000','Qualquer um','Sistema de Informação')
INSERT INTO STUDENT (name, cpf, rg, address, course) VALUES('Diego Christenson','00000000000','000000000','Qualquer um','DBA')
```
