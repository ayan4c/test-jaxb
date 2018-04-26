package com.test.jaxb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class TestJAXBApplication extends SpringBootServletInitializer {


    public static void main(String[] args) throws Exception {
        SpringApplication sa = new SpringApplication(TestJAXBApplication.class);
        sa.run(args);
    }

}