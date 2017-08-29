package Yichang;

public class Test01Yichangchuli {
	String x;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01Yichangchuli test = new Test01Yichangchuli();
		try{
			System.out.println(test.x.length());
		}catch(NullPointerException e){
			test.x  ="hello";
			System.out.println(test.x.length());
		}
		finally{
			System.out.println("finally");
		}
//		System.out.println(test.x.length());
	}

}
