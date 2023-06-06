package com.gems.codingtrain.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Descending implements Comparator<Students>{

	@Override
	public int compare(Students s1,Students s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}

	

	
	
	
}
public class Studentrunner  {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> s=List.of(new Students("geethu",1),
				new Students("mathew",100),new Students("mollu",45));
		List<Students> s1= new ArrayList<>(s);
		//Collections.sort(s1,new Descending());
		s1.sort(new Descending());
		
		System.out.println(s1);

	}

}
