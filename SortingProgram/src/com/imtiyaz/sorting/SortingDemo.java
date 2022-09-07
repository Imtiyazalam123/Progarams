package com.imtiyaz.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{
	
	String name;
	int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString() {
		
		return "name : "+this.name+", age : "+this.age;
	}
	@Override
	public int compareTo(Person p) {
		//sorting based on age
		Integer a = this.age;
		return a.compareTo(p.age);
		//sorting based on name
//		return this.name.compareTo(p.name);
	}
}
public class SortingDemo {

	public static void main(String[] args) {
		
		List<Person> al = new ArrayList();
		al.add(new Person("imtiyaz", 23));
		al.add(new Person("Rishu", 22));
		al.add(new Person("Alam", 24));
		System.out.println("Before sorting of the Person");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting of the Person");
		System.out.println(al);
	}
}