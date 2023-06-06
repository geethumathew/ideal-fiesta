package com.gems.codingtrain.arrays;

public class profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7, 1, 5, 3, 6, 4};
		int minvalue=Integer.MAX_VALUE;
		int maxprofit=0;
		for(int min:prices){
			if(minvalue>min) {
				minvalue=min;
				
			}
			else if(min-minvalue>maxprofit) {
				maxprofit=min-minvalue;
			}
		}
		System.out.print(minvalue +" "+maxprofit);
	}

}
