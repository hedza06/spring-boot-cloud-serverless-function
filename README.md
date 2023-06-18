## Spring Boot Cloud Functions Starter
This project demonstrates usage of Spring Boot Cloud Functions.
It uses Spring Cloud Function project which has the following goals:
- Promote the implementation of business logic via functions
- Decouple the development lifecycle of business logic from any specific runtime target so that the same code can run 
as a web endpoint, a stream processor, or a task
- Support a uniform programming model across serverless providers, as  well as the ability to run standalone
- Enable Spring Boot features (auto-configuration, dependency injection, metrics) on serverless providers

You can customize and extend this project according to your specific requirements.


## Organizing Code
Spring Boot offers various ways for organizing your code. 
In this example, the code is organized on the following way:
- **config**: consists of `CloudFunctionConfiguration` class which registers all Cloud Functions in this project
- **register**: package (read module) consists of services which handle this specific business logic. In this case, 
logic covers user registration process
- **order**: package (read module) consists of services which handle this specific business logic. In this case, logic
covers food ordering process


## How to test?
One powerful feature of Spring Cloud Function project is that allow us to consume written Cloud Functions 
as web endpoints.

Prepared HTTP examples for all functions are located in `http` directory on 
root project.


## Roadmap
- Deploy those CFs on AWS Cloud Platform
- Deploy those CFs on Google Cloud Platform (GCP)


## Useful links
- https://cloud.spring.io/spring-cloud-function/reference/html/spring-cloud-function.html#_introduction
- https://www.smartwavesa.com/blog-articles/spring-functions/
- https://www.youtube.com/watch?v=bxK4GscuVgs&ab_channel=DanVega


## Contribution/Suggestions
If someone is interested in contribution or have some suggestions please contact me on email hedzaprog@gmail.com.


## Author
Heril Muratović  
Software Engineer

Mobile/Viber/WhatsUp: +382 69 657 962  
Email: hedzaprog@gmail.com  
Skype: hedza06  
Twitter: herilmuratovic 