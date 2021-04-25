import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class StockAccount {
public static void main(String[] args) throws Exception {
	Scanner s=new Scanner(System.in);
	boolean b=false;
	
	
	int ch;
	String st="yes";
	while(b==false)
	{
		System.out.println("1.add customer\n2.StockAccount\n3.Print final report");

	System.out.println("enter the choice you want");
	ch=s.nextInt();
	switch(ch) {
	case 1:
		
		Customer.createcustomer();
		break;
	
	case 2:
		CompanyStock.company();
		break;
	
	case 3:
		CompanyStock.company();
	}	
	
	
	
	
	
	if(st.equals("yes")) {
		System.out.println("are you continue the process");
		st=s.next();
	}else {
		b=true;

	}
}
}
}