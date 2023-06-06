package com.gems.codingtrain.arrays;

import java.util.Scanner;

public class fg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("how may days temperatue");
		int number=in.nextInt();
		int sum=0;
		int[] tem=new int[sum];
		for(int i=0;i<number;i++) {
			System.out.println(" days "+i+1+"temperatue");	
			tem[i]=in.nextInt();
			sum+=tem[i];
			
		}
		double avg=sum/sum;
		int above=0;
		
		
		
}}
 