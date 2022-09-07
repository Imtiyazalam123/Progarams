// sorting the person object based on age if age is name then sort based on name
package com.imtiyaz.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1 implements Comparator<Person1> {
	String name;
	int age;
	public Person1() {
		super();
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compare(Person1 p1, Person1 p2) {
		
		Integer ag = this.age;
		if(p1.age < p2.age)
			return -1;
		else if(p1.age > p2.age)
			return 1;
		else
			return p1.name.compareTo(p2.name);
	}
	
}
public class ComparatorDeme {

	public static void main(String[] args) {
		
		List<Person1> al = new ArrayList<Person1>();
		al.add(new Person1("imtiyaz", 23));
		al.add(new Person1("Rishu", 22));
		al.add(new Person1("Alam", 24));
		al.add(new Person1("imtiyaz", 21));
		al.add(new Person1("Abhishekh", 22));
		al.add(new Person1("Alam", 25));
		System.out.println("Before sorting the person object.");
		System.out.println(al);
		System.out.println("After sorting the Person Object");
		Collections.sort(al, new Person1());
		System.out.println(al);	
	}
}