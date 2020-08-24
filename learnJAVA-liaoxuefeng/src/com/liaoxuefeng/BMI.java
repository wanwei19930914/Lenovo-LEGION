//编写一个计算BMI并判断肥胖程度的小程序
package com.liaoxuefeng;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入体重(kg):");
		int weight = scanner.nextInt();
		System.out.println("请输入身高(m):");
		float height = scanner.nextFloat();
		
		Float BMI = weight/(height*height);
		System.out.println(BMI);
		
		if (BMI>32) {
			System.out.println("非常肥胖");
		}else if (BMI<=32&BMI>28) {
			System.out.println("肥胖");
		}else if (BMI<=28&BMI>25) {
			System.out.println("过重");
		}else if (BMI<=25&BMI>=18.5) {
			System.out.println("正常");
		}else if (BMI<18.5) {
			System.out.println("过轻");
		}
		System.out.println("END");
	}

}
