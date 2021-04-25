package com.algorithmprogram;

public class MergeSort {
	
/**
 * 
 * @param a array of integer
 * @param low first element in array
 * @param high last element in array
 */
    static void sortstring(String a[],int low,int high)
    {
    	/*
    	 * check first element is always less than last element 
    	 */
    	if(low<high)
    	{
    		int mid=(low+high)/2;//initialize the middle & find the middle element 

    		//System.out.println(low+" "+mid);
    		/*
    		 * search element is lesser than middle element 
    		 * and search left side
    		 */
    		sortstring(a, low, mid);
    		//System.out.println((mid+1)+" "+high);
    		/*this method
    		 * search element is greater than middle element 
    		 * and search right side
    		 */
    		sortstring(a,mid+1,high);
    		//System.out.println(low+" "+mid+" "+high);
    		Mergefunction.mergestring(a, low, mid, high);
    	}
	
}
}
