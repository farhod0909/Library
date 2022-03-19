package com.example.library.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

public class SwaggerConfig  {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);

    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Mobiler.uz || Online shop", "Online market", "API v 1.0", "web, android, iOS", new Contact("Mobilers group", "t.me/nimadir", "no@mail.com"), "License of API", "no url", Collections.emptyList());
        return apiInfo;
    }
}
