package com.interfaceimplementation;

import java.util.ArrayList;

import com.model.Doctor;
import com.model.Patient;

public interface CliniciEntry {

//void addPatientDetail();
//void addDoctorDetail();
void appointmentDetail();	
ArrayList<Patient> addPatient();
ArrayList<Patient> editPatient(ArrayList<Patient> patientlist);
ArrayList<Patient> deletePatient(ArrayList<Patient> patientlist);
ArrayList<Doctor> addDoctor();
ArrayList<Doctor> editDoctor(ArrayList<Doctor>doctorlist);
ArrayList<Doctor> deleteDoctor(ArrayList<Doctor>doctorlist);
void savePatient(ArrayList<Patient> patientlist);
void saveDoctor(ArrayList<Doctor>doctorlist);
boolean patientValidtly(int id);
boolean doctorValidtly(int id);
void fixAppointment(Doctor doctor,Patient patient );


}
