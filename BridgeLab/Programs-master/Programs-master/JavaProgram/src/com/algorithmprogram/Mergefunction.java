package com.algorithmprogram;

public class Mergefunction {
	/**
	 * 
	 * @param arrayofstring array in integer
	 * @param low first array 
	 * @param middle
	 * @param high
	 */
	static void mergestring(String arrayofstring[], int low, int middle, int high) 
    { 
        
        int n1 = middle - low + 1; //initialize the size1
        int n2 = high - middle; //initialize the size2
  
        String Left[] = new String[n1]; //initialize the array for left side with size1
        String Right[] = new String[n2]; //initialize the array for right side with size2
  
     //storing element left and right
        for (int i=0; i<n1; ++i) 
            Left[i] = arrayofstring[low + i]; 
        for (int j=0; j<n2; ++j) 
            Right[j] = arrayofstring[middle + 1+ j]; 
  
  
        int i = 0, j = 0; 
  
       
        int k = low; 
        /*
         * this loop storing element in the array
         */
        while (i < n1 && j < n2) 
        { 
            if ((Left[i].compareTo(Right[j]))<=0) 
            { 
                arrayofstring[k] = Left[i]; 
                i++; 
            } 
            else
            { 
                arrayofstring[k] = Right[j]; 
                j++; 
            } 
            k++; 
        } 
  
    
        while (i < n1) 
        { 
            arrayofstring[k] = Left[i]; 
            i++; 
            k++; 
        } 
  
       
        while (j < n2) 
        { 
            arrayofstring[k] = Right[j]; 
            j++; 
            k++; 
        } 
    } }
