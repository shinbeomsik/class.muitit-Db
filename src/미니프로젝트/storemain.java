package 미니프로젝트;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class storemain {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.setLayout(new FlowLayout());

		Font font = new Font("바탕", 1, 50);

		JButton b1 = new JButton("음식점 정보");
		JButton b2 = new JButton("치킨");
		JButton b3 = new JButton("중국집");
		JButton b4 = new JButton("피자");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p_storeUI name = new p_storeUI();

				name.openup();
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				store store = new store();
				store.storec();
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				store store = new store();
				store.storej();
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				store store = new store();
				store.storep();
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.setVisible(true);

	}

}
