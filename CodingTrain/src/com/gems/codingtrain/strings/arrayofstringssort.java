package com.gems.codingtrain.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class decending implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}
	
}

public class arrayofstringssort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"GeeksforGeeeks", "I", "from", "am"};
		List<String> s1=Arrays.asList(s);
		
		List<String> s2= new ArrayList<>(s1);
		
		String max=s2.stream().max((n1,n2)->Integer.compare(n1.length(), n2.length())).get();
		System.out.println(max);
		s2.sort(new decending());
		System.out.println(s2);
		

}}

	
