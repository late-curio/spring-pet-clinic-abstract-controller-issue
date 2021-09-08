# Spring PetClinic Sample Application

This sample has been modified to reproduce an issue for NR1 Java Agent.

[Incorrect Transaction Name with AbstractController @RequestMapping #410](https://github.com/newrelic/newrelic-java-agent/issues/410)

## Reproducing issue with transaction names in NR1

After starting app as defined below or in IDE with New Relic Agent attached, hit these endpoints

`GET http://localhost:8080/vets`

`GET http://localhost:8080/vets/list`

`GET http://localhost:8080/welcome`

`GET http://localhost:8080/welcome/html`

`GET http://localhost:8080/owners`

`GET http://localhost:8080/owners/new`

![Reproduction](nr1-transactions.png)

```
git clone https://github.com/spring-projects/spring-petclinic.git
cd spring-petclinic
./mvnw package
java -jar target/*.jar
```

Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):

```
./mvnw spring-boot:run
```
