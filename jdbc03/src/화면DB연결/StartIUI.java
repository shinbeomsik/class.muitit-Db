package 화면DB연결;

import javax.security.auth.login.LoginContext;
import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO3;

public class StartIUI {

	public static void main(String[] args) {
		String id =JOptionPane.showInputDialog("아이디입력");
		String pw = JOptionPane.showInputDialog("패스워드입력");
		
		
		MemberDAO3 dao = new MemberDAO3();
		MemberVO bag = new MemberVO();
		BbsUI bbs = new BbsUI();
		MemberUI2 member = new MemberUI2();
		
		bag.setId(id);
		bag.setPw(pw);
		int result = dao.login(bag);
		
		if (result == 1 ) {
			JOptionPane.showMessageDialog(null, "로그인성공");
			bbs.open();
		} else {
			JOptionPane.showMessageDialog(null, "로그인실패");
			member.open();
		}
	}
	

}
