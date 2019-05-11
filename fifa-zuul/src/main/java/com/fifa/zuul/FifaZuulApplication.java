package com.fifa.zuul;

import com.fifa.zuul.filters.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableFeignClients
public class FifaZuulApplication {

  public static void main(String[] args) {
    SpringApplication.run(FifaZuulApplication.class, args);
  }

  @Bean
  public PreFilter preFilter() {
    return new PreFilter();
  }

}

