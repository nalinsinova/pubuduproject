package net.pubuduwebapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SpringBootApplication
public class HellospringbootApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(HellospringbootApplication.class, args);
	}
}
