package Jichujieshao;

import java.util.Scanner;

public class Test03if {
	public static void main(String[] args){
		int money;
		System.out.println("ÄúÏÖÔÚÓÐ¶àÉÙÇ®£¿");
		Scanner s = new Scanner(System.in);
		money = s.nextInt();
		if(money>=100)
			System.out.println("³ÔÅ£ÅÅ");
		else if(money>=10&&money<=100)
			System.out.println("³Ôºº±¤");
		else
			System.out.println("³Ô³´·¹");
	}
}
