import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Cart {
	static JSONObject json;
	static JSONObject st;
	static Scanner s = new Scanner(System.in);
	static JSONObject name;

	public static void sell(Object ob, JSONObject symbol) {

	}

	public static void buy(Object ob, JSONObject symbol) throws Exception {
		JSONArray jarr = (JSONArray) ob;
//name=(JSONObject)symbol.get("stockname");
		System.out.println("those are the my stock in "+symbol.get("stockname"));
   		//System.out.println("what you want to buy");
		//System.out.println("1.HP\n2.MAc\n3.SONY");
	//	int ch;
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
				newstock = stocknum - noofstock;
				symbol.put("number of stock", newstock);
				long amount = (long) symbol.get("total amount");
				long price = (long) symbol.get("share price");
				totalstockamount = noofstock * price;
				newamount = amount - totalstockamount;
				symbol.put("total amount", newamount);
			
				if (b == false) {
					System.out.println("you want purchase one more time ");
					stt = s.next();
					if (stt.equalsIgnoreCase("yes")) {
						b = false;
					} else {
						b = true;
					}
				}

			}
		System.out.println("stock name " + symbol.get("stockname") + "\n no of stock " + symbol.get("number of stock")
		+ "\n share price " + symbol.get("share price"));
	//	CompanyStock.map.put(symbol.get("stockname"), symbol);
		CompanyStock.oo.put(symbol.get("stockname"), symbol);
	//	CompanyStock.arr.add(CompanyStock.oo);
	/*	if(CompanyStock.arr.size()!=0)
		{
			//System.out.println("ll");
		
			CompanyStock.arr.add(CompanyStock.oo);
		}else {
			CompanyStock.arr.add(CompanyStock.oo);
		}*/
		CompanyStock.arr.add(CompanyStock.oo);

		FinalReport.result(CompanyStock.arr);
		
		
		
	
		
	/*	for (int i = 0; i < jarr.size(); i++) {
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
			} else if (i == 1) {
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
		}*/

	}

}
