package com.gems.codingtrain.strings;

public class Stringrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "abcd";
	        String s2 = "cdac";
	        if(s1.length()==s2.length() && (s1+s1).contains(s2)) {
	        	System.out.println("rotation");
	        }
	        else {
	        	System.out.println(" no rotation");
	        }
	        	

	}

}
