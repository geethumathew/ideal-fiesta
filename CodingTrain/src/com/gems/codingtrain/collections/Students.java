package com.gems.codingtrain.collections;

public class Students implements Comparable<Students> {
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Students(String name, int i) {
		super();
		this.name = name;
		this.id = i;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return   name + "  "+ id;
	}
	@Override
	public int compareTo(Students k) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, k.id);
	}
	

}
