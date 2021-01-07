package com.user.crud;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		Date hora = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/hh");
		String stringFecha = sdf.format(new Date());
		//String horavieja = "Thu Jan 07 01:00:00 COT 2021";
		
		SpringApplication.run(CrudApplication.class, args);
		System.out.println("Welcome my app");
		System.out.println(stringFecha);
		//Lógica para hora menor
		
		
		
		
		
	}

}
