package Tuxingjiemian;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Test08JInternal extends JFrame implements ActionListener {
	JDesktopPane desk;
	JButton but;
	int count = 1;
	
	public Test08JInternal(){
		desk = new JDesktopPane();
		but = new JButton("创建内部窗体");
		
		this.getContentPane().add(desk,BorderLayout.CENTER);
		this.getContentPane().add(but,BorderLayout.SOUTH);
		
		but.addActionListener(this);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test08JInternal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JInternalFrame jif = new JInternalFrame("内部窗体"+count++,false,false,false,false);
		jif.setSize(200,200);
		jif.setVisible(true);
		desk.add(jif);
	}

}
