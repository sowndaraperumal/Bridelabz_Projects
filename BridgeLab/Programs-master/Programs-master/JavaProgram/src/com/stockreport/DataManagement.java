package com.stockreport;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.objectoriented.DataStore;
import com.objectoriented.FinalReport;

public class DataManagement {
static Scanner s=new Scanner(System.in);
static JSONArray jsonarray=new JSONArray();
	private String name;
	private long pricePerKg;
	private long  weight;
	private long totalPrice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(long pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
static void createData() {
		DataManagement d=new DataManagement();
		JSONObject json =new JSONObject();
		System.out.println("enter the name");
		d.setName(s.next());
		System.out.println("enter the amount of per kg");
		d.setPricePerKg(s.nextLong());
		System.out.println("enter no. of kg ");
		d.setWeight(s.nextLong());
		//System.out.println("total price");
		json.put("name", d.getName());
		json.put("PricePerKG",d. getPricePerKg());
		json.put("Weight", d.getWeight());
		json.put("TotalPrice", d.getPricePerKg()*d.getWeight());
				
		//jsonarray.add(json);
				
		JSONParser parser=new JSONParser();
	     
     	try{
     		File file=new File("/home/bridgeit/Desktop/2d/data.json");
     		if(file.length()==0) {
     			//System.out.println("ll");
        		
        			jsonarray.add(json);
        	    	DataStore.datastore(jsonarray);

        	//		FinalReport.CustomerDetail(json);
     		}
     			else {
     		Object obj=parser.parse(new FileReader(file));
        	JSONArray ar=(JSONArray)obj;
     		JSONObject json1=(JSONObject)ar.get(0);
     		
        if(ar.size()!=0)
        {
        	
    			ar.add(json);
        }
    	DataStore.datastore(ar);

				
     			}
				
		
		
		
	}catch (Exception e) {
		// TODO: handle exception
	}}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String choice="yes";
		boolean b=false;
		while(b==false) {
			DataManagement.createData();
		
		if(choice.equals("yes")) {
		System.out.println("enter choice");
			choice=s.next();
		}
		else {
			b=true;
			break;
		}
		}
		
		
	}
	
}
