package com.gems.codingtrain.strings;

public class firstnonrepeatingcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str1 = "gibblegabbler";
		
		 
		for(char i:str1.toCharArray()) {
		 if(str1.indexOf(i) ==str1.lastIndexOf(i)) {
			 System.out.println(i);
			 break;
		 }
		
			 
		
		}
		
		
	}

}
