package com.interfaceimplementation;

import java.awt.List;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.module.PersonAddressDetail;
import com.module.PersonDetail;
import com.utility.FileReadAndWrite;

public  class AddressBookImplementation implements AdderssBook {
	private static final int ArrayList = 0;
	JSONArray jsonarray=new JSONArray();
	JSONObject jsonp=new JSONObject();
    JSONObject jsona=new JSONObject();
static Scanner scanner=new  Scanner(System.in);
	

@Override
	public ArrayList<PersonDetail> addPerson() {
	String choice="yes";
	boolean b=false;
	
	
	
	
	ArrayList<PersonDetail>alist=new ArrayList<>();
	
	
	
	
	
		while(b==false) {
    PersonDetail person=new PersonDetail();
    PersonAddressDetail personaddress=new PersonAddressDetail();
    System.out.println("enter the firstname");
    String firstName=scanner.next();
    person.setFirstName(firstName);
    System.out.println("enter the lastName");
    String lastName=scanner.next();
   person.setLastName(lastName);
   System.out.println("enter the mobile number");
   String phonenumber=scanner.next();
   personaddress.setPhonenumber(phonenumber);

    System.out.println("enter city name");
    String city=scanner.next();
    personaddress.setCity(city);
    System.out.println("enter state name");
    String state=scanner.next();
    personaddress.setState(state);
    System.out.println("enter zipcode");
    long zipcode=scanner.nextLong();
    personaddress.setZipcode(zipcode);
 
    person.setPersonaddress(personaddress);
    alist.add(person);
    
    System.out.println(alist);
    //FileReadAndWrite.fileWrite(person,filename);
  /*  jsona.put("phonenmber", personaddress.getPhonenumber());
    jsona.put("city", personaddress.getCity());
    jsona.put("state", personaddress.getState());
    jsona.put("zipcode", personaddress.getZipcode());
    jsonp.put("firstname", person.getFirstName());
    jsonp.put("lastname", person.getLastName());
    jsonp.put("address", jsona);
*/	//JSONParser parser=new JSONParser();

    
/*	try{
 		File file=new File(filename);
 		if(file.length()==0) {
 			//System.out.println("ll");
    		
    			jsonarray.add(jsonp);
    	    	//DataStore.datastore(jsonarray);
    			FileReadAndWrite.fileWrite(jsonarray);

    	//		FinalReport.CustomerDetail(json);
 		}
 			else {
 		Object obj=parser.parse(new FileReader(file));
    	JSONArray ar=(JSONArray)obj;
 		JSONObject json1=(JSONObject)ar.get(0);
 		
    if(ar.size()!=0)
    {
    	
			ar.add(jsonp);
    }
	FileReadAndWrite.fileWrite(ar);

			
 			}
*/			
	
	
/*	
}catch (Exception e) {
	// TODO: handle exception
}*/
    
	System.out.println("do you want one more person detail");
	choice=scanner.next();
    if(choice.equals("yes")) {
    	b=false;
    }else {
    	b=true;
    	break;
    }
    
		}
		System.out.println(alist);
		
	    return alist;

    
    
	}

	@Override
	public ArrayList<PersonDetail> editPersonDetail(ArrayList<PersonDetail> existinglist) {
		JSONParser jsonParser=new JSONParser();
		//ArrayList< PersonDetail> editlist=new ArrayList<>();
		System.out.println("which person you want to edit");
	//	FileReadAndWrite.readbook(filename);
String name;
		/*ObjectMapper mapper=new ObjectMapper();
		Object o;
		try {
			o = (Object)jsonParser.parse(new FileReader(filename));
			JSONArray jsonArray=(JSONArray)o;
			//	System.out.println(jsonArray);
				//JSONObject jb=(JSONObject)jsonArray.get(0);
				for (int i = 0; i < jsonArray.size(); i++) {
				editlist.add(mapper.readValue(jsonArray.get(i).toString(), PersonDetail.class));}
*/				
				//System.out.println(  detail.getFirstName()+ " "+detail.getLastName()+ " "+detail.getPersonaddress() );
				 System.out.println("enter firstname");
				 name=scanner.next();
				/* if(name.equals(detail.getFirstName())){
				System.out.println(  detail.getFirstName()+ " "+detail.getLastName()+ " "+detail.getPersonaddress() );
				
 
					*/
				 System.out.println(existinglist);
				for(int i=0;i<existinglist.size();i++) {
					
					if(existinglist.get(i).getFirstName().equals(name)) {
						System.out.println("enter first name");
						String firstname=scanner.next();
						existinglist.get(i).setFirstName(firstname);
					
						System.out.println("enter the last name");
						String lastname=scanner.next();
						existinglist.get(i).setLastName(lastname);
					}
				
				}
				
				
		
		System.out.println(existinglist);
		return existinglist;
}
		
		

		
		
		
		
		
		
	

	@Override
	public ArrayList<PersonDetail> deletePesonDetail(ArrayList<PersonDetail>existinglist) {

		
		
		/*JSONParser jsonParser=new JSONParser();
		ArrayList< PersonDetail> editlist=new ArrayList<>();
		System.out.println("which person you want to edit");
		FileReadAndWrite.readbook(filename);

		ObjectMapper mapper=new ObjectMapper();
		Object o;
		try {
			o = (Object)jsonParser.parse(new FileReader(filename));
			JSONArray jsonArray=(JSONArray)o;
			//	System.out.println(jsonArray);
				//JSONObject jb=(JSONObject)jsonArray.get(0);
				for (int i = 0; i < jsonArray.size(); i++) {
				editlist.add(mapper.readValue(jsonArray.get(i).toString(), PersonDetail.class));}
				
				//System.out.println(  detail.getFirstName()+ " "+detail.getLastName()+ " "+detail.getPersonaddress() );
		*/		 System.out.println("enter firstname");
		String name;
		name=scanner.next();
				/* if(name.equals(detail.getFirstName())){
				System.out.println(  detail.getFirstName()+ " "+detail.getLastName()+ " "+detail.getPersonaddress() );
				
 
					*/
				 System.out.println(existinglist);
				for(int i=0;i<existinglist.size();i++) {
					
					if(existinglist.get(i).getFirstName().equals(name)) {
					existinglist.remove(i);
					}
				
				}
				
		System.out.println(existinglist);
		return existinglist;

		
		
		
		
		
	}

	@Override
	public void sortByZip(ArrayList<PersonDetail> personlist) {
	
		
		System.out.println(personlist); 
	//	Collections.sort(ArrayList<PersonDetail>personlist);

		
		Collections.sort(personlist);
		for(int i=0;i<personlist.size();i++) {
			System.out.println(personlist.get(i));
		}
		
	}

	@Override
	public void print(ArrayList<PersonDetail> personlist) {
		System.out.println("sss");
		System.out.println(personlist);
		for(int i=0;i<personlist.size();i++) {
			System.out.println(personlist.get(i));
		}
		
		
		
	}

	@Override
	public ArrayList<PersonDetail> exit(ArrayList<PersonDetail> list) {
		return list;
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void sortByName(java.util.ArrayList<PersonDetail> personlist) {
		// TODO Auto-generated method stub
Collections.sort(personlist, new Comparator<PersonDetail>() {
	@Override
	public int compare(PersonDetail o1, PersonDetail o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
});
	

		System.out.println(personlist);
		Collections.sort(personlist);
		for(int i=0;i<personlist.size();i++) {
			System.out.println(personlist.get(i));
		}
		
		
		

		
	}

	

	

}
