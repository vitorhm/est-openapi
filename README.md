Esse projeto utiliza o **Spring Doc Open API** e as anotações do **Swagger** para gerar a documentação da API. 

O **Spring Doc** contém o editor do **Swagger** embarcado que fica automaticamente disponível ao subir nossa API. 
Ele também gera algumas documentações do **Swagger** automaticamente a partir das anotações e configurações do **Spring**.

##  Stack
- Java
- Spring Boot
- Spring MVC
- Spring Doc Open API
- Swagger

## Run
- Use `docker build . -t estopenapi` to build the image;
- Use `docker run -p 8080:8080 estopenapi` to run the image;

## Swagger UI
- Acesse `http://localhost:8080/swagger-ui/index.html` para abrir o Swagger UI;

## Demo oficial
- [springdoc-openapi-demos](https://github.com/springdoc/springdoc-openapi-demos)