package com.gems.codingtrain.strings;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		 String str = "listen";
		// TODO Auto-generated method stub
		char[]  str1 = "listen".toLowerCase().toCharArray() ;
		char[] str2 = "silent".toLowerCase().toCharArray() ;
		Arrays.sort(str1);
		Arrays.sort(str2);
	for(int i=0;i<str.length();i++) 
		if(str1[i]!=str2[i]) 
			System.out.println("not anagram");
		
		else 
			System.out.println(" anagram");
		
	}
			
		}

	


