import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PracticeProject {
	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		
		JFrame frame2 = new JFrame();
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		
		frame2.add(panel,BorderLayout.CENTER);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setTitle("Our GUI");
		frame2.pack();
		frame2.setVisible(true);
		
		JButton button = new JButton("click it");
		panel.add(button);
		JLabel label = new JLabel("Number of clicks: 0");
		button.addActionListener(null);
		
		
		
		JButton button1= new JButton("hello");
		
		JButton button2 = new JButton("what is up");
		
		button1.setBounds(160, 150, 80, 80);
		button2.setBounds(190,190, 100, 200);
		
		
		frame1.add(button1);
		frame1.add(button2);
		
		
		frame1.setSize(400,500);
		frame1.setLayout(null);
		frame1.setVisible(true);
	}
}
