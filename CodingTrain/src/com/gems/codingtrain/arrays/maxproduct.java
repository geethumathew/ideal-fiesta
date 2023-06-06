package com.gems.codingtrain.arrays;

public class maxproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {10,20,30,40,50};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int value:intArray) {
			if(max1<value) {
				max2=max1;
				max1=value;
				
			}
		}
System.out.println(max2 +" "+max1);

	}

}
