# email_api

## 🔍 Sobre 
É uma Api Rest onde você pode enviar email através do serviço da Amazon AWS SES(Simple Email Service).

## ❗ Atenção
É importante que os campos seu-email e sua-senha sejam preenchidos no arquivo application.properties. O campo da senha deve ser preenchido com a sua senha de aplicativo do seu email.

## 🤖 Tecnologias

- Java 17
- Spring Boot 3
- Maven

## 📖 Documentação

A documentação foi feita utilizando a biblioteca SpringDoc, que contem o Swagger UI. Você pode usar o Swagger UI para testar os endpoints mencionados no tópico abaixo.
Para acessá-la insira a URL: ``` /swagger-ui/index.html ```

## 👀 Endpoints

### /send-email
É neste endpoint onde você vai enviar os emails. A requisição deve ser construida da seguinte forma:
```
{
	"from":"seu.email@gmail.com",
	"to":"para.qualquer@gmail.com",
	"subject":"Olá",
	"text":"Olá, boa tarde!!"
}
```

## 🏃 Como executar o projeto


### 📍 Requisitos para execução

- Java 17

*# clone o repositório*

```
git clone https://github.com/CrisDeniz/email_api
```

*# vá até a pasta do projeto*

```
cd email_api
```

*# execute o projeto*

```
mvn spring-boot:run
```

## Autor

Cristian Deniz

https://www.linkedin.com/in/cristian-deniz/
