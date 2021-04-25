package com.bridgelabz.sturcturalpattern;

public class MarkClassImple extends Average implements PerfectInterface {

	
	
	@Override
	public Student tenMark() {
		Student student=getMark();
		return convert(student,5);
		
		
	}

	@Override
	public Student tweleveMark() {

		Student student=getMark();
		return convert(student,12);
		
	}

	@Override
	public Student degreeMark() {

		Student student=getMark();
		return convert(student,10);
	}
	Student  convert(Student student,int i) {
			return new Student(student.getMarks()/i);
	}

}
