package com.gems.codingtrain.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmaptutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };
		List<Integer> s= Arrays.stream(a).boxed().toList();
		List<Integer> s1=new ArrayList<>(s);
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<s1.size();i++) {
			map.putIfAbsent(s1.get(i), Collections.frequency(
                    s1, s1.get(i)));

			
		}
		 System.out.println(map);
		

	}

}
