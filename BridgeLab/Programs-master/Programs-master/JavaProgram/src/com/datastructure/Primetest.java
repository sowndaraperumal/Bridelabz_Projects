package com.datastructure;

public class Primetest {
public static void main(String[] args) {
	int a[][]=new int[3][5];
	int c[]= {1,2,3,3,3,3};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<c.length;j++) {
			a[i][j]=c[j];
			System.out.println(a[i][j ]);
		}
	}
}
}
