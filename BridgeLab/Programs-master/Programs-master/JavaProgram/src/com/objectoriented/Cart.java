package com.objectoriented;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Cart {
	/*static long customer1stock=0;
	static long customer2stock=0;
	static long customer3stock=0;*/
	static JSONObject product1;
	static JSONObject product2;
	static JSONObject product3;
	static JSONObject json1;
	static JSONObject json2;

	static JSONObject user;
static	long customershare=0;
	static JSONObject json;
	static JSONObject st;
	static Scanner s = new Scanner(System.in);
	static JSONObject name;
	static JSONParser parser=new JSONParser();

	public static void sell(Object ob, JSONObject symbol) {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void buy(Object ob, JSONObject symbol,JSONObject customerfile ) throws Exception {
		
		
	System.out.println("aa");
/*
		try {
			File file=new File("/home/bridgeit/Desktop/2d/userstock.json");
			if(file.length()==0) {
				System.out.println("file empty");
			}
			else
			{
			Object obj=parser.parse(new FileReader(file));
			
			JSONArray customer=(JSONArray) obj;
			System.out.println(customer);
System.out.println("aa"+customer.size());
			for(int i=0;i<customer.size();i++) {
			
			String a=(i+1)+"";
			
			
			
			System.out.println("aa");
			//if(i==0) {
			json=(JSONObject) customer.get(i);
				//	System.out.println(json);
			System.out.println(a);
					JSONObject j=(JSONObject)json.get(a);
				//	System.out.println(j);
					System.out.println("customer "+(i+1)+"\n"+"ID "+j.get("Id")+"\nname "+j.get("customername")+"\ncontact "+j.get("contact")+ "\nemailid   "+j.get("emailid"));
				
				JSONObject st=(JSONObject)j.get("stock");
			//	System.out.println(st);
				JSONObject s=(JSONObject)st.get("stock1");
			//	System.out.println(s);
				System.out.println("my stock");
				System.out.println("stockname  "+s.get("stockname1")+"\nnumber of share"+s.get("number of stock"));
				JSONObject ss=(JSONObject)st.get("stock2");
			//	System.out.println(ss);
				
				
				System.out.println("stockname"+ss.get("stockname2")+"\nnumber of share"+ss.get("number of stock"));
				JSONObject sss=(JSONObject)st.get("stock3");
			//	System.out.println(s);
				
				System.out.println("stockname  "+sss.get("stockname3")+"\nnumber of share"+sss.get("number of stock"));

			
			
			
			
			
			
			
			}
			
			
			}
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//	e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("file is empty ");
				//e.printStackTrace();
			}
			System.out.println("aaaa");
			//	System.out.println(customerfile.size());
		System.out.println(customerfile);
		  System.out.println(customerfile);
		  JSONObject cust=new JSONObject();
			cust.put("customername", customerfile.get("cname"));
			cust.put("Id", customerfile.get("id"));
			cust.put("emailid", customerfile.get("emailid"));
			cust.put("contact", customerfile.get("mobile number"));
			System.out.println(cust);
			JSONObject stock=new JSONObject();
			JSONObject product1=new JSONObject();
			JSONObject product2=new JSONObject();
		    JSONObject product3=new JSONObject();
		   // System.out.println("aa");
	  		*/
		
		try(FileReader fr=new FileReader("/home/bridgeit/Desktop/2d/userstock.json"))
		{
			
			Object obje=parser.parse(fr);
			JSONArray jsa=(JSONArray)  obje;
			
			System.out.println(jsa);
			System.out.println("enter id");
			String id=s.next();
			for(int i=0;i<jsa.size();i++) {
				
				json=(JSONObject) jsa.get(i);
			//	System.out.println(json);
				json2=(JSONObject) json.get(id);
				System.out.println(json2.get("Id"));
		//		System.out.println(json.get("Id"));
				if(id.equals(json2.get("Id"))) {
			/*	System.out.println("qq");
					System.out.println(json);
					*/
					
					
					String stt = "yes";
					boolean b = false;
					while (b == false) {
					//	System.out.println("enter the product what you want");
					//	ch = s.nextInt();
						long noofstock = 0;
						long newstock = 0;
						long newamount = 0;
						long totalstockamount = 0;
					//	symbol = (JSONObject) jarr.get(ch - 1);
						
						System.out.println("selected stock is" + symbol.get("stockname"));
						// System.out.println("enter no of stock you want");
						System.out.println("total number of stock i have" + symbol.get("number of stock"));

						System.out.println("enter number of stock you want");
						
						noofstock = s.nextLong();
						System.out.println("total number of stock i have" + symbol.get("number of stock"));
						long stocknum = (long) symbol.get("number of stock");
					
						while (noofstock > stocknum)
						{
							if (noofstock > stocknum) {
								System.out.println("only i have  this much" + symbol.get("number of stock"));

								System.out.println("enter number of stock you want");
								noofstock = s.nextLong();
							} else {
								break;
							}			
							}
						customerfile.put("stockname",symbol.get("stockname") );
	//					System.out.println(customerfile);
						
//						System.out.println(customerfile);

							newstock = stocknum - noofstock;
							symbol.put("number of stock", newstock);
							long amount = (long) symbol.get("total amount");
							long price = (long) symbol.get("share price");
							totalstockamount = noofstock * price;
							customershare=customershare+totalstockamount;
							customerfile.put("sharevalue", customershare);
				        //product.put(", value)
							System.out.println(customerfile);
							newamount = amount - totalstockamount;
							symbol.put("total amount", newamount);
							
							json1=(JSONObject) json2.get("stock");
							System.out.println(json);
							
							 product1=(JSONObject)json1.get("stock1");
							 product2=(JSONObject)json1.get("stock2");
							 product3=(JSONObject)json1.get("stock3");
							 
							 System.out.println(product1);
							 System.out.println(product2);
							 System.out.println(product3);
							 
							 //System.out.println(product1.put("number of stock",10));
							long customer1stock=(long)product1.get("number of stock");
							
							
								String p1=(String)product1.get("stockname1");
							String p2=(String)product2.get("stockname2");
							long customer2stock=(long)product2.get("number of stock");

							
							
							String p3=(String)product3.get("stockname3");
							long customer3stock=(long)product3.get("number of stock");

							String name= (String)symbol.get("stockname");
					System.out.println(name);
							
					if(p1.equalsIgnoreCase(name)) {
						System.out.println("11");
						customer1stock=customer1stock+noofstock;

						product1.put("number of stock", customer1stock);

					}
						else if(p2.equalsIgnoreCase(name)) {
							customer2stock=customer2stock+noofstock;

							product2.put("number of stock", customer2stock);

						}
						else if(p3.equalsIgnoreCase(name))
						{		
							customer3stock=customer3stock+noofstock;

							product3.put("number of stock", customer3stock);

						}
					
							
					
				
					json1.put("stock1", product1);
					json1.put("stock2", product2);
					json1.put("stock3", product3);

					System.out.println(json1);
					
					
					json2.put("stock", json1);
					System.out.println(json2);
				//	json.put(, json2);
					System.out.println(json);
				
					
					
					if (b == false) {
						System.out.println("you want purchase one more time ");
						stt = s.next();
						if (stt.equalsIgnoreCase("yes")) {
							b = false;
						} else {
							b = true;
							break;
				}
					
					}
				
				
				
					}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
				
				JSONArray a=new JSONArray();
				
				
				JSONParser parser=new JSONParser();
				try {
					File f=new File("/home/bridgeit/Desktop/2d/userstock.json");
					if(f.length()==0) {
						System.out.println("aa");
						a.add(json);			
					}
					else {
						Object obj=parser.parse(new FileReader(f));
			        	JSONArray ar=(JSONArray)obj;
			        	System.out.println(ar);
			        	for(int k=0;i<ar.size();k++) {
			        	JSONObject j=(JSONObject)ar.get(i);
			        		
			        	//if(ar.size()!=0) {
			        	a.add(j);
			        		
			        		//a.add(user);
			        	//}
			        	}
			        	//a.add(user);
			        	
					}
					
					FinalReport.user(a);
				System.out.println("aa");
				
				}catch (Exception e) {
					// TODO: handle exception
				}
			
			
			
			
			

			
			
			
			
			
			
			
			
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	String name= (String)symbol.get("stockname");
System.out.println(name);*/
		JSONArray jarr = (JSONArray) ob;
		System.out.println(jarr);
//name=(JSONObject)symbol.get("stockname");
		System.out.println("those are the my stock in "+symbol.get("stockname"));
   		//System.out.println("what you want to buy");
		//System.out.println("1.HP\n2.MAc\n3.SONY");
		int ch;
		/*product1.put("stockname1","HP");
		String p1=(String)product1.get("stockname1");
		product1.put("number of stock", customer1stock);
		product2.put("stockname2","MAC" );
		String p2=(String)product2.get("stockname2");
		product2.put("number of stock", customer2stock);

		product3.put("stockname3","SONY" );
		String p3=(String)product3.get("stockname3");
		product3.put("number of stock", customer3stock);
*/
		
/*		String stt = "yes";
		boolean b = false;
		while (b == false) {
		//	System.out.println("enter the product what you want");
		//	ch = s.nextInt();
			long noofstock = 0;
			long newstock = 0;
			long newamount = 0;
			long totalstockamount = 0;
		//	symbol = (JSONObject) jarr.get(ch - 1);
			
			System.out.println("selected stock is" + symbol.get("stockname"));
			// System.out.println("enter no of stock you want");
			System.out.println("total number of stock i have" + symbol.get("number of stock"));

			System.out.println("enter number of stock you want");
			
			noofstock = s.nextLong();
			System.out.println("total number of stock i have" + symbol.get("number of stock"));
			long stocknum = (long) symbol.get("number of stock");
		
			while (noofstock > stocknum)
			{
				if (noofstock > stocknum) {
					System.out.println("only i have  this much" + symbol.get("number of stock"));

					System.out.println("enter number of stock you want");
					noofstock = s.nextLong();
				} else {
					break;
				}			
				}
			customerfile.put("stockname",symbol.get("stockname") );
			System.out.println(customerfile);
			
			System.out.println(customerfile);

				newstock = stocknum - noofstock;
				symbol.put("number of stock", newstock);
				long amount = (long) symbol.get("total amount");
				long price = (long) symbol.get("share price");
				totalstockamount = noofstock * price;
				customershare=customershare+totalstockamount;
				customerfile.put("sharevalue", customershare);
	        //product.put(", value)
				System.out.println(customerfile);
				newamount = amount - totalstockamount;
				symbol.put("total amount", newamount);
//			
//				JSONObject j=new JSONObject();
//				j.put("stock", customerfile);
			
				if(p1.equalsIgnoreCase(name)) {
					System.out.println("11");
					customer1stock=customer1stock+noofstock;

					product1.put("number of stock", customer1stock);

				}
					else if(p2.equalsIgnoreCase(name)) {
						customer2stock=customer2stock+noofstock;

						product2.put("number of stock", customer2stock);

					}
					else if(p3.equalsIgnoreCase(name))
					{		
						customer3stock=customer3stock+noofstock;

						product3.put("number of stock", customer3stock);

					}
				
				stock.put("stock1", product1);
				stock.put("stock2", product2);
				stock.put("stock3", product3);

				
				cust.put("stock", stock);
				System.out.println(cust);
				
			//	for(int i=0;i<customerfile.size();i++) {
					 user=new JSONObject();
					user.put(customerfile.get("id"),cust);
					
				//}
				
		//	System.out.println(user);
				
				JSONArray a=new JSONArray();
				
				
				JSONParser parser=new JSONParser();
				try {
					File f=new File("/home/bridgeit/Desktop/2d/userstock.json");
					if(f.length()==0) {
						System.out.println("aa");
						a.add(user);			
					}
					else {
						Object obj=parser.parse(new FileReader(f));
			        	JSONArray ar=(JSONArray)obj;
			        	for(int i=0;i<ar.size();i++) {
			        	JSONObject j=(JSONObject)ar.get(i);
			        		
			        	//if(ar.size()!=0) {
			        	a.add(j);
			        		
			        		//a.add(user);
			        	//}
			        	}
			        	a.add(user);
			        	
					}
				System.out.println("aa"+user);
				
				}catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
				
		///		a.add(user);
				
				
				
				
				
				
				
				
				System.out.println(a);
				
				
				try (FileWriter file = new FileWriter("/home/bridgeit/Desktop/2d/userstock.json")) {
					file.write(a.toString());
					file.flush();
					System.out.println("sucess");
				}
				
				if (b == false) {
					System.out.println("you want purchase one more time ");
					stt = s.next();
					if (stt.equalsIgnoreCase("yes")) {
						b = false;
					} else {
						b = true;
						break;
					}
				}		}*/
System.out.println(jarr);
/*
JSONArray arr=new JSONArray();
Map<Object, Object> map=new HashMap<>();
for (int i = 0; i < jarr.size(); i++) {
	// System.out.println(json);

	// System.out.println("stock name "+json.get("HP".g)+"\n no of stock
	// "+json.get("number of stock")+"\n share price "+json.get("share price"));

	// System.out.println(json.get("HP"));

	// System.out.println(st);
	if (i == 0) {
		json = (JSONObject) jarr.get(i);

		st = (JSONObject) json.get("HP");
		System.out.println(st);
		//map.put( "SONY",st);
	  	//map.put( "MAC",st);
	//	System.out.println(st);
		System.out.println("stock name " + st.get("stockname") + "\n no of stock "	+ st.get("number of stock") + "\n share price " + st.get("share price"));
      map.put("HP", st);
  System.out.println(map);
        //arr.add(map);
    	
//	System.out.println(map);
	} else if (i == 1) {
		System.out.println(i);
		json = (JSONObject) jarr.get(i);
		st = (JSONObject) json.get("MAC");
		System.out.println("stock name " + st.get("stockname") + "\n no of stock "+ st.get("number of stock") + "\n share price " + st.get("share price"));
		map.put( "MAC",st);
	//	arr.add(map);
	} else if (i == 2) {

		json = (JSONObject) jarr.get(i);

		st = (JSONObject) json.get("SONY");
		System.out.println("stock name " + st.get("stockname") + "\n no of stock "+ st.get("number of stock") + "\n share price " + st.get("share price"));
		map.put( "SONY",st);
	//	arr.add(map);
	}
}
JSONObject oo=new JSONObject();
oo.putAll(map);
arr.add(oo);
System.out.println(arr);*/
FinalReport.stockdetail(jarr);
/*			}
 * 
 * 
		System.out.println(ob);
		JSONArray aa=new JSONArray();
		aa=(JSONArray) ob;
		
		JSONObject jj=new JSONObject();
		int t;
		for(int i=0;i<aa.size();i++) {
			jj=(JSONObject)aa.get(i);
			if(symbol.get("stockname").equals(jj.get("stockname"))) {
				t=i;
				
				
				
				
				
			}
					*/
	
	/*	
		System.out.println(symbol);
		
		
	JSONArray arrr=new JSONArray();
	
		
		arrr.add(symbol);
		System.out.println(arrr);
		System.out.println(customerfile);
		FinalReport.result(arrr);
		System.out.println("stock name " + symbol.get("stockname") + "\n no of stock " + symbol.get("number of stock")
		+ "\n share price " + symbol.get("share price"));
		CompanyStock.map.put(symbol.get("stockname"), symbol);
		System.out.println();
		CompanyStock.oo.put(symbol.get("stockname"), symbol);
		CompanyStock.arr.add(CompanyStock.oo);
		if(CompanyStock.arr.size()!=0)
		{
			//System.out.println("ll");
		
			CompanyStock.arr.add(CompanyStock.oo);
		}else {
			CompanyStock.arr.add(CompanyStock.oo);
		}
		CompanyStock.arr.add(CompanyStock.oo);

		
		
		FinalReport.PrintCustomerDetail();*/
	
			}
	
	}

}
