package com.algorithmprogram;
/**
 * 
 * Purpose : Binary conversion
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  24-10-2018
 *
 ********************************************************************/
import com.utility.*;
/*
 * here using scanner class properties
 */

public class BinaryConversion {
	/*
	 * main method for convert the decimal to binary
	 */

	public static void main(String[] args) {
		int decimal;//initialize the  decimal
		System.out.println("enter the dec number");
		decimal=Utility.scanner.nextInt();//getting the input user
		//call the method
		boolean b=false;
		while(b==false) {
			if(decimal<=255)
			{	Utility.binary(decimal);
			b=true;
			break;
			}
			System.out.println("enter only minimum 8 bit not more range is 0 to 255  ");
			
			decimal=Utility.scanner.nextInt();
		}
		Utility.scanner.close();
	}

}
