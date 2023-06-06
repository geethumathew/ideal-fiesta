package com.gems.codingtrain.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		
		List<String> a= List.of("geethu","mathew","elizebeth");
		List<String> a1= List.of("geethu","mathew","elizebeth");
		List<String> a3= List.of("geethu","mathew","elizebeth");
		List<String> a4= new ArrayList<>();
		a4.addAll(a);
		a4.addAll(a1);
		a4.addAll(a4);
		System.out.println(a4);
		// TODO Auto-generated method stub
	
		List<String> u=new ArrayList<>(a);
		u.add(3,"amal");
		 int index=u.indexOf("geethu");
		Iterator<String> itr=u.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i=0;i<u.size();i++) {
			System.out.println(u.get(i));
		}
		
		for(String a5:u) {
			if(a5.endsWith("h")){
				System.out.println(a5);
			}
		}
		Iterator<String> itr1=a.iterator();
		while(itr1.hasNext()) {
			if(itr1.next().endsWith("w")) {
				itr.remove();
			}
			System.out.println(a);
		}	
		

	}

}
