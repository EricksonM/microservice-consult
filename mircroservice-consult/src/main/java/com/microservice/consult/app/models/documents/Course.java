package com.microservice.consult.app.models.documents;

import lombok.Data;

@Data
public class Course{

	private String id;
	private String name;
	private Integer min;
	private String idProfessor;

}
