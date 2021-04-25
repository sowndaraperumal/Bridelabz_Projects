package com.services;

import com.model.Student;
import com.repository.StatementInterface;
import com.repository.StatementImplement;

public class ServiceImpl implements ServiseInter{

	@Override
	public void serviceInterface(Student student) {

		StatementImplement  baseRespository=new StatementInterface();
		baseRespository.createStudent(student);
		
	}

}
