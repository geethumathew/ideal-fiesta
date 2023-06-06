package com.gems.codingtrain.arrays;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7, 1, 5, 3, 6, 4};
		int min=Integer.MAX_VALUE;
		int profit=0;
		for(int minvalue:prices) {
			
			if(min>minvalue) {
			min=minvalue;
				
			}
			
			else if( ( minvalue-min)>profit) {
				profit=minvalue-min;
				
			}
		}
System.out.println(profit);
	}

}
