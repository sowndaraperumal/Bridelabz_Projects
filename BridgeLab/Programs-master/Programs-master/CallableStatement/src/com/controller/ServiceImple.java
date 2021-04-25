package com.controller;

import com.model.Student;
import com.repository.CallableImplementation;
import com.repository.CallableInterface;
import com.services.CallableServiceInterface;

public class ServiceImple implements CallableServiceInterface{

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		CallableInterface baseRespositoryInterface=new CallableImplementation();
		baseRespositoryInterface.insertStudent(student);
	}
	

}
