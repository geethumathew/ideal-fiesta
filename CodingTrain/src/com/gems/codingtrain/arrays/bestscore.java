package com.gems.codingtrain.arrays;

import java.util.Arrays;

public class bestscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {84,85,86,87,85,90,83,23,45,84,1,2,0};

		int maxvalue=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		   for (int score : myArray) {
	    if(maxvalue<score) {
	    	max2=maxvalue;
	    	maxvalue=score;
	    	
	    	
	    }
	    }
	System.out.println(maxvalue+" "+max2);
	}
	}