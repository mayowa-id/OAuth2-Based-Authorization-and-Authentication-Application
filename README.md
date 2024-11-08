# OAuth2-Based-Authorization-and-Authentication-Application

TABLE OF CONTENT 
1. What is OAuth2?


1. What is OAuth2?
OAuth2 is a framewrok that lets third-party applications access your service on behalf of an end user.
It is widely used for authentiction and authorization in modern applications.

There are four components in the OAuth2 framework:

i. Resource Owner: The end-user of your application.

ii. Authorization Server: The third-party application that authenticates the user and issues an access token after successful authentication.

iii. Client: The user interface through which the user wants to access your resources. The client could be a mobile app, web app, or a desktop app. 
The client requires an access token to access your APIs.

iv. Resource Server: The server hosting the protected resources.
It validates the access token and grants access to the resources if authentication is successful.

The user, through the client, requests an access token from the authorization server. 
If authentication is successful, the client uses this token to access the protected APIs exposed by the resource server.


The first part of this project will be implementing the resource server

2. SETTING UP THE SPRINGBOOT APPLICATION 
To set up your app, navigate to Spring Initializr


Choose Gradle or Maven for the project, the Spring Boot version, and the name of the project. 
Add the following dependencies: spring-boot-starter-web and oauth2-resource-server.

Click on Generate to download the Spring Boot application and once downloaded, 
extract the zip file. You should now have a running Spring Boot application with the dependencies fully loaded.
Open IntelliJ (or any IDE of your choice) and select this project to start working.

Web Security Configuration
Firstly open application.propertiies and add the following property:

spring.security.oauth2.resourceserver.jwt.issuer-uri: ${JWT_ISSUER_URI}

Secondly, configure Spring Security 
Implementing the resource server requires Spring Security as one of the dependencies. 
No need to add it separately since the OAuth2 resource server uses Spring Security. 
Adding Spring Security in the dependencies Spring Boot enables authentication for each API
you expose. The default one is username and password-based authentication.

Since we do not want username and password-based authentication, we need to disable the auto configuration.
Go to the main class and add the following exclusion:

11/8/2024 - Will update README later today 


