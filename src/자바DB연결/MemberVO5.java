package 자바DB연결;

import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MemberVO5 {

	public static void main(String[] args) {
		// 프로그램 시작하자 마자 DB에서 데이터를 가지고와서
		// 화면을 만들어주고 싶음.
		JFrame f = new JFrame();
		f.setSize(500, 700);

		MemberDAO3 dao = new MemberDAO3();
		ArrayList<MemberVO> list = dao.list();
		
		
		String[] header = {"아이디","패스워드","이름","전화번호"};
		Object[][] all = new String[list.size()][4];
		for (int i = 0; i < all.length; i++) {//all.length개  열을 새준다 열만큼 가방이생김
			all[i][0] = list.get(i).getId();
			all[i][1] = list.get(i).getPw();
			all[i][2] = list.get(i).getName();
			all[i][3] = list.get(i).getTel();
		}
		
		

		if (list.size() == 0) {
			System.out.println("검색결과 없음.");
		} else {
			System.out.println("검색 결과는 전체  " + list.size() + "개 입니다.");
			for (MemberVO bag : list) {
				for (int i = 0; i < all.length; i++) {//all.length개  열을 새준다 열만큼 가방이생김
					all[i][0] = list.get(i).getId();
					all[i][1] = list.get(i).getPw();
					all[i][2] = list.get(i).getName();
					all[i][3] = list.get(i).getTel();
				}//for
			}//for

		}//else
		
		JTable table = new JTable(all,header);
			
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		f.setVisible(true);
	}//main

}
