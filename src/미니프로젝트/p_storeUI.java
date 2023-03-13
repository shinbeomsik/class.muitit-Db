package 미니프로젝트;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import 미니프로젝트보관소.P_storeVO;
import 미니프로젝트보관소.p_storeDAO;

public class p_storeUI {

	public void openup() {
		JFrame	f = new JFrame("음식점 정보");
		f.setSize(500, 500);
		
		p_storeDAO dao = new p_storeDAO();
		ArrayList<P_storeVO> list = dao.list();
		
		String[] header = {"name","category","rating"};
		Object[][] all = new Object[list.size()][3];
		for (int i = 0; i < all.length; i++) {
			all[i][0] = list.get(i).getName();
			all[i][1] = list.get(i).getCategory();
			all[i][2] = list.get(i).getRating();
		}
		
		if (list.size() == 0) {
			System.out.println("검색결과 없음.");
		} else {
			System.out.println("검색결과  " + list.size() + "개 입니다.");
			for (P_storeVO bag : list) {
				for (int i = 0; i < all.length; i++) {
					all[i][0] = list.get(i).getName();
					all[i][1] = list.get(i).getCategory();
					all[i][2] = list.get(i).getRating();
				}//for
			}//for
			
		}//else
		
		JTable table = new JTable(all,header);
		JScrollPane scroll = new JScrollPane(table);
		
		JButton b = new JButton("닫기");
		b.setBounds(200, 400, 100, 50);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				f.dispose();
			}
		});
		
		f.add(b);
		
		f.add(scroll);
		f.setVisible(true);
	}
	
	
	
	
	public void ratingopen(String cate) {
		
		JFrame	f = new JFrame("음식점 정보");
		f.setSize(500, 500);
		
		p_storeDAO dao = new p_storeDAO();
		
		P_storeVO bbag = new P_storeVO();
		bbag.setCategory(cate);
		ArrayList<P_storeVO> list = dao.list2(bbag);
		
		String[] header = {"name","category","rating"};
		Object[][] all = new Object[list.size()][3];
		for (int i = 0; i < all.length; i++) {
			all[i][0] = list.get(i).getName();
			all[i][1] = list.get(i).getCategory();
			all[i][2] = list.get(i).getRating();
		}
		
		
		if (list.size() == 0) {
			System.out.println("검색결과 없음.");
		} else {
			System.out.println("검색결과  " + list.size() + "개 입니다.");
			for (P_storeVO bag : list) {
				for (int i = 0; i < all.length; i++) {
					all[i][0] = list.get(i).getName();
					all[i][1] = list.get(i).getCategory();
					all[i][2] = list.get(i).getRating();
				}//for
			}//for
			
		}//else
		
		JTable table = new JTable(all,header);
		JScrollPane scroll = new JScrollPane(table);
		table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.white);
		table.setRowHeight(60);
		Font font = new Font("바탕",2,30);
		
		
		JButton b = new JButton("닫기");
		b.setBounds(200, 400, 100, 50);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				f.dispose();
			}
		});
		
		table.setFont(font);
		f.add(b);
		f.add(scroll);
		f.setVisible(true);
	}




}
