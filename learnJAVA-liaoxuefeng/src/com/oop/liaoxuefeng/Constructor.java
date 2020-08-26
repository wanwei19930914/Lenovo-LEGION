package com.oop.liaoxuefeng;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p = new Person2("xiaoming", 15);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}

class Person2 {
	private	String	name;
	private int age;
	
	public Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
