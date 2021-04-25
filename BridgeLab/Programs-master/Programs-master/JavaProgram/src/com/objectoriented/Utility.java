package com.objectoriented;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

BufferedReader b;
private final  String Regexname="<<name>>";
private final String RegexFullname="<<fullname>>";
private final String RegexMobileno="xxxxxxxxxx";
private final String RegexDate="01/01/2016";
  
public Utility() {

	b=new BufferedReader(new InputStreamReader(System.in));
}


public String  convertString(UserDetails ud,String msg) {
	Pattern p=Pattern.compile(Regexname);
	Matcher m=p.matcher(msg);
	msg=m.replaceAll(ud.getFirstname());
	 
	 p=Pattern.compile(RegexFullname);
	 m=p.matcher(msg);
	msg=m.replaceAll(ud.getFirstname()+" "+ud.getLastlname());
	p=Pattern.compile(RegexMobileno);
	m=p.matcher(msg);
	msg=m.replaceAll(ud.getMobileno());
	p=Pattern.compile(RegexDate);
	m=p.matcher(msg);
	msg=m.replaceAll(ud.getDate());
	System.out.println("ss");
	return msg;
	
}

public String inputString() {
	try {
		return b.readLine();
	}
	catch (IOException ioe) {
System.out.println(ioe.getMessage());	}
return "";
}

public Date printdate(String date) {
	SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
	try {
		return  d.parse(date);
	}
	catch (Exception e) {
return null;
}
}
public String formatdate(String date) {
	SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
	return d.format(printdate(date));
}


public String getfile() {
	try {
		b=new BufferedReader(new FileReader("/home/bridgeit/Desktop/2d/Regex.txt"));
		StringBuilder sb=new StringBuilder();
		String line=b.readLine();
				//String str="";
		while(line!=null) {
			sb.append(line);
			sb.append(System.lineSeparator());
			line=b.readLine();
			break;
			//str=sb+" ";
		}
		System.out.println("helo");
System.out.println(sb.toString());
return sb.toString();
	}
	catch(Exception e){
		return null;
		
	}
}}
