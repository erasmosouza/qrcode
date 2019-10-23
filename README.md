# QRCode
Segue uma simples implementação utilizando:
- kotlin
- Springboot
- Swagger
- Docker
- gradle
- xzing

## Clonar o projeto
> git clone [URL_GIT]

## Build and running
Build:
>./gradlew build

Test it:
>./gradlew test

Agora que temos o jar da aplicação, vamos criar o docker:
>docker build . -t qrcode-service:1.0

Checar se a criação foi com sucesso:
>docker images

Agora, vamos rodar o docker:
>docker run -p 8080:8080 qrcode-service:1.0

Para saber se tudo deu certo, basta abrir um browser e chamar a url com os parametros:
>http://localhost:8080/qrcode/img?content=HelloQrCode&size=500

Detalhamento dos paramentros:
- **content**: É o texto que você que seja codificado no QrCode
- **size**: Especificação do tamando da imagem do QrCode que será gerado 