package Jichujieshao;

import java.util.Scanner;

public class Test03if {
	public static void main(String[] args){
		int money;
		System.out.println("�������ж���Ǯ��");
		Scanner s = new Scanner(System.in);
		money = s.nextInt();
		if(money>=100)
			System.out.println("��ţ��");
		else if(money>=10&&money<=100)
			System.out.println("�Ժ���");
		else
			System.out.println("�Գ���");
	}
}
