package io.jingwei.basis.rest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"io.jingwei.basis"})
@SpringBootApplication
public class BasisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasisApplication.class, args);
    }
}
