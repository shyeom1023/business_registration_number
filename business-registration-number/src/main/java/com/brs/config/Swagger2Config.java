package com.brs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swagger2Config {

	 @Bean
	    public Docket swagger() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .ignoredParameterTypes(java.sql.Date.class)
	                .forCodeGeneration(true)
	                .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.any())
	                .build()
	                .apiInfo(apiInfo())
	                .enable(true);
	    }

	    private ApiInfo apiInfo(){
	        return new ApiInfoBuilder()
	                .title("국세청 사업자등록 조회 API")
	                .description("테스트 API 상세소개 및 사용법 등")
	                .version("1.0")
	                .build();
	    }

}
