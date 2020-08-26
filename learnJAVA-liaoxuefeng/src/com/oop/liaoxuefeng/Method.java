package com.oop.liaoxuefeng;

public class Method {
	public static void main(String[] args) {
		Person x = new Person();
		x.setName("Xiao Ming");
		
	}
}
	
	class Person{
		private String name;
		private int age;
		
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


