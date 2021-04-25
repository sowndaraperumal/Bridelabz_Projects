package com.model;

import java.time.LocalTime;

public class Appointment {
/*public Patient patient;
public Doctor doctor;
public Patient getPatient() {
	return patient;
}
public void setPatient(Patient patient) {
	this.patient = patient;
}
public Doctor getDoctor() {
	return doctor;
}
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
*/
	private int patientID;
	private int  doctorId;
	private String patientName;
	private String doctorName;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	private String specialization;
	private String time;
	
	public int  getPatientID() {
		return patientID;
	}
	public void setPatientID(int  patientID) {
		this.patientID = patientID;
	}
	public int getDoctorId() {
		return doctorId;
	}
	@Override
	public String toString() {
		return "Appointment [patientID=" + patientID + ", doctorId=" + doctorId + ", patientName=" + patientName
				+ ", doctorName=" + doctorName + ", specialization=" + specialization +", time="
				+ time + "]";
	}
	public void setDoctorId(int i) {
		this.doctorId = i;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
	
	
	
	
	
	
}
