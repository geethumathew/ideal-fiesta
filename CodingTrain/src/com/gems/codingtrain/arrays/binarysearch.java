package com.gems.codingtrain.arrays;

public class binarysearch {

	public static int indexSearch(int array[], int index) {
		int low = 0;
		int hight = array.length - 1;

		while (low < hight) {
			int mid = low + (hight - low) / 2;
			if (array[mid] == index) {

				return mid;
			}

			if (array[mid] > index)
				hight = mid - 1;

			else

				low = mid + 1;

		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5 };
		int index = 4;
		int reult = binarysearch.indexSearch(array, index);
		System.out.println(reult);

	}

}
