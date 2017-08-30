package Tuxingjiemian;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Test07JTabbedPane extends JFrame {
	JPanel p1,p2,p;
	JTabbedPane tp;
	
	public Test07JTabbedPane(){
		p1 = new JPanel();
		p2 = new JPanel();
		p = new JPanel();
		
		tp = new JTabbedPane(JTabbedPane.BOTTOM);
		String[]  tabname = {"选项卡1","选项卡2"};
		
		this.getContentPane().add(p);
		p.setLayout(new GridLayout(1,1));
		p.add(tp);
		tp.addTab(tabname[0],p1);
		tp.addTab(tabname[1], p2);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test07JTabbedPane();
	}

}
