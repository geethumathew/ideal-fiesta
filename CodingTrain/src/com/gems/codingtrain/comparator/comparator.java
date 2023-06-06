package com.gems.codingtrain.comparator;

import java.util.ArrayList;
import java.util.Comparator;


class sortingalagoritham implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.salary, o2.salary);
	}

	
	
}

class Employee{
	
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee[name="+name+",salary="+salary+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
public class comparator {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		List<String> list=List.of("geethu","mathe","ok");
//		List<String> arraylist=new ArrayList<>(list);
//		
//		arraylist.sort(new sortingalagoritham());
//		
//		System.out.println(arraylist);
		
		Employee e1=new Employee("geethu",1000);
		Employee e2=new Employee("mathew",100);
		Employee e3=new Employee("amal",200);
		ArrayList<Employee> array=new ArrayList();
		array.add(e1);
		
		array.add(e2);
		array.add(e3);
		//array.sort( new sortingalagoritham());
		
	    array.sort(Comparator.comparingInt(Employee::getSalary));
		System.out.println(array.toString());
	

	}
	/**
	 *  1. what are the main methods inside Object class - - equals(), toString(), hashCode()
	 *  2. how does equals() and hashCode() behaves
	 *  3. How to use Comaparator to compare collection of Custom objects Like sorting Employees using Salary
	 * 		3.1 using Java 8 syntax ?
	 *  4. How does Integer.compare() method compares, x > y ? -1 : (x ==y) 0 : 1
	 *  
	 * */
}

