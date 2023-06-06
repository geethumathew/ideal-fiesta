package com.gems.codingtrain.collections;

public class number {

	
	public static void  printnumbers(int n) {
		
		for(int i=n;i>=1;i--) {
			if(i%2!=0) {
			System.out.println(i*i);
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printnumbers(10);
		

	}

}
