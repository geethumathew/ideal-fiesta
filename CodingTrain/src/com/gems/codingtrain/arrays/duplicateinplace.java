package com.gems.codingtrain.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateinplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, 1, 2,4};
	
	
		int i=0;
			for(int j=1;j<nums.length;j++) {
				if(nums[i]!=nums[j]) {
					i ++;
					nums[i]=nums[j];
				}
			
			}
			System.out.println(i+1);
		}

	}


