package me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Application9001 {
    public static void main(String[] args) {
        SpringApplication.run(Application9001.class,args);
    }
}
