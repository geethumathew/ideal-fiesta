package com.gems.codingtrain.arrays;

import java.util.Scanner;

public class arrayporject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How many days temperature:");
	int numdays=in.nextInt();
	int[] temp=new int[numdays];
	int sum=0;
	for(int i=0;i<numdays;i++) {
	System.out.println("days"+i+1+ "temperature:");
temp[i]=in.nextInt();
	
	sum+=temp[i];
	
	}
	double average=sum/numdays;
	System.out.println(sum);
	System.out.println(average);
	
	int above=0;
	for(int i=0;i<temp.length;i++) {
		
		if(temp[i]>average) {
			above++;
		}
	}
	System.out.println(above);
	}
}
