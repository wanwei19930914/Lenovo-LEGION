package com.liaoxuefeng;

import java.awt.print.Printable;

public class Sum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 100;
		while (n > 0) {
			sum = sum + n;
			n = n - 1;
		}
		System.out.println(sum);
	}

}
