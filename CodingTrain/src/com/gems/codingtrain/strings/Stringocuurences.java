package com.gems.codingtrain.strings;

import java.util.HashMap;
import java.util.Map;

public class Stringocuurences {
	
	public static void Stringoccurence(String Input) {
	
	
	
		String[] words=Input.split(" ");
	
		 Map<String,Integer> map=new HashMap<>();
		 for(String word:words) {
			 Integer s=map.get(word);
			 if(s==null) {
				 map.put(word, 1);
			 }
			 else {
				 map.put(word, s+1);
			 }
			 
		 }
		 for(Map.Entry<String, Integer> entery:map.entrySet()) {
			 System.out.println(entery.getKey()+":"+entery.getValue());
		 }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String Input= "geeks for geeks";
	Stringoccurence(Input);

	}

}
