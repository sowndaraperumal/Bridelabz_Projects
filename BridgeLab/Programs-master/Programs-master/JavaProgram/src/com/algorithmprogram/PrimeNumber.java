
package com.algorithmprogram;

public class PrimeNumber {
/**
 * parameter have range between two number
 * @param n
 */
	void range(int n) {
	int count=0; //initialize the count to zero
	/*
	 * iterate the loop for to reach range
	 */
	for(int i=1;i<n;i++) {
		int h=0;
		/*
		 * this iteration for detect any number divisible by other 
		 * if it is divisible by 1 and itself 
		 * that is prime number
		 */
		for(int num=i;num>=1;num--) {
			if(i%num==0) {
				h++;//increment by 1;
			}
		}
		/*
		 * if check prime number or not
		 */
		if(h==2) {
			System.out.println(i);
			count++;
		}
		
		
	}
	//number of prime number in between that range..
System.out.println(count);
}

}
