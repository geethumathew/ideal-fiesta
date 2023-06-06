package com.gems.codingtrain.arrays;
////kpackage array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = { 1, 1, 2, 2, 3, 4, 5 };
		List<Integer> list = new ArrayList<>(Arrays.stream(test).boxed().toList());
		Set<Integer> a = new TreeSet<>(list);
		for (Integer a1 : a) {
			System.out.println(a1);
		}

		int n = test.length;
		int[] uniqueArray = new int[n];
		int index = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < n; j++) {
				if (test[i] == test[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueArray[index++] = test[i];
			}
		}

		System.out.println(Arrays.toString(uniqueArray));
	}

}
