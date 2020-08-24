package com.liaoxuefeng;
import java.util.Scanner;

public class in_and_out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("input your name:");
//		String name = scanner.nextLine();
//		System.out.println("input your name:");
//		int age = scanner.nextInt();
//		System.out.printf("Hi, %s, you are %d years old\n", name, age);
		
		System.out.print("A,");
		System.out.print("B,");
		System.out.print("C.");
		System.out.println();
		System.out.println("END");
		
		double d = 12900000;
		System.out.println(d);
		
		double e = 3.1415926;
		System.out.printf("%.2f\n", e);
		System.out.printf("%.4f\n", e);
		
		int n = 12345000;
		System.out.printf("n=%d, hex=%08x", n, n);
		System.out.println();
		
		int a = 50;
		if (a>=60) {
			System.out.println("及格了");
		} else {
			System.out.println("挂科了");
		}
		System.out.println("END");
	}

}
