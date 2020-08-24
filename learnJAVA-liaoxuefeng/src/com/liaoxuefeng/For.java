package com.liaoxuefeng;

public class For {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		int[] ns = { 1, 4, 9, 16, 25 };
        for (int a=0; a<ns.length; a++) {
            System.out.println(ns[a]);
        }
        
        int[] nm = { 1, 4, 9, 16, 25 };
        int su = 0;
        for (int b=0;b<nm.length;b++) {
        	su += nm[b];
            // TODO
        }
        System.out.println(su);
	}
}

/*
for (初始条件; 循环检测条件; 循环后更新计数器) {
// 执行语句
}
*/