package me;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient

public class Application8001 {
    public static void main(String[] args) {
        SpringApplication.run(Application8001.class,args);
    }

     @Bean
   public ServletRegistrationBean hystrixMetricsStreamServlet(){
       ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
            servletRegistrationBean.addUrlMappings("/actuator/hystrix.stream");
            return servletRegistrationBean;
   }
}

