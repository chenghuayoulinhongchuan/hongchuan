package Jichujieshao;

public class Test04yunsuanfubiaodashi {
	public static void main(String[] args){
		int x = 10;
		int y = 3;
		y++;//y = y+1
		y--;//y = y-1
		boolean z = (y>4)?true:false;
		int f = (y>4)?1:100;
		System.out.println(f);
		System.out.println(z);
		System.out.println(!(y>3));
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(y);
		System.out.println(x!=y);
	}
}
//算术运算符：+、-、*、/、%、++、--
//赋值运算符：=、+=(加赋值)、-=(减赋值)、*=(乘赋值)、/=(除赋值)、%=(模赋值)
//关系运算符：>=、<=、>、<、==、!=----结果是true或是false
//逻辑运算符：&(按位与)、|(按位或)、&&(逻辑与----运算量小)、||(逻辑或----运算量小)、!、^
//位运算符：<<、>>
//三目运算符：？
//表达式：运算符和操作数结合在一起才能有意义，也就是表达式