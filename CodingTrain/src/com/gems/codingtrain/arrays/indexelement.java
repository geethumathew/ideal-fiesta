package com.gems.codingtrain.arrays;

public class indexelement {
	
	public int index(int[] a1,int k) {
		int low=0;
		int hight=a1.length;
		int mid=low+hight/2;
		int index=Integer.MAX_VALUE;;
		while(low<hight) {
			
			if(mid==k) {
				index= mid;
				return index;
			}
			else if(mid>k) {
				low=mid+1;
			}
			
			else if(mid<k) {
				hight=mid-1;
			}
			
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] a = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
int K = 7;
indexelement in=new indexelement();
	in.index(a, K);

	}

}
