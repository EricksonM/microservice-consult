package com.microservice.consult.app.models.documents;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class Professor{

	private String id;
	private String firstName;
	private String lastName;
	private String gender;
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate birthdayDate;

	
}
