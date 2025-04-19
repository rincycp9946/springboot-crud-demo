# springboot-crud-demo
![demo](https://github.com/user-attachments/assets/49f1a043-9306-48e8-8994-39c3b4414c52)

Simple crud Springboot applocation using H2 DB
Spring Boot CRUD demo is demonstrating how to implement simple CRUD operations with a Product entity.

What's inside
This project is based on the Spring Boot project and uses these packages :

Maven
Spring Core
Spring Data (Hibernate & H2)
Spring MVC (Tomcat)
Thymleaf
demo

Installation
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

Database configuration
#logging.level.org.h2.server: DEBUG
# H2 Database config
spring.datasource.url=jdbc:h2:file:C:/Users/Rincy CP/test;DB_CLOSE_DELAY=-1;AUTO_SERVER=TRUE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=sa
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.hibernate.ddl-auto=update

Note: spring.datasource.url=jdbc:h2:file:C:/Users/Rincy CP/test;DB_CLOSE_DELAY=-1;AUTO_SERVER=TRUE
In this Line change Rincy CP to your user name.
