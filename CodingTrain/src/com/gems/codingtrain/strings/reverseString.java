package com.gems.codingtrain.strings;

public class reverseString {
 public static void main(String args[]) {
	String s="geethu";
	 StringBuffer s1=new StringBuffer(s);
	 System.out.println(s1.reverse());
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
		
	}
	System.out.println(rev);
}
 

 
}