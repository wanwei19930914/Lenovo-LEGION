//��дһ������BMI���жϷ��̶ֳȵ�С����
package com.liaoxuefeng;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������(kg):");
		int weight = scanner.nextInt();
		System.out.println("���������(m):");
		float height = scanner.nextFloat();
		
		Float BMI = weight/(height*height);
		System.out.println(BMI);
		
		if (BMI>32) {
			System.out.println("�ǳ�����");
		}else if (BMI<=32&BMI>28) {
			System.out.println("����");
		}else if (BMI<=28&BMI>25) {
			System.out.println("����");
		}else if (BMI<=25&BMI>=18.5) {
			System.out.println("����");
		}else if (BMI<18.5) {
			System.out.println("����");
		}
		System.out.println("END");
	}

}
