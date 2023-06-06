package com.gems.codingtrain.arrays;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=123;
		int rev=0;
		
		while(number>0) {
			//tem=number/10;
			rev=rev*10+number%10;
			number/=10;
		}
		   System.out.println("Number after reverse : "+rev);
	}

}
