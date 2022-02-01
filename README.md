# Project Structure

| Directory          | Description                                |
|--------------------|--------------------------------------------|
| src/main/java      | Your Java Source Code                      |
| src/main/resources | Properties / config files used by your app |
| src/test/java      | Unit testing source code                   |

## Maven Wrapper files

- mvnw allows you to run a Maven project
    - No need to have Maven installed or present on your path
    - If correct version of Maven is not found on your computer
        - Automatically dowwnloads correct version and runs Maven
- Two files are provided
    - mvnw.cmd for MS Windows
        - > mvnw clean compile test
    - mvnw.sh for Linux/Mac
        - > ./mvnw clean compile test
- If you already haven Maven installed previously
    - Can ignore/delete the mvnw files

## Maven POM file

- pom.xml includes info that you entered at Spring Initializr website
- Spring Boot Starters
    - A collection of Maven dependencies
    - Saves the developer from having to list all of the individual dependencies
- Spring Boot Maven plugin
    - spring-boot-maven-plugin

## Java Source Code

### Main Spring Boot Application

| Annotation               | Description                                                                      |
|--------------------------|----------------------------------------------------------------------------------|
| @EnableAutoConfiguration | Enables Spring Boot's auto-configuration support                                 |
| @ComponentScan           | Enables component scanning of current package and recursively scans sub-packages |
| @Configuration           | Able to register extra beans with @Bean or import other configuration classes    |

### Best Practices for Component Scanning

- Place your main application class in the root package above your other packages
- This implicitly defines a base search package
    - Allows you to leverage default component scanning
    - No need to explicitly reference the base package name

Has to explicitly list packages to scan if they are not under the root folder

- Use ScanBasePackages

### Application Properties

- Can add Spring Boot properties
    - server.port = 8585 (Define port number)
    - coach.name = Mickey Mouse (Your own props)
- @Value("${coach.name}") // to access your own props in code

### Static Content

- HTML files
- CSS
- JavaScript
- images
- Only works with WAR packaging, not if packaged in JAR

### Templates

- Spring Boot includes auto-configuration for following template engines
    - FreeMaker
    - ThymeLeaf
    - Mustache

### Unit Tests

- Add Unit tests to the testing file

# Curated List of Dependencies

Spring Boot Starters

- Curated list of Maven dependencies
- Collection of dependencies grouped together
- Reduces amount of Maven configuration

## Spring Boot Starter - Web

1. spring-web
2. spring-webmvc
3. hibernate-validator
4. json
5. tomcat

| Name                         | Description                                                                           |
|------------------------------|---------------------------------------------------------------------------------------|
| spring-boot-starter-web      | Building web apps, including validation, REST. Uses Tomcat as default embedded server |
| spring-boot-starter-security | Adding Spring Security support                                                        |
| spring-boot-starter-data-jpa | Spring database support with JPA and Hibernate                                        |

- Most IDEs have a Dependency Management View
    - Easier to see which dependencies does the boot starter have

# Spring Boot Starter Parent

- Maven defaults defined in the Starter Parent
- Able to define Java version in the pom file properties tag
- Dependencies inherit version from Starter Parent
- Provides default configuration of Spring Boot plugin

# Spring Boot Dev Tools

- Automatically restarts application when code is updated
- Just add it to pom file

# Spring Boot Actuator

- Exposes endpoints to monitor and manage your application
    - Endpoints are prefixed with /actuator
    - /health
        - Checks status of application
        - Used for monitoring apps to see if the app is up or down
    - /info
        - Gives information about application
        - Default is Empty
        - Update application.properties with your app info
- Easily get DevOps functionality out of the box
- Simply add dependency to the POM file
- REST endpoints are automatically added to the application

