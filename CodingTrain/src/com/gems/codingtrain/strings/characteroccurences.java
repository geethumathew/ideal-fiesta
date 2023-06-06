package com.gems.codingtrain.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class characteroccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "gibblegabbler";
		Map<Character, Integer> map = new HashMap<>();
		for (char s : str1.toCharArray()) {
			Integer occurence = map.get(s);
			if (occurence == null) {
				map.put(s, 1);
			} else {
				map.put(s, occurence + 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());

			}
		}
	}
}


