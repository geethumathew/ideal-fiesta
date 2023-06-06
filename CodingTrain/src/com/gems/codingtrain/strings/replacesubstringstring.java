package com.gems.codingtrain.strings;

public class replacesubstringstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String Input= "geeksforgeeks";
		String  S1 = "eek";
		String  S2 = "ok";
	String new1 =" ";
		if(Input.contains(S1)) {
			
			new1 =Input.replace(S1,S2);
		}
		System.out.println(new1);

	}

}
