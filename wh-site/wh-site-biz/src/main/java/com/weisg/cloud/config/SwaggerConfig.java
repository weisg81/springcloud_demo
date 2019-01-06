package com.weisg.cloud.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description 这个类作用是什么
 * Author WEISANGENG
 * Date 2018/12/30
 **/
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name ="enabled" ,prefix = "swagger",havingValue = "true",matchIfMissing = false)
//@Profile({"dev","test"})
public class SwaggerConfig{
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.weisg.cloud.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("weisg81 of githup")
                .description("weisg of cloud demo")
                .termsOfServiceUrl("https://github.com/weisg81")
                .contact(new Contact("weisg81","https://github.com/weisg81","weisangeng@126.com"))
                .version("1.0")
                .build();
    }

    /*@Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/api-docs","/swagger-ui.html");
    }*/
}
