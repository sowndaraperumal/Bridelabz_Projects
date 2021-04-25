package com.datastructure;

public class Tree {
	public static long catalanNumber(int n) {
		long x = 2 * n;
		x = fact(x);
		long y = n + 1;
		y = fact(y);
	 long z = fact(n);
		long possibleValue = x / (y * z);
		return possibleValue;
	}

	private static long  fact(long y) {
		long fact = 1;
		for (int i = 1; i <= y; i++) {
			fact = fact * i;
			//System.out.println(fact);
		}
		return fact;
	}

}
