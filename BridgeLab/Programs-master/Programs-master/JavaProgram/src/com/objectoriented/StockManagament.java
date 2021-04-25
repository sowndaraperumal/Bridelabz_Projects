package com.objectoriented;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class StockManagament {
	@SuppressWarnings("unchecked")
public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	JSONObject obj1=new JSONObject();
	obj1.put("stockname", "mango");
	obj1.put("number of stock",new Integer(200));
	obj1.put("share price", new Integer(20));
	obj1.put("total amount", new Integer(4000));
	//JSONObject js=new JSONObject();
//	js.put("j", obj1);
	JSONObject obj2=new JSONObject();
	obj2.put("stockname", "apple");
	obj2.put("number of stock",new Integer(250));
	obj2.put("share price", new Integer(10));
	obj2.put("total amount",new Integer(25000));
	
	JSONObject obj3=new JSONObject();
	obj3.put("stockname", "gova");
	obj3.put("number of stock",new Integer(300));
	obj3.put("share price", new Integer(5));
	obj3.put("total amount", 1500);
	
    JSONArray al=new JSONArray();
    al.add(obj1);
    al.add(obj2);
    al.add(obj3);
 
    try(FileWriter file=new FileWriter("/home/bridgeit/Desktop/2d/stock.json")){
    	file.write(al.toString());
    	file.flush();
    }
    catch (Exception e) {
e.getMessage();
    }
   // System.out.println(al);
  //  ReadFile.read();
    StockManage.read();
}
}
