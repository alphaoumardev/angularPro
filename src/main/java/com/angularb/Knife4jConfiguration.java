package com.angularb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration
{
    @Bean(value = "SpringBoot-Angular-Demo-Api")
    public Docket cloudMallApi()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("The api documentation")
                        .description("The documentation")
                        .termsOfServiceUrl("https://github.com/alphaoumardev/angularPro.git")
                        .version("1.0")
                        .build())
                .groupName("2.0 version")
                .select()
                //Adding the controller package
                .apis(RequestHandlerSelectors.basePackage("com.angularb.controllers"))
                .paths(PathSelectors.any())
                .build();
    }
}
