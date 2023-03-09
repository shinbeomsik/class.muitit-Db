package 내화면;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuUI_C {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(700, 1200);
		f.setTitle("가게순위");
		f.setLayout(null);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		Font font = new Font("바탕", 1, 40);
		Font font1 = new Font("굴림", 1 , 20);
		
		JLabel l1 = new JLabel("치킨음식점순위");
		l1.setBounds(235, 10, 600, 100);
		l1.setFont(font);
		l1.setForeground(Color.white);
		
		JLabel l2 = new JLabel("60계 치킨    ★4.9");
		l2.setBounds(450, 170, 300, 100);
		l2.setFont(font1);
		l2.setForeground(Color.white);
		
		JLabel l3 = new JLabel("교촌치킨       ★4.5");
		l3.setBounds(450, 475, 300, 100);
		l3.setFont(font1);
		l3.setForeground(Color.white);
		
		JLabel l4 = new JLabel("네네치킨        ★4.3");
		l4.setBounds(450, 800, 300, 100);
		l4.setFont(font1);
		l4.setForeground(Color.white);
		
		ImageIcon foodIcon1 = new ImageIcon("c1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("c2.jpg");
		ImageIcon foodIcon3 = new ImageIcon("c3.png");
		
		JButton b1 = new JButton(foodIcon1);
		b1.setBounds(100, 100, 285, 270);
		JButton b2 = new JButton(foodIcon2);
		b2.setBounds(100, 400, 285, 270);
		JButton b3 = new JButton(foodIcon3);
		b3.setBounds(100,700 , 285, 270);
		
		
		

		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(b2);
		f.add(l3);
		f.add(b3);
		f.add(l4);
		
		
		
		f.setVisible(true);
	}

}