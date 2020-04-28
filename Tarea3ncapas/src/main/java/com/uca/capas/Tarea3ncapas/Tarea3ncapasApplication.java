package com.uca.capas.Tarea3ncapas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.uca.capas.controller"))
@ComponentScan(basePackages=("com.uca.capas..domain"))
public class Tarea3ncapasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tarea3ncapasApplication.class, args);
	}

}
