package Jichujieshao;

import java.util.Scanner;

/*����10λѧ���ĳɼ��������ж����ǵĳɼ����ĸ��ȼ�������90-100����A����80-89��B����70-79��C����60-69��E����
60��������F��*/

public class Test08yingyongchengxu {
	public static void main(String[] args){
		int index = 0;
		int[] score = new int[10];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("������ɼ�...");
			score[i] = s.nextInt();
		}
		
		while(index<10){
			if(score[index]<=100&&score[index]>=90)
				System.out.println("ѧ��"+index+"�ĵȼ�ΪA��");
			else if(score[index]<=89&&score[index]>=80)
			System.out.println("ѧ��"+index+"�ĵȼ�ΪB��");
			else if(score[index]<=79&&score[index]>=70)
				System.out.println("ѧ��"+index+"�ĵȼ�ΪC��");
			else if(score[index]<=69&&score[index]>=60)
				System.out.println("ѧ��"+index+"�ĵȼ�ΪD��");
			else
				System.out.println("ѧ��"+index+"�ĵȼ�ΪE��");
			index++;
		}
	}
}
