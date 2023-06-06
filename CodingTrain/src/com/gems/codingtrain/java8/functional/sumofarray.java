package com.gems.codingtrain.java8.functional;

import java.util.List;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> n=List.of(1,2,3,4,5);
		 int sum=n.stream().reduce(0,(n1,n2)->(n1+n2));
			System.out.println(sum);	
			
			n.stream().sorted().map(n3->n3*n3).forEach(System.out::println);

	}

}
