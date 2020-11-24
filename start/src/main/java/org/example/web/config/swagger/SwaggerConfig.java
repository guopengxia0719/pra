//package org.example.web.config.swagger;
//
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    /** 是否开启swagger */
//    @Value("${swagger.enabled}")
//    private boolean enabled;
//
//    @Bean
//    public Docket createRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .enable(enabled)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("练习管理系统")
//                .description("用于自学创建")
//                .contact(new Contact("xxx兴趣运行点",null,null))
//                .version("版本号：1.0")
//                .build();
//    }
//}
