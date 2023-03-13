package 미니프로젝트보관소;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import 미니프로젝트.P_storeVO;
import 미니프로젝트.p_storeDAO;


public class C_store {
	
	//60계치킨
	public static void openc1() {
		JFrame f = new JFrame("60계치킨");
		f.setBounds(300, 0, 700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("c1.jpg");
		ImageIcon foodIcon1 = new ImageIcon("mc1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mc2.png");
		ImageIcon foodIcon3 = new ImageIcon("mc3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "60계치킨";
				
				p_storeDAO dao = new p_storeDAO();
				P_storeVO bag = dao.one(name);
			
				if (bag != null) {
					
					String result = "가게 :" + bag.getName() +
							"\n 키테고리 :" + bag.getCategory() + 
							"\n 별점  :" + bag.getRating();
					
					JOptionPane.showMessageDialog(f, result);
					
					}else {
					JOptionPane.showMessageDialog(f, "검색결과없음");
				}
			}
		});
		
		
		String content = "★★★★☆  4.9" +"\n 최소주문금액: 15000원" + "\n 결제: 신용카드,현금"  
						+ "\n 배달시간: 55~65분";
		JTextArea a1 = new JTextArea(content);
		a1.setFont(font);
		a1.setBounds(350, 50, 250, 150);
		
		String content2 ="후라이드치킨" + "\n바삭바삭한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="양념치킨" + "\n달콤매콤한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="스노윙치킨" + "\n치즈 맛이 일품" + "\n가격: 25000"; 
		
		JTextArea a2 = new JTextArea(content2);
		a2.setFont(font);
		a2.setBounds(350, 270, 250, 150);
		JTextArea a3 = new JTextArea(content3);
		a3.setFont(font);
		a3.setBounds(350, 520, 250, 150);
		JTextArea a4 = new JTextArea(content4);
		a4.setFont(font);
		a4.setBounds(350, 760, 250, 150);
		
		JButton b1 = new JButton(foodIcon1);
		b1.setBounds(50, 250, 200, 200);
		
		JButton b2 = new JButton(foodIcon2);
		b2.setBounds(50, 500, 200, 200);
		
		JButton b3 = new JButton(foodIcon3);
		b3.setBounds(50, 750, 200, 200);
		
		
		
		f.add(b);
		f.add(a1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.setVisible(true);
	}

	//교촌치킨
	public static void openc2() {
		JFrame f = new JFrame("교촌치킨");
		f.setBounds(500, 0, 700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("c2.jpg");
		ImageIcon foodIcon1 = new ImageIcon("mc1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mc2.png");
		ImageIcon foodIcon3 = new ImageIcon("mc3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "교촌치킨";
				
				p_storeDAO dao = new p_storeDAO();
				P_storeVO bag = dao.one(name);
			
				if (bag != null) {
					
					String result = "가게 :" + bag.getName() +
							"\n 키테고리 :" + bag.getCategory() + 
							"\n 별점  :" + bag.getRating();
					
					JOptionPane.showMessageDialog(f, result);
					
					}else {
					JOptionPane.showMessageDialog(f, "검색결과없음");
				}
			}
		});
		
		
		String content = "★★★★☆  4.5" +"\n 최소주문금액: 15000원" + "\n 결제: 신용카드,현금"  
						+ "\n 배달시간: 55~65분";
		JTextArea a1 = new JTextArea(content);
		a1.setFont(font);
		a1.setBounds(350, 50, 250, 150);
		
		String content2 ="후라이드치킨" + "\n바삭바삭한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="양념치킨" + "\n달콤매콤한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="스노윙치킨" + "\n치즈 맛이 일품" + "\n가격: 25000"; 
		
		JTextArea a2 = new JTextArea(content2);
		a2.setFont(font);
		a2.setBounds(350, 270, 250, 150);
		JTextArea a3 = new JTextArea(content3);
		a3.setFont(font);
		a3.setBounds(350, 520, 250, 150);
		JTextArea a4 = new JTextArea(content4);
		a4.setFont(font);
		a4.setBounds(350, 760, 250, 150);
		
		JButton b1 = new JButton(foodIcon1);
		b1.setBounds(50, 250, 200, 200);
		
		JButton b2 = new JButton(foodIcon2);
		b2.setBounds(50, 500, 200, 200);
		
		JButton b3 = new JButton(foodIcon3);
		b3.setBounds(50, 750, 200, 200);
		
		
		
		f.add(b);
		f.add(a1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.setVisible(true);
	}	

	//네네치킨
	public static void openc3() {
		JFrame f = new JFrame("네네치킨");
		f.setBounds(700, 0, 700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("c3.png");
		ImageIcon foodIcon1 = new ImageIcon("mc1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mc2.png");
		ImageIcon foodIcon3 = new ImageIcon("mc3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "네네치킨";
				
				p_storeDAO dao = new p_storeDAO();
				P_storeVO bag = dao.one(name);
			
				if (bag != null) {
					
					String result = "가게 :" + bag.getName() +
							"\n 키테고리 :" + bag.getCategory() + 
							"\n 별점  :" + bag.getRating();
					
					JOptionPane.showMessageDialog(f, result);
					
					}else {
					JOptionPane.showMessageDialog(f, "검색결과없음");
				}
			}
		});
		
		
		String content = "★★★★☆  4.3" +"\n 최소주문금액: 15000원" + "\n 결제: 신용카드,현금"  
						+ "\n 배달시간: 55~65분";
		JTextArea a1 = new JTextArea(content);
		a1.setFont(font);
		a1.setBounds(350, 50, 250, 150);
		
		String content2 ="후라이드치킨" + "\n바삭바삭한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="양념치킨" + "\n달콤매콤한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="스노윙치킨" + "\n치즈 맛이 일품" + "\n가격: 25000"; 
		
		JTextArea a2 = new JTextArea(content2);
		a2.setFont(font);
		a2.setBounds(350, 270, 250, 150);
		JTextArea a3 = new JTextArea(content3);
		a3.setFont(font);
		a3.setBounds(350, 520, 250, 150);
		JTextArea a4 = new JTextArea(content4);
		a4.setFont(font);
		a4.setBounds(350, 760, 250, 150);
		
		JButton b1 = new JButton(foodIcon1);
		b1.setBounds(50, 250, 200, 200);
		
		JButton b2 = new JButton(foodIcon2);
		b2.setBounds(50, 500, 200, 200);
		
		JButton b3 = new JButton(foodIcon3);
		b3.setBounds(50, 750, 200, 200);
		
		
		
		f.add(b);
		f.add(a1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.setVisible(true);
	}
	
	
}
