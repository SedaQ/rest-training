# Course: Server side implementation of REST architecture
This project shows the implementation of REST architecture using Spring Boot and Spring Data JPA with QueryDSL. For mapping Entities to Dtos is used the ModelMapper framework (If performance matters consider MapStruct framework). Documentation for that REST API is implemented in the Swagger framework.

## Authors

email | Name 
------------ | -------------
pavelseda@email.cz | Šeda Pavel

## Starting up Project (NOT implemented yet)
You don't have to install Java, Maven, Tomcat, etc. to your local development environment. All you need is [Vagrant installed] (http://docs.ansible.com/ansible/latest/guide_vagrant.html).

```
vagrant up
```

Now check that documentation on the following section is reachable. 
NOTE: This command will also insert some testing data to data storages.

## Documentation 
Documentation is done in Swagger framework. It is possible to reach it on the following page:

```
~/rest-training/api/v1/swagger-ui.html
```

e.g. on localhost it should be:

```
http://localhost:8080/rest-training/api/v1/swagger-ui.html
```

ADOC version of REST API documentation is generated here: (https://github.com/SedaQ/rest-training/blob/master/doc-files/ApiDocumentation.adoc)

PDF version of REST API documentation is generated here: (https://github.com/SedaQ/rest-training/blob/master/doc-files/ApiDocumentation.pdf)

NOTE: please note that client for that REST API could be generated using [Swagger codegen] (https://swagger.io/tools/swagger-codegen/). It is crucial to annotate each RestController method properly!

### 2. Properties file
```properties

# Environment DEV or PROD
### DEV environment does not need kypo2-user-and-group project but assign authority as GUEST by default
spring.profiles.active=DEV 


server.port={port for service}
server.servlet.context-path=/{context path for service}

# you can add more scopes according to settings from step 1.

# DATASOURCE
spring.datasource.url=jdbc:postgresql://{url to DB}
spring.datasource.username={user in DB}
spring.datasource.password={password for user to DB}
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect

# FLYWAY
spring.flyway.url=jdbc:postgresql://{url to DB}
spring.flyway.user={user in DB}
spring.flyway.password={password for user to DB}
spring.flyway.table=schema_version

# Logging
logging.level.org.mitre.openid.connect.binder.service=DEBUG
logging.level.root= WARN
logging.level.org.springframework.security= DEBUG
logging.level.org.springframework.web= ERROR
logging.level.org.apache.commons.dbcp2= DEBUG  
logging.level.org.hibernate=ERROR
logging.file = logs/rest-training.log  

# Jackson (e.g. converting Java 8 dates to ISO format
spring.jackson.serialization.write_dates_as_timestamps=false 
#spring.jackson.property-naming-strategy=com.fasterxml.jackson.databind.PropertyNamingStrategy.SNAKE_CASE

# to fix: Method jmxMBeanExporter in org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointAutoConfiguration required a single bean, but 2 were found: (objMapperESClient,objectMapperForRestAPI)
spring.jmx.enabled = false

```

## 3. Database migration
Prerequisities running PostgreSQL and created database named 'training' with schema 'public'.
To migrate database data it is necessary to run this command:

```
$ mvn flyway:migrate -Djdbc.url=jdbc:postgresql://{url to DB}/rest-training -Djdbc.username={username in DB} -Djdbc.password={password to DB}
```
e.g.:
```
$ mvn flyway:migrate -Djdbc.url=jdbc:postgresql://localhost:5432/rest-training -Djdbc.username=postgres -Djdbc.password=postgre

```

NOTE: This script must be run in [persistence] (https://github.com/SedaQ/rest-training/tree/master/persistence) module.

## Installing project
Installing by maven:

```
mvn clean install
```

## Run project
In Intellij Idea:
1. Click on "**Run**" -> "**Edit configurations**".
2. Choose "**RestConfigTraining**" configuration.
3. Add into "**Program arguments**" --path.to.config.file="{path to your config properties}".
4. Run RestConfigTraining

## Used Technologies
The project was built and tested with these technologies, so if you have any unexpected troubles let us know.

```
Maven         : 3.3.9
Java          : 1.8.0_144, vendor: Oracle Corporation
Spring boot   : 2.0.6.RELEASE
Swagger       : 2.8.0
Hibernate     : 5.2.8.Final
Jackson       : 2.9.0
Tomcat        : 8
PostgreSQL    : 9.5
```

