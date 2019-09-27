package com.microservice.consult.app.models;

import com.microservice.consult.app.models.documents.Course;
import com.microservice.consult.app.models.documents.Professor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseProfessor {

	private Course course;
	private Professor professor;
}
