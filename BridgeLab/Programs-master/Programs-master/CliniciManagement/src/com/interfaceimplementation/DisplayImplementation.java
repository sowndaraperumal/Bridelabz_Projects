package com.interfaceimplementation;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.model.Appointment;
import com.model.Doctor;
import com.model.Patient;

public class DisplayImplementation implements DisplayInterface{
static ObjectMapper mapper=new ObjectMapper();
	@Override
	public void patientFile() {
		// TODO Auto-generated method stub
	
		ArrayList<Patient>listPatient=new ArrayList<>();
				try {
			listPatient=mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/patientfile.json"), new TypeReference<ArrayList<Patient>>() {
			});
			for(int i=0;i<listPatient.size();i++) {
				System.out.println(listPatient.get(i));
			}
			System.out.println();
		

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void doctorFile() {
		ArrayList<Doctor>listDoctor=new ArrayList<>();
		try {listDoctor=mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/doctorfile.json"), new TypeReference<ArrayList<Doctor>>() {
		});
		for(int i=0;i<listDoctor.size();i++) {
			System.out.println(listDoctor.get(i));
		}
		System.out.println();
		

		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void appointment() {

		List<Appointment>listAppointment=new ArrayList<>();
		try {listAppointment=mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/appointment.json"), new TypeReference<ArrayList<Appointment>>() {
		});
		for(int i=0;i<listAppointment.size();i++) {
			System.out.println(listAppointment.get(i));
		}
		System.out.println();
		

		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
