package com.gems.codingtrain.arrays;

import java.util.Arrays;

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15}; 
		int[] newnums=new int[2];
				int target = 9;
				for(int i=0;i<nums.length;i++) {
					for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					newnums[0]=i;
					newnums[1]=i+1;
					
				}
				}}
				System.out.print(Arrays.toString(newnums));
	}

}
