package com.shenjugroup.tool.javacrudtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CRUDToolApplication {
	public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(CRUDToolApplication.class, args);
        System.out.println("started...");
    }
}
