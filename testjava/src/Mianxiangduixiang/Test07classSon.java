package Mianxiangduixiang;
import Jichujieshao.*;

public class Test07classSon extends Test07classFather{
	public void print(){
		System.out.println("Son");
	}
	public void a(){
		System.out.println("a");
	}
	public static void main(String[] args){
		Test07classFather obj = new Test07classSon();
		obj.print();
		
	}
}
