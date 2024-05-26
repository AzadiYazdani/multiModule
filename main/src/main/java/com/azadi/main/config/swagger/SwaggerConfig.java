package com.azadi.main.config.swagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;


@Configuration("multi-module-SwaggerConfig")
@EnableSwagger2
@PropertySource("classpath:application.yml")
@Conditional(SwaggerEnabledCondition.class)
public class SwaggerConfig {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${swagger.api.title}")
    private String apiTitle;

    @Value("${swagger.api.description}")
    private String apiDescription;

    @PostConstruct
    private void InitLog() {
        logger.info("Swagger enabled");
    }

    @Bean
    public Docket customImplementation() {
//        OAuthBuilder oAuthBuilder = new OAuthBuilder();
//        SecurityScheme oAuth = oAuthBuilder.name("auth.azadi.modern")
//                .grantTypes(Arrays.asList(clientCredentialsGrant))
//                .scopes(Arrays.asList(scopes))
//                .build();
//
//        SecurityContext keycloak = SecurityContext.builder()
//                .securityReferences(
//                        Arrays.asList(new SecurityReference("auth.azadi.modern", scopes))
//                )
//                .forPaths(PathSelectors.any())
//                .build();


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .globalOperationParameters(parameterBuildersList)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.azadi"))
                .paths(PathSelectors.any())
                .build()
//                .directModelSubstitute(LocalDate.class, String.class)
//                .directModelSubstitute(LocalDateTime.class, String.class)
////                .securitySchemes(Arrays.asList(oAuth))
////                .securityContexts(Arrays.asList(keycloak))
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(apiTitle)
                .description(apiDescription)
//                .version(buildProperties != null ? buildProperties.getVersion() : null)
                .build();
    }


    @Bean
    @Profile("dev")
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
}

