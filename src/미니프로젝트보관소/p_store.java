package 미니프로젝트보관소;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import 미니프로젝트.P_storeVO;
import 미니프로젝트.p_storeDAO;

public class p_store {
	
	public static void openp1() {
		JFrame f = new JFrame("도미노피자");
		f.setBounds(300, 0, 700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("p1.jpg");
		ImageIcon foodIcon1 = new ImageIcon("mp1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mp2.jpg");
		ImageIcon foodIcon3 = new ImageIcon("mp3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "도미노피자";
				
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
		
		
		String content = "★★★★☆  4.6" +"\n 최소주문금액: 15000원" + "\n 결제: 신용카드,현금"  
						+ "\n 배달시간: 55~65분";
		JTextArea a1 = new JTextArea(content);
		a1.setFont(font);
		a1.setBounds(350, 50, 250, 150);
		
		String content2 ="치즈피자" + "\n치즈의 쫄깃한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="페페로니피자" + "\n짭조름한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="콰트로피자" + "\n4가지 맛 달라서좋다" + "\n가격: 25000"; 
		
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
	
	public static void openp2() {
		JFrame f = new JFrame("피자헛");
		f.setBounds(500, 0, 700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("p2.jpg");
		ImageIcon foodIcon1 = new ImageIcon("mp1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mp2.jpg");
		ImageIcon foodIcon3 = new ImageIcon("mp3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "피자헛";
				
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
		
		String content2 ="치즈피자" + "\n치즈의 쫄깃한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="페페로니피자" + "\n짭조름한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="콰트로피자" + "\n4가지 맛 달라서좋다" + "\n가격: 25000"; 
		
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
	
	public static void openp3() {
		JFrame f = new JFrame("피자스쿨");
		f.setBounds(700, 0, 700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("p3.jpg");
		ImageIcon foodIcon1 = new ImageIcon("mp1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mp2.jpg");
		ImageIcon foodIcon3 = new ImageIcon("mp3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "피자스쿨";
				
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
		
		String content2 ="치즈피자" + "\n치즈의 쫄깃한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="페페로니피자" + "\n짭조름한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="콰트로피자" + "\n4가지 맛 달라서좋다" + "\n가격: 25000";
		
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
