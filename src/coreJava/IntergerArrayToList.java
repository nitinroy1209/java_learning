package coreJava;   //integer to list

import java.util.Arrays;
import java.util.*;


public class IntergerArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first way
		
		int ar=10;
		
		Integer arr[]= {10,20,30};
		
		ArrayList val = new ArrayList(Arrays.asList(arr));
		System.out.println(val);
		
		
		//second way
		
		int[] arr1= {1,2,3,4,5};
		
		ArrayList val1= new ArrayList();
		
		for(int value:arr1)
		{
			val1.add(value);
		}
		
		System.out.println(val1);
	}

}