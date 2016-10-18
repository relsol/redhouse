package com.redhouse.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by RelSol.Chen on 2016/9/8.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration implements EnvironmentAware {

    private final Logger log = LoggerFactory.getLogger(SwaggerConfiguration.class);
    public static final String DEFAULT_INCLUDE_PATTERN = "/user/*.*";
    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "swagger.");
    }

    @Bean
    public Docket swaggerSpringfoxDocket() {
        log.debug("Starting Swagger");
        StopWatch watch = new StopWatch();
        watch.start();
        Docket swaggerSpringMvcPlugin = new Docket(DocumentationType.SWAGGER_2)
//                .groupName("用户模块") // @Api(value="用户模块"),如果想建立多个模块，则再写一个和本方法类似的方法，不过groupName不可一致
                .apiInfo(apiInfo())
                .genericModelSubstitutes(ResponseEntity.class)
                .select()
//                .paths(PathSelectors.any()) // 适配所有的请求地址,如果匹配规则为/*/*.* 也是适配所有的地址
                .paths(regex(DEFAULT_INCLUDE_PATTERN)) // 有规则的选择适配地址
                .build();
        watch.stop();
        log.debug("Started Swagger in {} ms", watch.getTotalTimeMillis());
        return swaggerSpringMvcPlugin;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("这是个标题")
                .description("这是个描述")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("创建人")
                .version("1.0")
                .build();
    }
}
