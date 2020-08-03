package me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
public class Applicationfeign80 {

    public static void main(String[] args) {
        SpringApplication.run(Applicationfeign80.class,args);
    }
}
