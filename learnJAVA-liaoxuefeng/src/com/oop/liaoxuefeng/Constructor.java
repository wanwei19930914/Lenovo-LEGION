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

//���ڹ��췽����������⣬���Թ��췽�������ƾ���������
//���췽���Ĳ���û�����ƣ��ڷ����ڲ���Ҳ���Ա�д������䡣
//���ǣ�����ͨ������ȣ����췽��û�з���ֵ��Ҳû��void�������ù��췽����������new��������
