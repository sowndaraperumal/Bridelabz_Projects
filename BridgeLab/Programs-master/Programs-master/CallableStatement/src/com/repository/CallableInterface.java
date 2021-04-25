package com.repository;

import com.model.Student;

public interface CallableInterface {
void insertStudent(Student student);
void deleteStudent();
void updateStudent();
void readStudent();

}
