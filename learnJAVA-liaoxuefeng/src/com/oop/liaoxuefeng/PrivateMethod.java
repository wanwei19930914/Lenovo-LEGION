package com.oop.liaoxuefeng;

public class PrivateMethod {
	public static void main(String[] args) {
		Person1 ming = new Person1();
		ming.setName("Xiao Ming");
		ming.setBirth(2008);
		System.out.println(ming.getName()+ "½ñÄê" +ming.getAge()+"Ëê");
		
		Group g = new Group();
		g.setName("1","2","3");
		
		System.out.println();
	}

}

class Person1 {
	private String name;
	private int birth;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	public int getAge(){
		return calcAge(2019);
	}
	
	private int calcAge(int currentYear) {
		return currentYear - this.birth;
	}
}

class Group {
	private String[] names;
	public void setName(String...names) {
		this.names = names;
	}
}
