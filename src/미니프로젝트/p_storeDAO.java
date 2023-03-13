package 미니프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import 자바DB연결.MemberVO;


public class p_storeDAO {

	public int insert(P_storeVO bag) {

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
			System.out.println("2. 오라클 연결 성공.");

			String sql = "insert into hr.P_STORE values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 인덱스 0부터 시작!!
			// 유일하게 db은 인덱스가 1부터 시작!!

			// 2.가방에서 값들을 하나씩 꺼내 쓰세요
			ps.setString(1, bag.getName()); // ps.setInt(1, no);
			ps.setString(2, bag.getCategory());
			ps.setDouble(3, bag.getRating());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			// ==> sql문을 오라클로 보내면, 오라클이 결과를 알려준다
			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// 실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			// result = 0;
			e.printStackTrace();
		}

		// ==> 그 결과를 MemberUI로 다시 넘겨주자
		return result;
	}

	public int update(P_storeVO bag) {
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


			String sql = "update hr.P_STORE set RATING = ? where NAME = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, bag.getRating());
			ps.setString(2, bag.getName());
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

	public int delete(P_storeVO bag) {
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


			String sql = "delete from hr.P_STORE where NAME = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getName());

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

	public P_storeVO one(String name) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가! 들어가 있음.
		// 참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
		P_storeVO bag = null;

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


			String sql = "select * from hr.P_STORE where name = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);

			// con부품으로 sql스트링에 있는것을 SQL부품으로 만들어주기
			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공.");
				String name2 = rs.getString(1);// name
				String category2= rs.getString(2);// category
				double rating2 = rs.getDouble(3);
				
				System.out.println(name2 + " " + category2 + " " + rating2);

				// 검색 결과를 검색화면 UI 부분으로 주어야 한다.
				bag = new P_storeVO();
				bag.setName(name2);
				bag.setCategory(category2);
				bag.setRating(rating2);
			} else {
				System.out.println("검색결과 없음. 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해줘야한다.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? ==>
		return bag;
	}
	
	public ArrayList<P_storeVO> list() {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		ArrayList<P_storeVO> list = new ArrayList<>();
		//기본형 정수/실수/문자/논리만 값으로 초기화
		//나머지 데이터형(참조형) 주소가! 들어가 있음.
		//참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
		P_storeVO bag = null;
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
			
			String sql = "select * from hr.P_STORE";
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
				String name = rs.getString(1); //name
				String category = rs.getString(2); //category
				double rating = rs.getDouble(3);//rating
//				System.out.println(	id2 + " " 
//									+ pw + " " 
//									+ name + " " 
//									+ tel);
				//검색결과를 검색화면 UI부분을 주어야 함.
				
				//3. 가방을 만들자.
				bag = new P_storeVO();
				bag.setName(name);
				bag.setCategory(category);
				bag.setRating(rating);
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
	
	public ArrayList<P_storeVO> list2(P_storeVO bag) {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		ArrayList<P_storeVO> list = new ArrayList<>();
		//기본형 정수/실수/문자/논리만 값으로 초기화
		//나머지 데이터형(참조형) 주소가! 들어가 있음.
		//참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
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
			
			String sql = "select * from hr.P_STORE where CATEGORY = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//ps.setString(1, id); ?가 없기 때문에 안써야됨
			ps.setString(1, bag.getCategory());
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				
				//1. 검색 결과가 있으면
				//System.out.println("검색결과 있음. 성공.");
				
				//2. 각 칼럼에서 값을 꺼내오자
				String name = rs.getString(1); //name
				String category2 = rs.getString(2); //category
				double rating = rs.getDouble(3);//rating
				//검색결과를 검색화면 UI부분을 주어야 함.
				
				//3. 가방을 만들자.
				bag = new P_storeVO();
				bag.setName(name);
				bag.setCategory(category2);
				bag.setRating(rating);
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	
	
}
