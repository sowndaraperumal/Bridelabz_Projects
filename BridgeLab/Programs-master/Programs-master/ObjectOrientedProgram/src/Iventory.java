import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Iventory {
	static	JSONObject stock;
	static Scanner s=new Scanner(System.in);

	static public JSONObject changeObject(Object obj)
	{
		JSONArray jarr = (JSONArray) obj;
	//	System.out.println(jarr.size());
	//	System.out.println();
		Object ob[]=new Object[jarr.size()];
		JSONArray ja=new JSONArray();
		JSONObject oo[]=new JSONObject[jarr.size()];
		for(int i=0;i<ob.length;i++) {
		//	System.out.println("hello");
			 oo[i]=(JSONObject)jarr.get(i);

			//ja.add(json);
		//	System.out.println(json);	
		}
	//	System.out.println(ja.toJSONString());
		
	//	JSONObject jss=(JSONObject)ja.toJSONString();
		Map<Object, Object> ma=new HashMap();
	for (int i = 0; i < oo.length; i++) {
		ma.put(oo[i].get("stockname"), oo[i]);
		
	}
		JSONObject fl=new JSONObject(); 
		fl.putAll(ma);
	//	System.out.println(fl);
		return fl;
}
	
	public static void Report(JSONObject json) {
		System.out.println("those are the my stock in my company");
		System.out.println("what you want to buy");
		System.out.println("1.mango\n2.apple\n3.gova");
		int ch;
		//System.out.println(json);
		
	//Object oo=(Object)json;
		JSONArray jarr=new JSONArray(); 
		jarr.add(json);
		//System.out.println(jarr.size());
		//for(int i=0;i<jarr.length;i++) {
	//jarr[i]=json;
		//}
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