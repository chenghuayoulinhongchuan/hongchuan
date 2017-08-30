package Tuxingjiemian;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test03JTextField implements ActionListener{
	JFrame j = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton("按钮1");
	JButton b2 = new JButton("按钮2");
	JTextField text = new JTextField("初始化",20);
	JLabel lable = new JLabel("请输入用户姓名：");
	Font f = new Font("黑体",Font.ITALIC,15);
	
	ActionTest t = new ActionTest();
	
	public Test03JTextField(){
		j.setSize(500,500);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.getContentPane().add(p);
		p.add(lable);
		p.add(text);
		text.setFont(f);
//		p.add(lable);
		p.add(b1);
		p.add(b2);
		b1.setSize(10, 10);
		b2.setSize(10, 10);
		
		b1.addActionListener(t);
		b2.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test03JTextField();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b=(JButton)e.getSource();
		if(b == b1)
			JOptionPane.showMessageDialog(null, "您按下了按钮1");
		else
			JOptionPane.showMessageDialog(null, "您按下了按钮2");
	}
}

class ActionTest implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "您按下了按钮");
	}
	
}
