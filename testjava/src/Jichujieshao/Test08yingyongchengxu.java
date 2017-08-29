package Jichujieshao;

import java.util.Scanner;

/*输入10位学生的成绩，并且判断他们的成绩是哪个等级。其中90-100分是A级，80-89是B级，70-79是C级，60-69是E级，
60分以下是F级*/

public class Test08yingyongchengxu {
	public static void main(String[] args){
		int index = 0;
		int[] score = new int[10];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入成绩...");
			score[i] = s.nextInt();
		}
		
		while(index<10){
			if(score[index]<=100&&score[index]>=90)
				System.out.println("学生"+index+"的等级为A级");
			else if(score[index]<=89&&score[index]>=80)
			System.out.println("学生"+index+"的等级为B级");
			else if(score[index]<=79&&score[index]>=70)
				System.out.println("学生"+index+"的等级为C级");
			else if(score[index]<=69&&score[index]>=60)
				System.out.println("学生"+index+"的等级为D级");
			else
				System.out.println("学生"+index+"的等级为E级");
			index++;
		}
	}
}
