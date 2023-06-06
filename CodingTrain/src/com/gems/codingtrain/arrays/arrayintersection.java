package com.gems.codingtrain.arrays;

import java.util.HashSet;
import java.util.Set;

public class arrayintersection {
	
	public static int[] arrayIntersection(int[] array1 ,int[] array2) {
		
		Set<Integer> s=new HashSet<>();
		Set<Integer> s2=new HashSet<>();
		for(int nums:array1) {
			s.add(nums);
		}
		for(int nums:array2) {
			if(s.contains(nums))
			s2.add(nums);
		}
		int[] newArray=new int[s2.size()];
		int index=0;
		for(int nums :s2) {
			newArray[index++]=nums;
		}
		return newArray;
	}
	
	
	
	public static void main(String[] args) {
	int[] array1= {1, 2, 2, 1};
	int[] array2= {2, 2}; 
	int[] arrayIntersection = arrayIntersection(array1, array2);
for(int nums:arrayIntersection) {
	
	System.out.println(nums);
}

}}
