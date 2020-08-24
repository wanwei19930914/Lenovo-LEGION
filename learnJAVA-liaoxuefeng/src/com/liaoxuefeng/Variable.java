package com.liaoxuefeng;

public class Variable {

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		x = 200;//第一次定义变量时使用int，第二次使用时x已经存在，直接赋值，不能重复定义。
		System.out.println(x);

	}

}
