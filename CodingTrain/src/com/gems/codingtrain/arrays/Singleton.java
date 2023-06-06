package com.gems.codingtrain.arrays;

public class Singleton {
	
	private static Singleton obj;
	public Singleton() {}
	
	private static synchronized Singleton getinstance() {
		if(obj==null)
		obj=new Singleton();
		return obj;
	}

}
