package 미니프로젝트보관소;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import 미니프로젝트.P_storeVO;
import 미니프로젝트.p_storeDAO;

public class MenuUI_C {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(700, 1200);
		f.setTitle("가게순위");
		f.setLayout(null);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		Font font = new Font("바탕", 1, 40);
		Font font1 = new Font("굴림", 1, 20);

		
		
		
		
		JLabel l1 = new JLabel("치킨음식점");
		l1.setBounds(10, 10, 600, 100);
		l1.setFont(font);
		l1.setForeground(Color.white);

		JLabel l2 = new JLabel("60계치킨    ★4.9");
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

		C_store store = new C_store();
		JButton b1 = new JButton(foodIcon1);
		b1.setBounds(100, 100, 285, 270);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				store.openc1();

			}
		});
		JButton b2 = new JButton(foodIcon2);
		b2.setBounds(100, 400, 285, 270);

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				store.openc2();

			}
		});
		JButton b3 = new JButton(foodIcon3);
		b3.setBounds(100, 700, 285, 270);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				store.openc3();

			}
		});
		
		Font font2 = new Font("굴림", 1, 15);
		
		
		JButton b4 = new JButton("점포 등록");
		b4.setFont(font2);
		b4.setBounds(330, 25, 100, 50);
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p_storeDAO dao = new p_storeDAO();
				P_storeVO bag = new P_storeVO();
				
				String name = JOptionPane.showInputDialog("가게이름을 적어주세요");
				String category = JOptionPane.showInputDialog("카테고리을 적어주세요");
				String rating = JOptionPane.showInputDialog("별점을 적어주세요");
				double rating2 = Double.parseDouble(rating);
				
				bag.setName(name);
				bag.setCategory(category);
				bag.setRating(rating2);
				
				int result = dao.insert(bag);
				
			}
		});
		
		JButton b5 = new JButton("점포 탈퇴");
		b5.setFont(font2);
		b5.setBounds(430, 25, 100, 50);
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p_storeDAO dao = new p_storeDAO();
				P_storeVO bag = new P_storeVO();
				
				String name = JOptionPane.showInputDialog("가게이름을 적어주세요");
				
				bag.setName(name);
				
				int result = dao.delete(bag);
				
			}
		});
		

		JButton b6 = new JButton("벌점 수정");
		b6.setFont(font2);
		b6.setBounds(530, 25, 100, 50);
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p_storeDAO dao = new p_storeDAO();
				P_storeVO bag = new P_storeVO();
				
				String name = JOptionPane.showInputDialog("가게이름을 적어주세요");
				String rating = JOptionPane.showInputDialog("고칠 별점을 입력해주세요");
				double rating2 = Double.parseDouble(rating);
				
				bag.setName(name);
				bag.setRating(rating2);
				
				int result = dao.update(bag);
				
			}
		});
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(b2);
		f.add(l3);
		f.add(b3);
		f.add(l4);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		
		f.setVisible(true);
	}

	private static void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

}