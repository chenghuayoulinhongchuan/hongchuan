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
//do{}while();先执行do，然后再判断while()条件
//continue不会执行之后的所有语句，而是直接跳转到while()条件语句当中