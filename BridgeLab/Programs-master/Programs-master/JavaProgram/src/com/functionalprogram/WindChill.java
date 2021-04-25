/**
 * 
 * Purpose : find the chillness of the weather of air
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  22-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 *Here we using Scanner class properties 
 * 
 */
import java.util.Scanner;
import com.utility.*;
public class WindChill {
	/*
	 * find the chillness of the weather of air 
	 */
public static void main(String[] args) {
	double temperature;
	System.out.println("enter the temperture (in Fahrenheit)");
	
	temperature=Utility.scanner.nextDouble();   //temperature t (in Fahrenheit) 
	double velocity;
	System.out.println("enter the wind spped ");
	velocity=Utility.scanner.nextDouble(); //he   wind speed v (in miles per hour)
Utility.windChill(temperature, velocity);
Utility.scanner.close();
}
}
