package me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application8080 {


    public static void main(String[] args) {
        SpringApplication.run(Application8080.class,args);
    }
}
