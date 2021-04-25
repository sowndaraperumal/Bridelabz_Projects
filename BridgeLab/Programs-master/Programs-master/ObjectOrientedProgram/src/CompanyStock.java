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
	static JSONObject st;
	static Scanner s = new Scanner(System.in);
static 	int choice;
static Map<Object, Object> map=new HashMap<>();
static JSONArray arr=new JSONArray();
 static JSONObject oo=new JSONObject();

	public static void company() throws Exception {
		JSONObject obj1 = new JSONObject();
		obj1.put("stockname", "HP");
		obj1.put("number of stock", new Integer(200));
		obj1.put("share price", new Integer(20));
		obj1.put("total amount", new Integer(4000));
		// obj1.put(key, value)
		JSONObject company1 = new JSONObject();
		company1.put("HP", obj1);
		JSONObject obj2 = new JSONObject();
		obj2.put("stockname", "mac");
		obj2.put("number of stock", new Integer(250));
		obj2.put("share price", new Integer(10));
		obj2.put("total amount", new Integer(25000));
		JSONObject company2 = new JSONObject();
		company2.put("MAC", obj2);

		JSONObject obj3 = new JSONObject();
		obj3.put("stockname", "sony");
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

		JSONParser parser = new JSONParser();
		try (FileReader fileread = new FileReader("/home/bridgeit/Desktop/2d/companystock.json")) 
		{
	Object ob = parser.parse(fileread);
			JSONArray jarr = (JSONArray) ob;
			// System.out.println(jarr);
			//System.out.println(jarr.size());
		

			for (int i = 0; i < jarr.size(); i++) {
				// System.out.println(json);

				// System.out.println("stock name "+json.get("HP".g)+"\n no of stock
				// "+json.get("number of stock")+"\n share price "+json.get("share price"));

				// System.out.println(json.get("HP"));

				// System.out.println(st);
				if (i == 0) {
					json = (JSONObject) jarr.get(i);

					st = (JSONObject) json.get("HP");
				//	System.out.println(st);
					System.out.println("stock name " + st.get("stockname") + "\n no of stock "
							+ st.get("number of stock") + "\n share price " + st.get("share price"));
			map.put("HP", st);
			System.out.println(map);
				} else if (i == 1) {
					json = (JSONObject) jarr.get(i);
					st = (JSONObject) json.get("MAC");
					System.out.println("stock name " + st.get("stockname") + "\n no of stock "
							+ st.get("number of stock") + "\n share price " + st.get("share price"));
					map.put( "MAC",st);

				} else if (i == 2) {

					json = (JSONObject) jarr.get(i);

					st = (JSONObject) json.get("SONY");
					System.out.println("stock name " + st.get("stockname") + "\n no of stock "
							+ st.get("number of stock") + "\n share price " + st.get("share price"));
					map.put( "SONY",st);

				}
			}
			
			
			oo.putAll(map);
			arr.add(oo);
			
			
			//JSONArray arr=new JSONArray();
//			Map<Object, Object> map=new HashMap<>();
		/*	for(int i=0;i<jarr.size();i++) {
				
				json=(JSONObject) jarr.get(i);
				System.out.println(json);
				JSONObject js=(JSONObject) json.get("HP");
				System.out.println(js);
				
				
			}
			*/
			
			
			
			
			
			FinalReport.stockdetail(arr);
		
			
			
			
			
			
		System.out.println("those are the my stock in my company");
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
					break;
				}
				}
				// System.out.println(json.size());
			}
			
			

		}
	}

}
