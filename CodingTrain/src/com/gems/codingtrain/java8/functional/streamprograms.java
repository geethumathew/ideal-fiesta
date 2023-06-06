package com.gems.codingtrain.java8.functional;

import java.util.List;
import java.util.stream.IntStream;

public class streamprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.range(1,10).map(x->x * x).forEach(System.out::println);
		List<String> animals=List.of("Apple","Ant","Bat");
		animals.stream().map(String::toLowerCase).forEach(System.out::println);
		animals.stream().map(x->x.length()).forEach(System.out::println);
		String max=animals.stream().max((n1,n2)->Integer.compare(n1.length(), n2.length())).get();
		System.out.println(max);
		

	}

}
