package ru.func.takiwadai.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author func 22.04.2020
 * @project Takiwadai
 */
@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    private static final int ONE_YEAR = 365 * 24 * 60 * 60;

    @Value("${upload.path}")
    private String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/assets/")
                .setCachePeriod(ONE_YEAR);
        registry.addResourceHandler("/favicon.ico")
                .addResourceLocations("classpath:/assets/favicon.ico")
                .setCachePeriod(ONE_YEAR);
        // При переходе на linux заменить на file://
        registry.addResourceHandler("/components/**")
                .addResourceLocations("file:///" + uploadPath + "/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}
