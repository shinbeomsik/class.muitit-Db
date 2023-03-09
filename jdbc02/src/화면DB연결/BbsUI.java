package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(500, 850);
		
		
		JLabel l1 = new JLabel("<<<나의 게시판>>>");
		JLabel l2 = new JLabel("게시판 I D");
		JLabel l3 = new JLabel("게시판 제  목");
		JLabel l4 = new JLabel("게시판 내  용");
		JLabel l5 = new JLabel("게시판 작성자");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시판 작성 처리");
		JButton b2 = new JButton("게시판 삭제 처리");
		JButton b3 = new JButton("게시판 수정 처리");
		JButton b4 = new JButton("게시판 검색 처리");
		
		
		//f에 위에있는 요소들을 addfh 붙여주어야하는데,
		//붙이는 순서대로 물 흐르듯 붙여주고 싶음.
		//물후르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		
		//폰트를 설정하기 위해서 Font 부품이 필요
		Font font = new Font("궁서", Font.BOLD, 45);
		
		//필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝
		f.setLayout(flow);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.blue);
		
		b1.setBackground(Color.pink); //배경색
		b1.setForeground(Color.red);  //글자색
		b2.setBackground(Color.pink);
		b2.setForeground(Color.red);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.red);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.red);
		
		f.getContentPane().setBackground(Color.green);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		f.setVisible(true);
	}

}
