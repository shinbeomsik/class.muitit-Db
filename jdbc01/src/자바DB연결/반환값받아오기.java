package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class 반환값받아오기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();//안에 있는 메서드 다사용가능~!
		re.add2(); // void
		
		int result1 = re.add(200, 100);//int 300
		System.out.println("더한 값은 " + result1);
		
		//String data = JOptionPane.showInputDialog("입력"); // "aaa"
		//String data2 = JOptionPane.showMessageDialog(null, "출력값"); // void
		
		double result2 = re.add(22.22, 88);
		System.out.println("더한 값은 " + result2);
		
		String result3 = re.add("나는", "천재다");
		System.out.println("더한 값은 " + result3);
		
		String result4 = re.add(1, "번 천재");
		System.out.println("더한 값은 " + result4);
		
		int[] result5 = re.add(); // {1,2,3} 을 가르키는 주소값
		result5[0] = 100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		
		Date result6 = re.getDate();
		//실행 했을때의 년원일시분초요일
		System.out.println(result6);
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		//요일 0:일요일 1:월요일 2:화요일
		System.out.println(result6.getDay());
		//==> 리턴이 없는 값은 프린트 불가! 위에 프린트된 이유는 리턴값이 있기 때문이다!
		
		int result7 = re.getHour();
		System.out.println(result7 + "시 입니다. 수업중");
		
		int result8 = re.getRandom2();
		System.out.println("랜덤한 정수는 " + result8);
		
		ArrayList result9 = re.getList();
		System.out.println(result9);
		System.out.println(result9.get(0));
		System.out.println(result9.get(1));
		result9.set(0, "양파");//0번 인덱스의 값을 양파로 변경
		System.out.println(result9);
		
		HashSet result10 = re.getSet();
		System.out.println(result10);
		
	}

}
