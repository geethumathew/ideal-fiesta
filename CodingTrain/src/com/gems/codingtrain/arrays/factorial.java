package com.gems.codingtrain.arrays;

public class factorial {
	
	public static int  facto(int n) {
	
	if(n==0 ) 
		return 1;
	
	
		
		return n*facto(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(facto(3));
		

	}

}
