package com.gems.codingtrain.arrays;

import java.util.Arrays;

public class swappingarray {
	
	public int[] swap(int[] array1) {
		int temp=array1[0];
		for(int i=0;i<array1.length/2;i++) {
			
		temp=array1[i];
		array1[i]=array1[array1.length-i-1];
		array1[array1.length-i-1]=temp;
		
	

	}
		return array1;}
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		swappingarray obj=new swappingarray();
		obj.swap(array);
		System.out.println(Arrays.toString(array));
		

}}
