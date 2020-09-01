# spring-security-auth-server

Once dependency 	implementation 'org.springframework.cloud:spring-cloud-starter-oauth2' is added 
=> It generates the default password for user with username user

=> to update the defaults below config can be used
spring:
  security:
    user:
      name: username
      password: password
      
=> to skip the generation of default password add below on the application class
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })