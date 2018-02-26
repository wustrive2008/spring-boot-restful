package com.wubaoguo.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
	
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wubaoguo.springboot.controller"))
                .paths(PathSelectors.any())
                .build();
    }
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot示例项目")
                .description("更多java项目请关注：https://github.com/wustrive2008")
                .termsOfServiceUrl("http://wubaoguo.com")
                .contact("wustrive_2008")
                .version("1.0")
                .build();
    }
}
