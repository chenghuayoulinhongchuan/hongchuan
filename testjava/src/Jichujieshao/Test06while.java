package Jichujieshao;

public class Test06while {
	public static void main(String[] agrs){
		int x = 1;
		while(x <= 3){
			System.out.println(x);
			if(x == 1)
				continue;
			x ++;
			if(x == 2)
				break;
		}
		System.out.println(x);
//		do{
//			System.out.println(x);
//			x ++;
//		}while(x <= 3);
//		System.out.println(x);
	}
	
}
//do{}while();��ִ��do��Ȼ�����ж�while()����
//continue����ִ��֮���������䣬����ֱ����ת��while()������䵱��