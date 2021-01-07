package com.user.crud;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) throws ParseException {
		Date hora = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/H");
		String horafinvieja= sdf.format(hora);
		Date dhorarini = sdf.parse("2021/01/07/01");
		String horaini = sdf.format(dhorarini);
		//String horaini = sdf.format("2021/01/07/01");
		//String horavieja = "Thu Jan 07 01:00:00 COT 2021";
		
		SpringApplication.run(CrudApplication.class, args);
		System.out.println(hora );
		//Lógica para hora menor
		//si la (horaini >  horafinvieja) || (horafin <  horainivieja) SI SE PUEDE HACER LA RESERVA 
		int ihoraini = Integer.parseInt(horaini.substring(11));
		int ihorafinvieja = Integer.parseInt(horafinvieja.substring(11));
		System.out.println(ihorafinvieja - ihoraini);
		
		
		
	}

}
