package com.interfaceimplementation;

import java.awt.List;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.module.PersonDetail;
import com.utility.FileReadAndWrite;

public class AddressBookManagerImplem  implements AddressBookManager{
	Scanner s=new Scanner(System.in);

	@Override
	public ArrayList<PersonDetail> createAddressBook() {
		
		AddressBookImplementation addressbook=new AddressBookImplementation();
		
		
		return addressbook.addPerson();
	}

	@Override
	public ArrayList<PersonDetail> open() {
		System.out.println("openbook");
		File ff=new File("/home/bridgeit/Desktop/2d/address/");
		File[] fi=ff.listFiles();
//		int i=0;
for (File file2 : fi) {
	file2.getName();
	System.out.println(file2.getName());
}
//	int choice;
	System.out.println("enter your choice");

	String filee="/home/bridgeit/Desktop/2d/address/"+s.next();
	
	JSONParser jsonParser=new JSONParser();
	ArrayList<PersonDetail> list=new ArrayList<>();
	System.out.println("which person you want to edit");
	FileReadAndWrite.readbook(filee);
String name;
	ObjectMapper mapper=new ObjectMapper();
	Object o;
	try {
		o = (Object)jsonParser.parse(new FileReader(filee));
		JSONArray jsonArray=(JSONArray)o;
		//	System.out.println(jsonArray);
			//JSONObject jb=(JSONObject)jsonArray.get(0);
	/*		for (int i = 0; i < jsonArray.size(); i++) {
		list.add(mapper.readValue(jsonArray.get(i).toString(), PersonDetail.class));}
			*/
	
			list=mapper.readValue(new File(filee), new TypeReference<ArrayList<PersonDetail>>() {
				
			});
		
		
		
	}catch (IOException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(list);
	return list;
	}
	public String  openBook() {
		System.out.println("openbook");
		File ff=new File("/home/bridgeit/Desktop/2d/address/");
		File[] fi=ff.listFiles();
//		int i=0;
		if(fi.length==0) {
			return null;
		}
		else {
for (File file2 : fi) {
	file2.getName();
	if(file2.getName()!=null) {
	System.out.println(file2.getName());
}
	}
//	int choice;
	System.out.println("enter your choice");

	String filee="/home/bridgeit/Desktop/2d/address/"+s.next();

		
		return filee;

		}
	}

	@Override
	public void save(ArrayList< PersonDetail>list,String file) {
		// TODO Auto-generated method stub
			FileReadAndWrite.fileWrites(list, file);

	}

	@Override
	public void saceAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
