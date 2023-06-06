package com.gems.codingtrain.java8.functional;

import java.util.Arrays;
import java.util.List;

public class streamcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
		long count=stringList.stream().filter(n->n.length()>3).count();

	}

}
