import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Customer {
	static 	JSONArray al=new JSONArray();;
	static Scanner s=new Scanner(System.in);
private String customername;
private String mobilenum;
private String emailid;	
	
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

	


static JSONArray createcustomer() {
	
Customer customer1=new Customer();
		System.out.println("enter the name");
		customer1.setCustomername(s.next());
		System.out.println("mobile number");
		customer1.setMobilenum(s.next());
		System.out.println("enter emailid");
		customer1.setEmailid(s.next());
		
		JSONObject ob=new JSONObject();
		ob.put("cname", customer1.getCustomername());
		ob.put("mobile number", customer1.getMobilenum());
		ob.put("enmailid", customer1.getEmailid());
	 
		//System.out.println(al.size());
		if(al.size()!=0)
		{
			//System.out.println("ll");
		
			al.add(ob);
		}else {
			al.add(ob);
		}	//System.out.println(al.size());
//System.out.println(al);
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		
		
		
	    try(FileWriter file=new FileWriter("/home/bridgeit/Desktop/2d/customerdetails.json")){
	    	file.write(al.toString());
	    	file.flush();
	    }
	    catch (Exception e) {
	e.getMessage();
	    }
		return al;
		
		
		
		
		
	
		
		
		
		
		
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
		
		
		
		
		
		
		
		
		

}
}
