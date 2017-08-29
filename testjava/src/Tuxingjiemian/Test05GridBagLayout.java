package Tuxingjiemian;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test05GridBagLayout extends JFrame {
	JButton b1,b2,b3,b4,b5;
	JPanel p;
	
	public Test05GridBagLayout(){
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		b5 = new JButton("Button5");
		
		p = new JPanel();
		this.getContentPane().add(p);
		
		GridBagLayout grid = new GridBagLayout();
		p.setLayout(grid);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.weighty = 1;
		
//		gbc.fill = GridBagConstraints.BOTH;
		
		gbc.anchor = GridBagConstraints.WEST;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p.add(b1,gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		p.add(b2,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		p.add(b3,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		p.add(b4,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		p.add(b5,gbc);
		
//		p.add(b1);
//		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		p.add(b5);

		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test05GridBagLayout();
	}

}
