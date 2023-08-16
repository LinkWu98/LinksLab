package cn.link.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * http://localhost:8080/swagger/v2/api-docs
 * ip:port/工程名/v2/api-docs
 * 访问json格式的参数
 */
@SpringBootApplication
@EnableSwagger2
public class SwaggersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggersApplication.class, args);
    }

}
