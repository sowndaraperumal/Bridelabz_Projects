
package com.model;

public class Doctor {
@Override
	public String toString() {
		return "Doctor [name=" + name + ", specialization=" + specialization + ", avability=" + avability + ", id=" + id
				+ ", numbeOfPatient=" + numbeOfPatient + "]";
	}
private String name;
private String specialization;

private String avability;

private  int id;
private int numbeOfPatient=0;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getAvability() {
	return avability;
}
public void setAvability(String avability) {
	this.avability = avability;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNumbeOfPatient() {
	return numbeOfPatient;
}
public void setNumbeOfPatient(int numbeOfPatient) {
	this.numbeOfPatient = numbeOfPatient;
}

}
