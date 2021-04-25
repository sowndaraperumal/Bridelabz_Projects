package com.objectoriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockManage {
	static	JSONObject stock;

	@SuppressWarnings("Unchecked")
	public static void read() throws FileNotFoundException, IOException, ParseException {

		Scanner s = new Scanner(System.in);
		JSONParser jsonparser = new JSONParser();
		try (FileReader reader = new FileReader("/home/bridgeit/Desktop/2d/stock.json")) 
		{
			Object obj = jsonparser.parse(reader);	
			System.out.println();
			JSONArray jarr = (JSONArray) obj;
			System.out.println(jarr);
			System.out.println(jarr.size());
			System.out.println();
			for (int i = 0; i < jarr.size(); i++) {
				JSONObject obj1 = (JSONObject) jarr.get(i);
				System.out.println("Stockname" + obj1.get("stockname") + "\nno of stock " + obj1.get("number of stock")
						+ "\nshare price " + obj1.get("share price") + "\ntotal amount" + obj1.get("total amount"));
				System.out.println();
			}
			System.out.println("those are the my stock in my company");
			System.out.println("what you want to buy");
			System.out.println("1.mango\n2.apple\n3.gova");
			int ch;
			String st = "yes";
			boolean b = false;
			while (b == false) {
				System.out.println("enter the product what you want");
				ch = s.nextInt();
					long noofstock = 0;
					long newstock = 0;
					long newamount = 0;
					long totalstockamount = 0;
					stock = (JSONObject) jarr.get(ch - 1);
					System.out.println("selected stock is" + stock.get("stockname"));
					// System.out.println("enter no of stock you want");
					System.out.println("enter number of stock you want");
					noofstock = s.nextLong();
					System.out.println("total number of stock i have" + stock.get("number of stock"));
					long stocknum = (long) stock.get("number of stock");
					while (noofstock > stocknum) {
						if (noofstock > stocknum) {
							System.out.println("only i have  this much" + stock.get("number of stock"));
							System.out.println("enter number of stock you want");
							noofstock = s.nextLong();
						} else {
							break;
						}
					}
					newstock = stocknum - noofstock;
					stock.put("number of stock", newstock);
					long amount = (long) stock.get("total amount");
					long price = (long) stock.get("share price");
					totalstockamount = noofstock * price;
					newamount = amount - totalstockamount;
					stock.put("total amount", newamount);
				if (b == false) {
					System.out.println("you want any other stock");
					st = s.next();
					if (st.equalsIgnoreCase("yes")) {
						b = false;
					} else {
						b = true;
					}
				}
			}
			for (int i = 0; i < jarr.size(); i++) {
				JSONObject obj1 = (JSONObject) jarr.get(i);
				System.out.println("Stockname" + obj1.get("stockname") + "\nno of stock " + obj1.get("number of stock")
						+ "\nshare price " + obj1.get("share price") + "\ntotal amount" + obj1.get("total amount"));
				System.out.println();
			}
			System.out.println(jarr);
			JSONArray arr = new JSONArray();
			for (int i = 0; i < jarr.size(); i++) {
				JSONObject obj1 = (JSONObject) jarr.get(i);
				arr.add(obj1);
			}
			try (FileWriter file = new FileWriter("/home/bridgeit/Desktop/2d/resultstock.json")) {
				file.write(arr.toString());
				file.flush();
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
}
