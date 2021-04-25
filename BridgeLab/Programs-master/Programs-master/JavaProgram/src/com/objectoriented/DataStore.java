package com.objectoriented;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataStore {
	static JSONArray storedfile;




	static public void datastore (JSONArray al) {
		System.out.println(al);
		
		
		try(FileWriter file=new FileWriter("/home/bridgeit/Desktop/2d/data.json")){
	    	file.write(al.toString());
	    	file.flush();
	    	System.out.println("successfully upgraded" );
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	}



}	  
