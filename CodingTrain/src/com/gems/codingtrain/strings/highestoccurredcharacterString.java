package com.gems.codingtrain.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class highestoccurredcharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "gibblegabbler";
		Map<Character,Integer> map=new HashMap<>();
		for(char s:str1.toCharArray()) {
			
			Integer occurence=map.get(s);
			if(occurence==null) {
				map.put(s, 1);
			}
			else {
				map.put(s, occurence+1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
        
        int maxCount = 0;
         
        char maxChar = 0;
         
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
        }
		 System.out.println(maxCount+" : "+maxChar);
		
		}

	}


