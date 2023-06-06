package com.gems.codingtrain.strings;

public class stringoc {
	
	public static  String occurence(int n) {
		String newline="";
		for(int i=0;i<n;i++) {
			
			newline+='*';
		}
		return newline;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(stringoc.occurence(n));
		

	}

}
