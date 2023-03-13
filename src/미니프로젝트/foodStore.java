package 미니프로젝트;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class foodStore {
	
	public static void openc1() {
		JFrame f = new JFrame("60계치킨");
		f.setSize(700, 1200);
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
		
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		
		f.add(b);
		f.add(a1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.add(b7);
		f.setVisible(true);
	}

	public static void openc2() {
		JFrame f = new JFrame("교촌치킨");
		f.setSize(700, 1200);
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
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		
		
		f.add(b);
		f.add(a1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.add(b7);
		f.setVisible(true);
	}	

	public static void openc3() {
		JFrame f = new JFrame("네네치킨");
		f.setSize(700, 1200);
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
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		
		
		f.add(b);
		f.add(a1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.add(b7);
		f.setVisible(true);
	}
	
	public static void openj1() {
		JFrame f = new JFrame("홍콩반점");
		f.setSize(700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("j1.jpg");
		ImageIcon foodIcon1 = new ImageIcon("mj1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mj2.jpg");
		ImageIcon foodIcon3 = new ImageIcon("mj3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "홍콩반점";
				
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
		
		String content2 ="자장면" + "\n달콤한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="짬뽕" + "\n얼큰한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="탕수육" + "\n쫄깃한 맛이 일품" + "\n가격: 25000"; 
		
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
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		f.add(b7);
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
	
	public static void openj2() {
		JFrame f = new JFrame("홍짜장");
		f.setSize(700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("j2.png");
		ImageIcon foodIcon1 = new ImageIcon("mj1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mj2.jpg");
		ImageIcon foodIcon3 = new ImageIcon("mj3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "홍짜장";
				
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
		
		
		String content = "★★★★☆  4.4" +"\n 최소주문금액: 15000원" + "\n 결제: 신용카드,현금"  
						+ "\n 배달시간: 55~65분";
		JTextArea a1 = new JTextArea(content);
		a1.setFont(font);
		a1.setBounds(350, 50, 250, 150);
		
		String content2 ="자장면" + "\n달콤한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="짬뽕" + "\n얼큰한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="탕수육" + "\n쫄깃한 맛이 일품" + "\n가격: 25000"; 
		
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
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		f.add(b7);
		
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
	
	public static void openj3() {
		JFrame f = new JFrame("착한 쭝식");
		f.setSize(700, 1200);
		f.setLayout(null);
		
		Font font = new Font("바탕" , 1 , 20);
		ImageIcon store = new ImageIcon("j3.png");
		ImageIcon foodIcon1 = new ImageIcon("mj1.jpg");
		ImageIcon foodIcon2 = new ImageIcon("mj2.jpg");
		ImageIcon foodIcon3 = new ImageIcon("mj3.jpg");
		
		JButton b = new JButton(store);
		b.setBounds(50, 20, 200, 200);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = "착한 쭝식";
				
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
		
		
		String content = "★★★★☆  4.1" +"\n 최소주문금액: 15000원" + "\n 결제: 신용카드,현금"  
						+ "\n 배달시간: 55~65분";
		JTextArea a1 = new JTextArea(content);
		a1.setFont(font);
		a1.setBounds(350, 50, 250, 150);
		
		String content2 ="자장면" + "\n달콤한 맛이 일품" + "\n가격: 15000"; 
		String content3 ="짬뽕" + "\n얼큰한 맛이 일품" + "\n가격: 20000"; 
		String content4 ="탕수육" + "\n쫄깃한 맛이 일품" + "\n가격: 25000"; 
		
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
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		f.add(b7);
		
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
	
	public static void openp1() {
		
		JFrame f = new JFrame("도미노피자");
		f.setSize(700, 1200);
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
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		f.add(b7);
		
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
		f.setSize(700, 1200);
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
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		f.add(b7);
		
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
		f.setSize(700, 1200);
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
		
		JButton b7 = new JButton("닫기");
		b7.setBounds(600, 900, 100, 50);
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
			
		});
		f.add(b7);
		
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
