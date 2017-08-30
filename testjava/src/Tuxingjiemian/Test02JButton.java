package Tuxingjiemian;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test02JButton extends JFrame {
	JPanel p = new JPanel();
	JButton b1 = new JButton("°´Å¥1");
	JButton b2 = new JButton("°´Å¥2");

	public Test02JButton(){
		this.getContentPane().add(p);
		p.setBackground(Color.red);
		p.add(b1);
		p.add(b2);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test02JButton();
	}

}
