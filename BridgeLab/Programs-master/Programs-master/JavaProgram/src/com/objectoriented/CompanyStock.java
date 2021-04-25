package com.objectoriented;

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

public class CompanyStock {
	static JSONObject json;
	static JSONObject json1;
	static JSONObject st;
	static Scanner s = new Scanner(System.in);
static 	int choice;
static long fileid=0;
static Map<Object, Object> map=new HashMap<>();
static JSONArray arr=new JSONArray();
 static JSONObject oo=new JSONObject();

	public static void company() throws Exception  {
		
		JSONParser parser = new JSONParser();
		try (FileReader fileread = new FileReader("/home/bridgeit/Desktop/2d/companystock.json")) 
		{
	Object ob = parser.parse(fileread);
			JSONArray jarr = (JSONArray) ob;
			// System.out.println(jarr);
			System.out.println(jarr.size());
	System.out.println(jarr);
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
					System.out.println("stock name " + st.get("stockname") + "\n no of stock " + st.get("number of stock")
							+ "\n share price " + st.get("share price"));
				} 
				else if (i == 1) {
				json = (JSONObject) jarr.get(i);
					st = (JSONObject) json.get("MAC");
					System.out.println("stock name " + st.get("stockname") + "\n no of stock " + st.get("number of stock")
							+ "\n share price " + st.get("share price"));

				} else if (i == 2) {

					json = (JSONObject) jarr.get(i);

					st = (JSONObject) json.get("SONY");
					System.out.println("stock name " + st.get("stockname") + "\n no of stock " + st.get("number of stock")
							+ "\n share price " + st.get("share price"));

				}
			}
			//JSONArray arr=new JSONArray();
//			Map<Object, Object> map=new HashMap<>();
		/*	for(int i=0;i<jarr.size();i++) {
				
				json=(JSONObject) jarr.get(i);
				System.out.println(json);
				JSONObject js=(JSONObject) json.get("HP");
				System.out.println(js);
				
				
			}
			*/
	
			try(FileReader filer=new FileReader("/home/bridgeit/Desktop/2d/customerdetails.json"))
			{

			
			
			Object ob1=parser.parse(filer);
			
			JSONArray customerfile=(JSONArray) ob1;
		//	System.out.println(customerfile.size());
		System.out.println(customerfile.size());
			for(int i=0;i<customerfile.size();i++) {
				JSONObject json1=(JSONObject) customerfile.get(i);
				System.out.println("customer "+(i+1)+"\n"+"id "+json1.get("id"));
		
				//System.out.println("feel"+json.get("id"));
				//Object fd=(long)json.get("id");
			//	System.out.println(fd);
			//	id[i]=(long)json.get("id");


			
			
			
			}
			

		
			String idd="";
			System.out.println("enter id");
			idd=s.next();
			int ii=Integer.parseInt(idd);
			json1=(JSONObject)customerfile.get(ii-1);
	//		System.out.println(json1);
			//System.out.println(json1.get("id"));
        
			
			
			if(idd.equals(json1.get("id"))) {
	System.out.println("welcome  "+json1.get("cname"));
			//	System.out.println("sss");
				
				System.out.println("those are the my stock in my company");
				System.out.println("what you want to buy");
				System.out.println("1.HP\n2.MAc\n3.Sony");
				
				
				int ch;
				String stt = "yes";
				boolean b = false;
				while (b == false) {
					System.out.println("enter the product what you want");
					ch = s.nextInt();
					
				//	ch = s.nextInt();
				
				switch (ch) {
					case 1:
					
						System.out.println("enter the choice \n1.buy \n2.sell");
						choice = s.nextInt();
						switch (choice) {
						case 1:
							json = (JSONObject) jarr.get(ch - 1);
							//System.out.println(json);
							st = (JSONObject) json.get("HP");
							//System.out.println(st);
							Cart.buy(ob, st,json1);
							break;

						case 2:
							json = (JSONObject) jarr.get(ch - 1);
							st = (JSONObject) json.get("HP");

							Cart.sell(ob, st);
							break;

						}
						break;
					case 2: 
						
						System.out.println("enter the choice \n1.buy \n2.sell");
						choice = s.nextInt();
						switch (choice) {
						case 1:
							json = (JSONObject) jarr.get(ch - 1);
							st = (JSONObject) json.get("MAC");
							Cart.buy(ob, st,json1);
							break;

						case 2:
							json = (JSONObject) jarr.get(ch - 1);
							st = (JSONObject) json.get("MAC");

							Cart.sell(ob, st);
							break;

						}
						break;
					case 3:
						System.out.println("enter the choice \n1.buy \n2.sell");
						choice = s.nextInt();
						switch (choice) {
						case 1:
							json = (JSONObject) jarr.get(ch - 1);
							st = (JSONObject) json.get("SONY");
							Cart.buy(ob, st,json1);
							break;

						case 2:
							json = (JSONObject) jarr.get(ch - 1);
							st = (JSONObject) json.get("SONY");

							Cart.sell(ob, st);
							break;

						}
						break;
					}
					if(b==false) {
						System.out.println("do you want to again \n buy \n sell ");
						stt=s.next();

					if(stt.equalsIgnoreCase("yes")) {
								b=false;
								System.out.println("1.HP\n2.MAc\n3.Sony");

								}
					else {
						b=true;
					}
					}
					// System.out.println(json.size());
				}
				
			}
			
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}
			
				 catch (IOException e) {
						// TODO Auto-generated catch block
				//		e.printStackTrace();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
					//	e1.printStackTrace();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
			
			
			
			//System.out.println(fileid);
		/*System.out.println("those are the my stock in my company");
			System.out.println("what you want to buy");
			System.out.println("1.HP\n2.MAc\n3.Sony");
			int ch;
			String stt = "yes";
			boolean b = false;
			while (b == false) {
				System.out.println("enter the product what you want");
				ch = s.nextInt();
				switch (ch) {
				case 1:
				
					System.out.println("enter the choice \n1.buy \n2.sell");
					choice = s.nextInt();
					switch (choice) {
					case 1:
						json = (JSONObject) jarr.get(ch - 1);
						//System.out.println(json);
						st = (JSONObject) json.get("HP");
						//System.out.println(st);
						Cart.buy(ob, st);
						break;

					case 2:
						json = (JSONObject) jarr.get(ch - 1);
						st = (JSONObject) json.get("HP");

						Cart.sell(ob, st);
						break;

					}
					break;
				case 2: 
					
					System.out.println("enter the choice \n1.buy \n2.sell");
					choice = s.nextInt();
					switch (choice) {
					case 1:
						json = (JSONObject) jarr.get(ch - 1);
						st = (JSONObject) json.get("MAC");
						Cart.buy(ob, st);
						break;

					case 2:
						json = (JSONObject) jarr.get(ch - 1);
						st = (JSONObject) json.get("MAC");

						Cart.sell(ob, st);
						break;

					}
					break;
				case 3:
					System.out.println("enter the choice \n1.buy \n2.sell");
					choice = s.nextInt();
					switch (choice) {
					case 1:
						json = (JSONObject) jarr.get(ch - 1);
						st = (JSONObject) json.get("SONY");
						Cart.buy(ob, st);
						break;

					case 2:
						json = (JSONObject) jarr.get(ch - 1);
						st = (JSONObject) json.get("SONY");

						Cart.sell(ob, st);
						break;

					}
					break;
				}
				if(b==false) {
					System.out.println("do you want to again \n buy \n sell ");
					stt=s.next();

				if(stt.equalsIgnoreCase("yes")) {
							b=false;
							System.out.println("1.HP\n2.MAc\n3.Sony");

							}
				else {
					b=true;
				}
				}
				// System.out.println(json.size());
			}
			
			
		*/
		} 
		
	}

}
