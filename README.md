*Tested with Java 17 and SpringBoot 2.7.6*

## STEP 1
**Add the dependency _Springfox Starter_:** </br>
```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
```

## STEP 2
**Add the following property in application.properties file**
```
spring.mvc.pathmatch.matching-strategy=ant-path-matcher
```

## STEP 3 (optional)
**Create SwaggerConfig class**
```
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
                .build();
    }

}
```

## STEP 4
**Check Swagger UI website**
Run your application and acces the following url:
```
host:port/swagger-ui/index.html
http://localhost:8080/swagger-ui/index.html
```