package com.brother.support;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.brother.support.mapper")
@EnableCaching
@SpringBootApplication
@EnableAspectJAutoProxy
public class GabrielInvoicingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GabrielInvoicingApplication.class, args);
    }

}
