package Tiaoshi;

class MyThread1 extends Thread{
	private int tickets = 20;
	public void run(){
		for (int i = 0; i < 10; i++) {
			if(this.tickets > 0)
				System.out.println(Thread.currentThread().getName()+":"+this.tickets--);
		}
	}
} 

public class Test03Runnable2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = null;
		MyThread1 mt1 = new MyThread1();
		MyThread1 mt2 = new MyThread1();
		mt1.start();
		mt2.start();
		System.out.println(testString.toString());
	}

}
