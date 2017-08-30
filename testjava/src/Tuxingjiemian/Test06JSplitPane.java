package Tuxingjiemian;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Test06JSplitPane extends JFrame implements ActionListener {
	JPanel p,p1,p2;
	JButton b;
	JSplitPane sp;
	int ore = 0;
	public Test06JSplitPane(){
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		
		b = new JButton("¸Ä±ä");
		
		p1.setBackground(Color.blue);
		p2.setBackground(Color.gray);
		
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
		
		p.add(b);
		
		this.add("Center",sp);
		this.add("South",p);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test06JSplitPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(ore == 0){
			sp.setOrientation(JSplitPane.VERTICAL_SPLIT);
			ore = 1;
		}
		else{
			sp.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
			ore = 0;
		}
	}

}
