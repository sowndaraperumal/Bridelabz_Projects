/**
 * 
 * Purpose :  Stopwatch Program for measuring the time that elapses between
the start and end clicks 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
import com.utility.*;

/*
 * 
 *Here we using Scanner class properties 
 * 
 */
 

public class StopWatch {
	

	
	
	
	
public static void main(String[] args) {
	/*
	 * here we calculate in time between lap
	 */

	/*
	 * start function call 
	 * for getting start time
	 */
	
	double starttime=Utility.start();
	/**
	 * str is used to stop the watch
	 * if you you enter any key stop the time
	 */
	
	
	System.out.println("enter any button to stop");
	String str=Utility.scanner.nextLine();
	/*
	 * if -condition is used to stop the watch
	 * here calculate lap time in between the lap
	 */
	if(true) {
		double stoptime=Utility.stop();
	
	double lap=stoptime-starttime;
	/*
	 * print the lap time in milli sec
	 */
	System.out.println(stoptime+ "  "+starttime);
	System.out.println(lap/1000);
}
	Utility.scanner.close();
	}
}
