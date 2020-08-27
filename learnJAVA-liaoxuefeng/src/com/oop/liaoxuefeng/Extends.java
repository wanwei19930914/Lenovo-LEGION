package com.oop.liaoxuefeng;

public class Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Xiao Ming", 12, 89);
		
		System.out.println(s.getName()+s.getAge());
	}

}

class Person4{
	private String name;
	private int age;
	
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if (age<0 || age>100) {
			throw new IllegalArgumentException("invalid age value");
		}
		this.age = age;
	}
}

class Student extends Person4{
	protected int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
}
