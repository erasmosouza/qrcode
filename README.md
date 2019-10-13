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
>docker build . -t dockerdemo

Checar se a criação foi com sucesso:
>docker images

Agora, vamos rodar o docker:
>docker run -p 3080:8080 dockerdemo

Para saber se tudo deu certo, vamos chamar nossa api pela porta que exposta do docker (3080):
>$ curl http://localhost:3080/greeting?name=Docker  
{"id":1,"message":"Hello, Docker"}