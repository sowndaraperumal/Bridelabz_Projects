package com.objectoriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Customer {
	
	
	
	
	static 	JSONArray al=new JSONArray();
static JSONArray jsonarray=new JSONArray();
	static Scanner s=new Scanner(System.in);
private String customername;
private String mobilenum;
private String emailid;	
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomername() {
	return customername;
}

public void setCustomername(String customername) {
	this.customername = customername;
}
public String getMobilenum() {
	return mobilenum;
}
public void setMobilenum(String mobilenum) {
	this.mobilenum = mobilenum;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

	


static public void  createcustomer() {
	
Customer customer1=new Customer();
		System.out.println("enter the name");
		customer1.setCustomername(s.next());
		System.out.println("enter the id");
		customer1.setId(s.next());
		System.out.println("mobile number");
		customer1.setMobilenum(s.next());
		System.out.println("enter emailid");
		customer1.setEmailid(s.next());
		
		JSONObject ob=new JSONObject();
		ob.put("cname", customer1.getCustomername());
		ob.put("mobile number", customer1.getMobilenum());
		ob.put("emailid", customer1.getEmailid());
     	 ob.put("id", customer1.getId());
     	 //JSONObject c=new JSONObject();
     	//c.put(customer1.getId(), ob);
		//System.out.println(al.size());
    	 
     	 System.out.println(al.size());
     	 
     	 
     //	 System.out.println(al);
     	JSONParser parser=new JSONParser();
     
     	try{
     		File file=new File("/home/bridgeit/Desktop/2d/customerdetails.json");
     		if(file.length()==0) {
     			//System.out.println("ll");
        		
        			al.add(ob);
        			FinalReport.CustomerDetail(al);
     		}
     			else {
     		Object obj=parser.parse(new FileReader(file));
        	JSONArray ar=(JSONArray)obj;
     		JSONObject json=(JSONObject)ar.get(0);
     		
        if(ar.size()!=0)
        {
        	
    			ar.add(ob);
        }
    	FinalReport.CustomerDetail(ar);
      //  al.add(json);
     			}	
     	
    	
     		 long customer1stock=0;
     		 long customer2stock=0;
     		 long customer3stock=0;
     	JSONObject jsoncustomerid=new JSONObject();
    		JSONObject jsoncustomer=new JSONObject();
    		jsoncustomer.put("customername", customer1.getCustomername());
    		jsoncustomer.put("Id", customer1.getId());
    		jsoncustomer.put("emailid",customer1.getEmailid());
    		jsoncustomer.put("contact", customer1.getMobilenum());
    		System.out.println(jsoncustomer);
			JSONObject stock=new JSONObject();
			JSONObject product1=new JSONObject();
			product1.put("stockname1", "HP");
			product1.put("number of stock", customer1stock);

			
			
			
			JSONObject product2=new JSONObject();
		    product2.put("stockname2", "MAC");
			product2.put("number of stock", customer2stock);
			JSONObject product3=new JSONObject();
    		product3.put("stockname3", "SONY");
    		product3.put("number of stock", customer3stock);
    		JSONArray jsar=new JSONArray();
    		jsar.add(jsoncustomer);
    		
    		
			stock.put("stock1", product1);
			stock.put("stock2", product2);
			stock.put("stock3", product3);

    		jsoncustomer.put("stock", stock);
    		jsoncustomerid.put(customer1.getId(), jsoncustomer);
    		jsonarray.add(jsoncustomerid);
    		
    		
    		FinalReport.user(jsonarray);
    			
        	System.out.println("successfully upgraded" );
        } catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	 
     	
     	
     	
     	




    		 
    	 
    	 
    	 
    	 
     	}
  
     	
     	
}     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
		
		//System.out.println(al.size());
         //System.out.println(al);
		
		
	
		
		/*Customer customer2=new Customer();
		System.out.println("enter the name");
		customer2.setCustomername(s.next());
		System.out.println("mobile number");
		customer2.setMobilenum(s.next());
		System.out.println("enter emailid");
		customer2.setEmailid(s.next());
		
		JSONObject ob1=new JSONObject();
		ob.get(customer2);
		*/
		
		
		
		
		
		
		
		
		



