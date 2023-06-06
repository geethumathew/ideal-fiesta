package com.gems.codingtrain.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Stringuniquecharacters {

	public static void main(String[] args) {
		String str="geethu";
	
		Set<Character> char_set = new LinkedHashSet<>();
		 
	    // Inserting character of String into set
	    for(int c  = 0; c< str.length();c++)
	    {
	        char_set.add(str.charAt(c));
	    }
	 
	    // If length of set is equal to len of String
	    for (char x : char_set)
            System.out.print(x);
    }
	}
	