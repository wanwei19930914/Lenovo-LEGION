package com.liaoxuefeng;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; ; i++) {
			sum+=i;
			if (i == 100) {
				break;
			}
		}
		System.out.println(sum);
		
		for(int i=1; i<=10; i++) {
			System.out.println("i= " +i);
			for(int j=1; j<=10; j++) {
				System.out.println("j= "+j);
				if(j>=i) {
					break;
				}
			}
			System.out.println("break");
			//breakֻ�����Լ�������һ���ѭ����
		}
		
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue; 
            }
            sum1 = sum1 + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum1);
        //continue��ǰ������ǰѭ����ʼ��һ��ѭ����
	}

}
