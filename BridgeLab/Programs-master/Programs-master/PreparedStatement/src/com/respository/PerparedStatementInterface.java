package com.respository;

import com.model.Student;

public interface PerparedStatementInterface {
	void createStudent(Student student);
	void deleteStudent();
	void updateStudent();
	void readStudent();

}
