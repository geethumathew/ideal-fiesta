	package com.gems.codingtrain.arrays;

import java.util.Arrays;

public class midlefunction {
	
	public static void main(String[] args) {
		
int[]	myArray = {1, 2, 3, 4};

int[] newmyArray=new int[myArray.length-2];
int index=1;
while(index<myArray.length-1) {
	newmyArray[index -1]=myArray[index];
	index++;
	
}
System.out.println(Arrays.toString(newmyArray));

}}
