package com.gems.codingtrain.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Hsshmapsoerting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul"); 
	      map.put(102,"megha"); 
	      System.out.println(map);
			
	     map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}

}
