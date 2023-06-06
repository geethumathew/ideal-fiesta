package com.gems.codingtrain.strings;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "geeks quiz practice code" ;
String[] newString=s.split(" ");
String rev="";
for(int i=newString.length-1;i>=0;i--) {
	rev+=newString[i]+" ";
	
}
System.out.println(rev);		

	}

}
