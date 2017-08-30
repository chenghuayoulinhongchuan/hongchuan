package Tuxingjiemian;

import javax.swing.JFrame;

public class Test01Window {
	JFrame f,f1;
	public Test01Window(){
		f = new JFrame("这是我的窗口1");
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f1 = new JFrame("这是我的窗口2");
		f1.setSize(400, 400);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test01Window();
	}

}
