package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.module.PersonDetail;

public class FileReadAndWrite {
	static JSONParser parser=new JSONParser();
	static ObjectMapper mapper=new ObjectMapper();
	static JSONArray jsonarray=new JSONArray();
   public static void fileWrite(PersonDetail person,String filename) {
	//System.out.println(jsnarray);
	
	String json="[";
	File file =new File(filename);
	try {
		if(file.length()==0)
			json=json+mapper.writeValueAsString(person)+"]";
		else {
			Object ob=parser.parse(new FileReader(file));
			jsonarray=(JSONArray)ob;
			for(int i=0;i<jsonarray.size();i++) {
				
				json=json+jsonarray.get(i)+",";
				
				
				
			}
			json=json+mapper.writeValueAsString(person)+"]";
			
		}
		FileWriter filewrite=new FileWriter(filename);

		filewrite.write(json);
		filewrite.flush();
	}catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	
	
	

		
/*    	System.out.println("successfully upgraded" );
    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	
*/}

   public static void fileWritess(ArrayList<PersonDetail> person,String filename) {
	   
	  /* String filen="/home/bridgeit/Desktop/2d/address/"+filename;
	   	*/	String json=null;
	   		File file =new File(filename);
	   		try {
	   			/*if(file.length()==0)
	   				json=json+mapper.writeValueAsString(person.get(0))+"]";
	   	   
	   	   
	   	   
	   	   
	   	   
	   	   
	   			else {
	   		*/		/*Object ob=parser.parse(new FileReader(file));
	   				jsona=(JSONArray)ob;*/
	   				int temp=0;
	   				for(int i=0;i<jsonarray.size()-1;i++) {
	   					temp=i;

	   					json=mapper.writeValueAsString(person.get(0))+",";
	   					
	   					
	   				}
	   				if(jsonarray.size()>1) {
	   					json=mapper.writeValueAsString(person.get(temp+1));
	   				}
	   				//temp++;
	   				if(jsonarray.size()==0) {
	   				json=mapper.writeValueAsString(person);
	   				
	   				}
	   			
	   			FileWriter filewrite=new FileWriter(filename);

	   			filewrite.write(json);
	   			filewrite.flush();
	   		}catch (Exception e) {
	   			// TODO: handle exception
	   		}
	   		

	   	   
	   	   

	      }
	      
   public static void fileWrites(ArrayList<PersonDetail> person,String filename) {
	   
String filepath="/home/bridgeit/Desktop/2d/address/"+filename;
		String json=null;
		File file =new File(filepath);
		try {
			/*if(file.length()==0)
				json=json+mapper.writeValueAsString(person.get(0))+"]";
	   
	   
	   
	   
	   
	   
			else {
		*/		/*Object ob=parser.parse(new FileReader(file));
				jsona=(JSONArray)ob;*/
				int temp=0;
				for(int i=0;i<jsonarray.size()-1;i++) {
					temp=i;

					json=mapper.writeValueAsString(person.get(0))+",";
					
					
				}
				if(jsonarray.size()>1) {
					json=mapper.writeValueAsString(person.get(temp+1));
				}
				//temp++;
				if(jsonarray.size()==0) {
				json=mapper.writeValueAsString(person);
				
				}
			
			FileWriter filewrite=new FileWriter(filepath);

			filewrite.write(json);
			filewrite.flush();
		}catch (Exception e) {
			// TODO: handle exception
		}
		

	   
	   

   }
   
public   static void  readbook(String fileName) {
	   
	   
	   
	   
	   
	   
	//   System.out.println(filename);
		JSONParser jsonParser=new JSONParser();
		File file=new File(fileName);
		try {
			Object o=(Object)jsonParser.parse(new FileReader(file));
			
			JSONArray jsonArray=(JSONArray)o;
		//	System.out.println(jsonArray);
			//JSONObject jb=(JSONObject)jsonArray.get(0);
			for (int i = 0; i < jsonArray.size(); i++) {
				PersonDetail detail=mapper.readValue(jsonArray.get(i).toString(), PersonDetail.class);
			System.out.println(  detail.getFirstName()+ " "+detail.getLastName()+ " "+detail.getPersonaddress() );
			 
			}
			
			
			
			//System.out.println(jb);
		} catch (IOException | ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	/*	
		ArrayList<Object>list=new ArrayList<>();
		ObjectMapper mapper=new ObjectMapper();
		JsonFactory jfactory = new JsonFactory();
       JsonParser jParser;
		try {
			jParser = jfactory.createJsonParser(new File(filename));
		//     list= Arrays.asList(mapper.readValue(jParser, PersonDetail.class));
System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	   
	   
	   
	   
	   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
