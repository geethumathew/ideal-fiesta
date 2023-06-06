package com.gems.codingtrain.arrays;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String str = "A man, a plan, a canal, Panama";
		  
		  str = str.replaceAll("\\s", "").replaceAll(",","").toLowerCase();
		  System.out.println(str);
		  String rev="";
		  for(int i=str.length()-1;i>=0;i--) {
			  rev+=str.charAt(i);
		  }
		  
		 System.out.println(rev);   

	}

}
