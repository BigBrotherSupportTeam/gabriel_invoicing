package com.brother.support;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.brother.support.mapper")
@SpringBootApplication
public class GabrielInvoicingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GabrielInvoicingApplication.class, args);
    }

}
