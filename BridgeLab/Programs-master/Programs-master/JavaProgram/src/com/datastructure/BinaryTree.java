/**
 * 
 * Purpose : Binary tree     
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  27-10-2018
 *
 ********************************************************************/

package com.datastructure;
/*
 * here using scanner class properties
 */
import java.util.Scanner;

public class BinaryTree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of nodes");
		int number=sc.nextInt();//initialize the node
		int arr[]=new int[number];
		/*
		 * iterate the loop for number the node
		 */
		for(int i=0;i<number;i++)
		{
			System.out.println("enter the number you want to give");
			arr[i]=sc.nextInt();
			//call the binary search tree method
			long x=Tree.catalanNumber(arr[i]);
			System.out.println("the possible number of "+arr[i]+"  length "+x);
		}
	}
}
