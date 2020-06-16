# SOAP Web Service

This repo is to demonstrate on how to connect to SOAP client web services

## Instructions

### Spring Boot version

```
docker run -p 8080:8080 edysegura/springboot-cep
```

then

```
http://localhost:8080/v1/cep/3754000
```

### Generate a new Docker image

```
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=edysegura/springboot-cep
```

## References

Please find below the references used on these examples

### Spring Boot

- [Consuming a SOAP web service](https://spring.io/guides/gs/consuming-web-service/)
- [Different Ways to Create Spring Boot SOAP Client](https://www.devglan.com/spring-boot/spring-boot-soap-client)

### Node.js

- [How to perform SOAP requests with Node.js](https://medium.com/better-programming/how-to-perform-soap-requests-with-node-js-4a9627070eb6)
- [SOAP WebService through extension](https://medium.com/@markos12/consumindo-o-webservice-dos-correios-soap-via-extens%C3%A3o-do-1b087bf290fb)
- [Node.js how to consume SOAP XML web service](https://stackoverflow.com/a/45929815/1634092)
- [A SOAP client and server for Node.js](https://github.com/vpulim/node-soap)
