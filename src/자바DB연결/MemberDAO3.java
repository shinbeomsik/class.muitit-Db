package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MemberDAO3 { // CRUD

	// 메서드를 만드는것 ==> 메서드정의(define)
	// 메서드를 정의했다고 실행되는 거은 아니다.
	// 메서드를 쓰는것 ==> 메서드 호출(call)
	public MemberVO one(String id) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가! 들어가 있음.
		// 참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
		MemberVO bag = null;

		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자 (java ---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// 자바는 부품조립식이여서, String 에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야한다.
			// SQL부품으로 만들어주어야 한다.
			// PreparedStatement 가 SQL부품!!

			String sql = "select * from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			// con부품으로 sql스트링에 있는것을 SQL부품으로 만들어주기
			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공.");
				String id2 = rs.getString(1);// id
				String pw2 = rs.getString(2);// pw
				String name2 = rs.getString(3);// name
				String tel2 = rs.getString(4);// tel
				System.out.println(id2 + " " + pw2 + " " + name2 + " " + tel2);

				// 검색 결과를 검색화면 UI 부분으로 주어야 한다.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw2);
				bag.setName(name2);
				bag.setTel(tel2);
			} else {
				System.out.println("검색결과 없음. 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// return id,pw,name,tel XXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해줘야한다.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? ==>
		return bag;
	}

	public int delete(MemberVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자 (java ---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// 자바는 부품조립식이여서, String 에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야한다.
			// SQL부품으로 만들어주어야 한다.
			// PreparedStatement 가 SQL부품!!

			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());

			// con부품으로 sql스트링에 있는것을 SQL부품으로 만들어주기
			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			result = ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("탈퇴 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public int update(MemberVO bag) {
		int result = 0;

		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자 (java ---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// 자바는 부품조립식이여서, String 에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야한다.
			// SQL부품으로 만들어주어야 한다.
			// PreparedStatement 가 SQL부품!!

			String sql = "update hr.MEMBER set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());

			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			result = ps.executeUpdate(); // insert , update, delete문만가능 sql문 실행결과가 int 이기 떄문에
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println(" 수정성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// ==> 반환타입을 수정해주어야 한다 여기서는 void 를 int 로 수정
	public int insert(MemberVO bag) {

		// 1.가방을 받아서 변수에 넣어야됨

		int result = 0; // 결과를 담기 위한 변수를 하나 선언!

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. 오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 인덱스 0부터 시작!!
			// 유일하게 db은 인덱스가 1부터 시작!!

			// 2.가방에서 값들을 하나씩 꺼내 쓰세요
			ps.setString(1, bag.getId()); // ps.setInt(1, no);
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			// ==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			// ==> sql문을 오라클로 보내면, 오라클이 결과를 알려준다
			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// 실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			// result = 0;
			e.printStackTrace();
		}

		// System.out.println(result);
		// ==> 그 결과를 MemberUI로 다시 넘겨주자
		return result;
	}

	public int login(MemberVO bag) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가! 들어가 있음.
		// 참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");

			// 2.오라클 11g에 연결해보자 (java ---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// 자바는 부품조립식이여서, String 에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야한다.
			// SQL부품으로 만들어주어야 한다.
			// PreparedStatement 가 SQL부품!!

			String sql = "select * from hr.MEMBER where ID = ? and PW = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());

			// con부품으로 sql스트링에 있는것을 SQL부품으로 만들어주기
			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { 
				result = 1;
			} else {
				System.out.println("검색결과 없음. 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public ArrayList<MemberVO> list() {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		ArrayList<MemberVO> list = new ArrayList<>();
		//기본형 정수/실수/문자/논리만 값으로 초기화
		//나머지 데이터형(참조형) 주소가! 들어가 있음.
		//참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
		MemberVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "select * from hr.MEMBER";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//ps.setString(1, id); ?가 없기 때문에 안써야됨
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				
				//1. 검색 결과가 있으면
				//System.out.println("검색결과 있음. 성공.");
				
				//2. 각 칼럼에서 값을 꺼내오자
				String id2 = rs.getString(1); //id
				String pw = rs.getString("pw"); //pw
				String name = rs.getString(3); //name
				String tel = rs.getString(4); //tel
//				System.out.println(	id2 + " " 
//									+ pw + " " 
//									+ name + " " 
//									+ tel);
				//검색결과를 검색화면 UI부분을 주어야 함.
				
				//3. 가방을 만들자.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
			
			//else {
				//System.out.println("검색결과 없음. 성공.");
			//}
			//System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		//return id, pw, name, tel은 XXXXX!
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		//검색결과가 있을 때는 bag에 데이터가 들어있음. 
		//검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;
		
	}

	
}
