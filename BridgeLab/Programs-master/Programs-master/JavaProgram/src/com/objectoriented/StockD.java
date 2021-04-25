package com.objectoriented;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockD {
public static void main(String[] args) {
	JSONObject obj1 = new JSONObject();
	obj1.put("stockname", "HP");
	obj1.put("number of stock", new Integer(200));
	obj1.put("share price", new Integer(20));
	obj1.put("total amount", new Integer(4000));
	// obj1.put(key, value)
	JSONObject company1 = new JSONObject();
	company1.put("HP", obj1);
	JSONObject obj2 = new JSONObject();
	obj2.put("stockname", "MAC");
	obj2.put("number of stock", new Integer(250));
	obj2.put("share price", new Integer(10));
	obj2.put("total amount", new Integer(25000));
	JSONObject company2 = new JSONObject();
	company2.put("MAC", obj2);

	JSONObject obj3 = new JSONObject();
	obj3.put("stockname", "SONY");
	obj3.put("number of stock", new Integer(300));
	obj3.put("share price", new Integer(5));
	obj3.put("total amount", 1500);
	JSONObject company3 = new JSONObject();
	company3.put("SONY", obj3);
	JSONArray al = new JSONArray();
	al.add(company1);
	al.add(company2);
	al.add(company3);

	try (FileWriter file = new FileWriter("/home/bridgeit/Desktop/2d/companystock.json")) {
		file.write(al.toString());
		file.flush();
	} catch (Exception e) {
		e.getMessage();
	}
}
}
