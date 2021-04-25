       

	import java.io.FileNotFoundException;
	import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
	import java.util.Scanner;

	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;
	import org.json.simple.parser.ParseException;

	public class ReadStock {
		//static JSONObject stock;

public static void main(String[] args) throws Exception, IOException {
	


			Scanner s = new Scanner(System.in);
			JSONParser jsonparser = new JSONParser();
			Iventory i=new Iventory();
		
			try (FileReader reader = new FileReader("/home/bridgeit/Desktop/2d/stock.json")) 
			{
		//		System.out.println("so");
				Object obj = jsonparser.parse(reader);
				 JSONObject json =Iventory.changeObject(obj); 
		//	System.out.println(json);
			
			Iventory.Report(json);
				/*

				System.out.println("those are the my stock in my company");
				System.out.println("what you want to buy");
				System.out.println("1.mango\n2.apple\n3.gova");
				int ch;

				String st = "yes";
				boolean b = false;
				while (b == false) {
					System.out.println("enter the product what you want");
					ch = s.nextInt();
			
					switch (ch) {
					case 1:
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

						break;
					case 2:
						long noofstock1 = 0;
						long newstock1 = 0;
						long newamount1 = 0;
						long totalstockamount1 = 0;
						stock = (JSONObject) jarr.get(ch - 1);
						System.out.println("selected stock is" + stock.get("stockname"));
						System.out.println("enter number of stock you want");
						noofstock1 = s.nextLong();
						System.out.println("total number of stock i have" + stock.get("number of stock"));
						long stocknum1 = (long) stock.get("number of stock");
						while (noofstock1 > stocknum1) {
							if (noofstock1 > stocknum1) {

								System.out.println("only i have  this much" + stock.get("number of stock"));
								System.out.println("enter number of stock you want");
								noofstock1 = s.nextLong();
							} else {
								break;
							}
						}
						newstock1 = stocknum1 - noofstock1;
						stock.put("number of stock", newstock1);
						long amount1 = (long) stock.get("total amount");
						long price1 = (long) stock.get("share price");
						totalstockamount1 = noofstock1 * price1;
						newamount1 = amount1 - totalstockamount1;
						stock.put("total amount", newamount1);
						break;
					case 3:
						long noofstock2 = 0;
						long newstock2 = 0;
						long newamount2 = 0;
						long totalstockamount2 = 0;
						stock = (JSONObject) jarr.get(ch - 1);
						System.out.println("selected stock is" + stock.get("stockname"));
						System.out.println("enter number of stock you want");
						noofstock2 = s.nextLong();
						System.out.println("total number of stock i have" + stock.get("number of stock"));
						long stocknum2 = (long) stock.get("number of stock");
						while (noofstock2 > stocknum2) {
							if (noofstock2 > stocknum2) {
								System.out.println("only i have  this much" + stock.get("number of stock"));
								System.out.println("enter number of stock you want");
								noofstock2 = s.nextLong();
							} else {
								break;
							}
						}
						newstock2 = stocknum2 - noofstock2;
						stock.put("number of stock", newstock2);
						long amount2 = (long) stock.get("total amount");
						long price2 = (long) stock.get("share price");
						totalstockamount2 = noofstock2 * price2;
						newamount2 = amount2 - totalstockamount2;
						stock.put("total amount", newamount2);
						break;
					}
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
*/
			
			}
		}

		
		
	}



