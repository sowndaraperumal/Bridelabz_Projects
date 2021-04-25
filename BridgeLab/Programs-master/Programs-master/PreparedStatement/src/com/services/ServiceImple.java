package com.services;

import com.model.Student;
import com.respository.PerparedStatementInterface;
import com.respository.PerparedImplementation;

public class ServiceImple  implements ServiceInter{

	@Override
	public void serviceInterface(Student student) {
PerparedStatementInterface baseRespository=new PerparedImplementation();
		baseRespository.createStudent(student);
	}

}
