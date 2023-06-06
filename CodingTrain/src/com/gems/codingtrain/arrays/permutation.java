package com.gems.codingtrain.arrays;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {5,1,2,3,4};
		int sumarray1=0;
		int sumarray2=0;
		
		int multplpyarray1=1;
		int multplpyarray2=1;
		for(int i=0;i<array1.length;i++) {
			 sumarray1+=array1[i];
			 multplpyarray1*=array1[i];
			 	
		}
		
for(int i=0;i<array2.length;i++) {
	sumarray2+=array1[i];
	 multplpyarray2*=array1[i];	
		}

	}

}
