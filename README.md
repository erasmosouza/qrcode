# kotlin-rest-docker
Segue uma simples implementação utilizando:
- kotlin
- Springboot
- Swagger
- Docker
- gradle

## Clonar o projeto
> git clone [URL_GIT]

## Build and running
Build:
>./gradlew build

Test it:
>./gradlew test

Agora que temos o jar da aplicação, vamos criar o docker:
>docker build . -t demo-api:1.0

Checar se a criação foi com sucesso:
>docker images

Agora, vamos rodar o docker:
>docker run -p 8080:8080 demo-api:1.0

Para saber se tudo deu certo, vamos chamar nossa api pela porta exposta do docker (8080):
>$ curl http://localhost:8080/check?name=Docker  
{"id":1,"message":"Hello, Docker"}