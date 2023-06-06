package com.gems.codingtrain.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;


class ordering implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		 return o2.compareTo(o1);
	}
	
}
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new PriorityQueue<>(new ordering());
		q.addAll(List.of("Zebra","Monkey","cat"));

System.out.println(q);
		

	}

}

