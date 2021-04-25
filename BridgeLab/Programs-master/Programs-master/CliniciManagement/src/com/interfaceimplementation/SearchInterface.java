package com.interfaceimplementation;

import java.util.ArrayList;

import com.model.Doctor;
import com.model.Patient;

public interface SearchInterface {

	void searchByPatientName(ArrayList<Patient>patientlist);
	void searchByDoctorName(ArrayList<Doctor>doctorlist);
	void searchByDoctorId(ArrayList<Doctor>doctorlist);
	Patient searchByPatientId(int patientId,ArrayList<Patient>patientlist);
	void searchByDoctorSpecialization(ArrayList<Doctor>doctorlist);
	Doctor searchByAvability(int doctorId,ArrayList<Doctor>doctorlist);
	
	void searchByPopularity(ArrayList<Doctor>doctorlist);
	
	void checkAvability(ArrayList<Doctor>doctorlist);
}
