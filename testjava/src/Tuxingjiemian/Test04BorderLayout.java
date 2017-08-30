package Tuxingjiemian;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test04BorderLayout extends JFrame {
	JPanel P1,P2,P3,P4,P5,P;
	JButton bt = new JButton("°´Å¥");
	
	public Test04BorderLayout(){
		P1 = new JPanel();
		P2 = new JPanel();
		P3 = new JPanel();
		P4 = new JPanel();
		P5 = new JPanel();
		P = new JPanel();
		
		P1.setBackground(Color.red);
		P2.setBackground(Color.black);
		P3.setBackground(Color.green);
		P4.setBackground(Color.orange);
		P5.setBackground(Color.white);
		
		this.getContentPane().add(P);
		BorderLayout b1 = new BorderLayout();
		P.setLayout(b1);
		
//		P.add("North", P1);
//		P.add("South",P2);
		P.add("Center",P3);
		P.add("East",P4);
//		P.add("West",P5);
		
//		P.add(P1,BorderLayout.NORTH);
//		P.add(P2,BorderLayout.SOUTH);
//		P.add(P3,BorderLayout.CENTER);
//		P.add(P4,BorderLayout.EAST);
//		P.add(P5,BorderLayout.WEST);
		
		P4.add(bt);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test04BorderLayout();
	}

}
