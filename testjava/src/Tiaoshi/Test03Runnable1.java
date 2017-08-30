package Tiaoshi;

class MyThread implements Runnable{
	private int tickets ;
	public MyThread(){
		tickets = 20;
	}
	public void run(){
		synchronized(this){
			for (int i = 0; i < 10; i++) {
				if(this.tickets > 0)
					System.out.println(Thread.currentThread().getName()+":"+this.tickets--);
			}
		 }
	}
}

public class Test03Runnable1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		new Thread(mt,"线程1").start();
		new Thread(mt,"线程2").start();
	}

}
