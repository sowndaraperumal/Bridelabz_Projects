package com.bridgelabz.sturcturalpattern;

public class MarkObjectImple implements PerfectInterface{
Average average=new Average();
	@Override
	public Student tenMark() {
         Student student=average.getMark();
		return convert(student,5);
	}

	@Override
	public Student tweleveMark() {
Student student=average.getMark();
		return convert(student, 12);
	}

	@Override
	public Student degreeMark() {

		Student student=average.getMark();
		return convert(student, 10);
	}
	Student  convert(Student student,int i) {
		return new Student(student.getMarks()/i);
}

}
