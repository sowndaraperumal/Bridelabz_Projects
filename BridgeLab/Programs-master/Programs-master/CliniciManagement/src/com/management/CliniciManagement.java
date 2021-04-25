package com.management;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.StyleSheet.ListPainter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.omg.CORBA.OMGVMCID;

import com.interfaceimplementation.DisplayImplementation;
import com.interfaceimplementation.DisplayInterface;
import com.interfaceimplementation.EntryImple;
import com.interfaceimplementation.SearchImplementation;
import com.model.Doctor;
import com.model.Patient;

public class CliniciManagement {
	static Scanner scanner = new Scanner(System.in);
	static int option;
	static String say = "yes";
	static ArrayList<Patient> patientlist = new ArrayList<>();
	static ArrayList<Doctor> doctorlist = new ArrayList<>();
	static ObjectMapper mapper = new ObjectMapper();
	static EntryImple entryImple = new EntryImple();

	public static void main(String[] args) {

		EntryImple entryImple = new EntryImple();
		// String choice="yes";
		do {
			System.out.println("1.Registartion Details\n2.search \n3.Display File\n4.close");
			System.out.println("enter the choice");
			option = scanner.nextInt();
			switch (option) {
			case 1:

				System.out.println("Registartion files");
				entryCall();

				break;
			case 2:
				System.out.println("Searching");
				searchCall();
				break;
			case 3:

				System.out.println("Dispaly Details ");
				displayCall();
				break;
			case 4:
				System.out.println("appointment is closed");

			}
		} while (option < 4);

	}

	static void displayCall() {
		DisplayImplementation displayImplementation = new DisplayImplementation();
		do {

			System.out.println("1.patient details\n2.doctor details\n3.appointment details\n.4 close");
			System.out.println("enter what entry you has to do");
			option = scanner.nextInt();

			switch (option) {

			case 1:
				System.out.println("PATIENT FILE");
				displayImplementation.patientFile();
				break;
			case 2:
				System.out.println("DOCTOR FILE");
				displayImplementation.doctorFile();
				break;
			case 3:
				System.out.println("APPOINTMENT FILE");
				displayImplementation.appointment();
				break;
			case 4:
				System.out.println("close");
				break;
			}
		} while (option < 4);

	}

	static void entryCall() {

		// int option;

		do {

			System.out.println("1.patiententry\n2.doctor entry\n3.appointment ");
			System.out.println("enter what entry you has to do");
			option = scanner.nextInt();

			switch (option) {

			case 1:

				do {

					System.out.println(
							"do you want add \n1.add patient\n2.editpatient\n3.delete patient\n4.save\n.5 exits");
					option = scanner.nextInt();
					switch (option) {
					case 1:
						System.out.println("add patient");
						System.out.println(patientlist);
						patientlist = entryImple.addPatient();

						System.out.println(patientlist);
						break;
					case 2:
						System.out.println("editpatient");

						entryImple.editPatient(patientlist);
						break;
					case 3:
						entryImple.deletePatient(patientlist);
						System.out.println("delete patient");
						break;
					case 4:
						System.out.println("save and exits");
						if (patientlist.size() == 0) {
							System.out.println("file is empty");
						} else {
							System.out.println("hii" + patientlist);
							entryImple.savePatient(patientlist);
						}
						break;

					case 5:
						System.out.println("file eixt");
						break;
					}

				} while (option < 5);
				break;

			case 2:
				// String wish;

				do {

					System.out.println(
							"do you want add \n1.add doctor\n2.editdoctor\n3.delete doctor\n4.save \n5. exits");
					option = scanner.nextInt();
					switch (option) {
					case 1:
						System.out.println("add doctor");
						doctorlist = entryImple.addDoctor();

						break;
					case 2:
						System.out.println("edit doctor");
						doctorlist = entryImple.editDoctor(doctorlist);
						break;
					case 3:
						doctorlist = entryImple.deleteDoctor(doctorlist);
						System.out.println("delete doctor");
						break;
					case 4:
						System.out.println("save ");

						if (doctorlist.size() == 0) {
							System.out.println("file is empty");
						}

						else {
							entryImple.saveDoctor(doctorlist);
						}

						break;
					case 5:

						System.out.println("file eixt");
						break;
					}
				}

				while (option < 5);
				break;
			case 3:
				ObjectMapper mapper = new ObjectMapper();
				System.out.println("appointment");
				SearchImplementation searchImplementation = new SearchImplementation();
				ArrayList<Patient> listPatient = new ArrayList<>();
				ArrayList<Doctor> listDoctor = new ArrayList<>();

				try {
					listPatient = mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/patientfile.json"),
							new TypeReference<ArrayList<Patient>>() {
							});
					for (int i = 0; i < listPatient.size(); i++) {
						System.out.println(listPatient.get(i));
					}
					System.out.println();
					listDoctor = mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/doctorfile.json"),
							new TypeReference<ArrayList<Doctor>>() {
							});
					for (int i = 0; i < listDoctor.size(); i++) {
						System.out.println(listDoctor.get(i));
					}
					System.out.println();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("enter the patient id");
				int patientid = scanner.nextInt();
				System.out.println("enter the doctor id");
				int doctorid = scanner.nextInt();
				Doctor doctor = searchImplementation.searchByAvability(doctorid, listDoctor);
				System.out.println(doctor);
				Patient patient = searchImplementation.searchByPatientId(patientid, listPatient);
				System.out.println(doctor.getNumbeOfPatient());
				if (doctor.getNumbeOfPatient()<  5) {
					entryImple.fixAppointment(doctor, patient);
				} else {
					System.out.println("full");
				}

				break;

			}
			System.out.println("type yes to contiue");
			say = scanner.next();

		} while (say.equals("yes"));

	}

	static void searchCall() {
		SearchImplementation implementation = new SearchImplementation();
		Patient patient = new Patient();
		Doctor doctor = new Doctor();
		ArrayList<Patient> listPatient = new ArrayList<>();
		ArrayList<Doctor> listDoctor = new ArrayList<>();

		try {
			listPatient = mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/patientfile.json"),
					new TypeReference<ArrayList<Patient>>() {
					});
			for (int i = 0; i < listPatient.size(); i++) {
				System.out.println(listPatient.get(i));
			}
			System.out.println();
			listDoctor = mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/doctorfile.json"),
					new TypeReference<ArrayList<Doctor>>() {
					});
			for (int i = 0; i < listDoctor.size(); i++) {
				System.out.println(listDoctor.get(i));
			}
			System.out.println();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(listpatient);
//		System.out.println(listdoctor);
//		

		do {
			System.out.println("1.search by patient\n2.search by doctor");

			System.out.println("enter your choice");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				do {
					System.out.println("1. search by patient \n2.patient id");
					System.out.println("enter your choice");
					option = scanner.nextInt();

					switch (option) {
					case 1:

						System.out.println("enter the name to search ");
						implementation.searchByPatientName(listPatient);
						break;
					case 2:
						System.out.println("enter id to search");
						int patientID = scanner.nextInt();

						patient = implementation.searchByPatientId(patientID, listPatient);
						System.out.println(patient);
						break;
					}

				} while (option < 2);
				break;
			case 2:
				do {
					System.out.println(
							"1.search by doctor name\n2.search by doctor id\n3.search by doctor avabilitly\n4.s.specialization");
					System.out.println("enter the choice");
					option = scanner.nextInt();
					switch (option) {
					case 1:
						System.out.println("enter the name to search ");
						implementation.searchByDoctorName(listDoctor);
						break;
					case 2:
						/*
						 * System.out.println("enter id to search"); int doctorId=scanner.nextInt();
						 */

						implementation.searchByDoctorId(listDoctor);
						break;
					case 3:
						System.out.println("seach by avability ");
						System.out.println("enter id");
						int doctorIdd = scanner.nextInt();
						implementation.checkAvability(listDoctor);

						break;
					case 4:
						System.out.println("search by specialztion");
						implementation.searchByDoctorSpecialization(listDoctor);
						break;

					}
				} while (option < 3);

			}
		} while (option < 4);

	}

}
