package Tuxingjiemian;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test08CardLayout extends JFrame implements ActionListener {
	JPanel p1,p2,p3;
	JButton b1,b2;
	CardLayout card;
	
	public Test08CardLayout(){
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		b1 = new JButton("显示绿色面板");
		b2 = new JButton("显示红色面板");
		
		card = new CardLayout();
		p1.setLayout(card);
		
		p2.add(b1);
		p3.add(b2);
		
		p2.setBackground(Color.red);
		p3.setBackground(Color.green);
		
		p1.add("pane1",p2);
		p1.add("pane2",p3);
		
		this.getContentPane().add(p1);
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
//		card.show(p1,"pane2");
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test08CardLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b == b1)
			card.show(p1,"pane2");
		if(b == b2)
			card.show(p1,"pane1");
	}

}
