package com.interfaceimplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

import com.model.Doctor;
import com.model.Patient;


public class SearchImplementation implements SearchInterface {
	static Scanner scanner=new Scanner(System.in);
	@Override
	public void searchByPatientName(ArrayList<Patient>patientlist) {
		System.out.println("enter the name to search");
		String name=scanner.next();int flag=1;
		for(int i=0;i<patientlist.size();i++)
		{
			if(patientlist.get(i).getName().equals(name))
			{
				System.out.println(patientlist.get(i));
			flag++;
			}
		}
	   if(flag==1) {
			System.out.println("search name is not present");
		}
	}

	@Override
	public void searchByDoctorName(ArrayList<Doctor>doctorlist) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the name to search");
		String name=scanner.next();int flag=1;
		for(int i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getName().equals(name))
			{
				System.out.println(doctorlist.get(i));
			flag++;
			}
		}
	   if(flag==1) {
			System.out.println("search name is not present");
		}
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void searchByDoctorId(ArrayList<Doctor>doctorlist) {
		// TODO Auto-generated method stub
	
		
		
		System.out.println("enter the id to search");
		int id=scanner.nextInt();int flag=1;
		for(int i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getId()==(id))
			{
				System.out.println(doctorlist.get(i));
			flag++;
			}
		}
	   if(flag==1) {
			System.out.println("search id is not present");
		}
	
	
	
	
	
	}

	@Override
	public Patient searchByPatientId(int patientID,ArrayList<Patient>patientlist) {
		// TODO Auto-generated method stub
		for(int i=0;i<patientlist.size();i++)
		if(patientID==patientlist.get(i).getId()) {
			return patientlist.get(i);
		}
		System.out.println("not in file");
		return null;
	}

	@Override
	public void searchByDoctorSpecialization(ArrayList<Doctor>doctorlist) {
		// TODO Auto-generated method stub
		int sum=0;
		ObjectMapper mapper=new ObjectMapper();
		Map<Object, Object> map=new HashMap<>();
		ArrayList< Doctor>popularDoctor=new ArrayList<>();
		for(int i=0;i<doctorlist.size();i++) {
			
			if(map.isEmpty()) {
				map.put(doctorlist.get(i).getSpecialization(), doctorlist.get(i).getNumbeOfPatient());
				System.out.println(map);
			}else {
				
				if(map.containsKey(doctorlist.get(i).getSpecialization())) {
					 sum=(int)doctorlist.get(i).getNumbeOfPatient()+(int)map.get(doctorlist.get(i).getSpecialization());
					System.out.println(sum);
					 map.put(doctorlist.get(i).getSpecialization(),sum);
					
				}
				else {
					map.put(doctorlist.get(i).getSpecialization(), doctorlist.get(i).getNumbeOfPatient());
				}
				
				
			}
			
			
		}
		
		
		
		
		Map.Entry<Object, Object>entry=map.entrySet().iterator().next();
		String Specialization=(String)entry.getKey();
		int count=(int)entry.getValue();
		
	System.out.println(entry);
		for (Map.Entry<Object, Object> entryy : map.entrySet()) {
			int key=(int)entryy.getValue();
			if(key>count) {
				count =key;
				Specialization=(String)entryy.getKey();
				System.out.println(count);
			}
		}
			System.out.println("popular Specialization in city"+Specialization);
			System.out.println("number of patient"+count);
		
		
		
	}

	@Override
	public Doctor searchByAvability(int doctorId,ArrayList<Doctor>doctorlist) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<doctorlist.size();i++) {
			if(doctorId==doctorlist.get(i).getId()) {
				
				
				return doctorlist.get(i); 
			}
		}
		return null;
	}

	@Override
	public void searchByPopularity(ArrayList<Doctor> doctorlist) {
		// TODO Auto-generated method stub
		for(int i=0;i<doctorlist.size();i++) {
		String specialization=null;
			int key=(int)doctorlist.get(i).getNumbeOfPatient();
		if(key<doctorlist.get(i).getNumbeOfPatient()) {
			key=doctorlist.get(i).getNumbeOfPatient();
		specialization=doctorlist.get(i).getName();
		}
		System.out.println(specialization+"  "+key);
		}
		
		
		
	}

	@Override
	public void checkAvability(ArrayList<Doctor> doctorlist) {
		// TODO Auto-generated method stub
		System.out.println("enter the id to check avability");
		int id=scanner.nextInt();
		for(int i=0;i<doctorlist.size();i++) {
			if(id==doctorlist.get(i).getId()) {
				System.out.println(doctorlist.get(i).getNumbeOfPatient());
			}
		}
		
	}

}
