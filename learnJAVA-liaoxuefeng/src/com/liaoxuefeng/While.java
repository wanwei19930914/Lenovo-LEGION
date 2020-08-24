package com.liaoxuefeng;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 1;
		while(n<=100) {
			sum += n;
			n++;
		}
		System.out.println(sum);
		
		int s = 0;
		int a = 20;
		int b = 100;
		//¼ÆËãa+...+b
		while(a<b){
			s+=a;
			a++;
		}
		System.out.println(s);
	}

}
