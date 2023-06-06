package com.gems.codingtrain.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setstopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Character> s=List.of('a','b','c','d','a','c');
Set<Character> s1=new HashSet<Character>(s);
for(char s3:s1) {
	System.out.println(s3);
}

	}

}
