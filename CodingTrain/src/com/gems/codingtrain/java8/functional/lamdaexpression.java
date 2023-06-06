package com.gems.codingtrain.java8.functional;

import java.util.List;

public class lamdaexpression {

	public static void main(String[] args) {
		List<Integer> n=List.of(1,2,3,4,5);
		n.stream().filter(n1->n1%2==0).forEach(System.out::println);
		int max=n.stream().max((n1,n2)->Integer.compare(n1, n2)).get();
		System.out.println(max);

	}

}
