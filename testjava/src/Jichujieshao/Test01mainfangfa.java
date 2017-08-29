package Jichujieshao;

class Mother{
	
}

public class Test01mainfangfa {
	public static void dogwang(){
		System.out.println("wang wamg");
	}
	public static void main(String[] args){
		Test01mainfangfa obj = new Test01mainfangfa();
		obj.dogwang();
		System.out.println("欢迎来到JAVA世界");
		dogwang();
	}
}
//1、这个是警告,不是错误,不影响你使用
//2、你的get方法是static静态方法,直接使用"类.方法"就行了,因为静态方法在对象创建前就存在了,他的使用不依赖对象是否被创建.
//3、非静态的方法用"对象.方法"的方式,因为他在对象创建前不存在,必须依赖对象的创建后,才能使用
//4、由于在本类调用,可以直接使用方法
//5、用类.方法可以,不过本类中,这样有点啰嗦