package com.objectoriented;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class tt {
	
	static void create (){
		
		JSONObject ob=new JSONObject();
		ob.put("name", "sowndar");
		ob.put("id", "1");
		JSONObject j=new JSONObject();
		
		JSONObject st=new JSONObject();
		st.put("Stockname", "hp");
		st.put("noofstock", "500");
		j.put("stock1", st);
		JSONObject stt=new JSONObject();
		stt.put("stockname", "sony");
		stt.put("noofstock", "5123");
		j.put("stock2", stt);
		JSONObject aa=new JSONObject();
		aa.put("stockname", "mac");
		aa.put("noofstock", "55");
		j.put("stock3", aa);
		ob.put("stock", j);
		
		JSONArray a=new JSONArray();
		a.add(ob);
	System.out.println(a);
	
	
	
	
	
	
	
	
	
//		
	System.out.println(a.get(0));
//		
		JSONObject m=(JSONObject) a.get(0);
		System.out.println(m);
		JSONObject s=(JSONObject)m.get("stock");
		System.out.println(s);
		JSONObject q=(JSONObject)s.get("stock1");
		System.out.println(q);
		String stockname=(String)q.get("Stockname");
		System.out.println(stockname);
		//JSONObject z=(JSONObject)s.get("stock1");
	///	System.out.println(z.get("stock1"));
		//System.out.println(m.get("stockname"));
	}
public static void main(String[] args) {
	create();
}
}
