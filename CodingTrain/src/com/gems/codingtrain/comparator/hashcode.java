package com.gems.codingtrain.comparator;

import java.util.Objects;

public class hashcode {
	
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public hashcode(String name,int id) {
		super();
		this.name = name;
		this.id =id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		hashcode other = (hashcode) obj;
		return id == other.id && Objects.equals(name, other.name);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashcode s1=new hashcode("geethu",1);
		hashcode s2=new hashcode("geethu",2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
