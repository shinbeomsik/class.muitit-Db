package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.BbsVO;
import 화면DB연결.MemberVO;

//테이블 하나당 DAO하나! ==> CUD를 완성!!

public class BbsDAO {

	public BbsVO one(int no) {
		ResultSet rs = null;
		BbsVO bag = null;
		
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

			

			String sql = "select * from hr.BBS where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			
            System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				System.out.println("검색결과 있음.");
				int no2 = rs.getInt(1);//no
				String title = rs.getString(2);//title
				String content = rs.getString(3);//content
				String writer = rs.getString(4);//writer
				System.out.println(no2 + " " + title + " " + content + " " + writer);
				
				//검색 결과를 검색화면 UI 부분으로 주어야 한다.
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}else {
				System.out.println("검색결과 없음.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}
	
	public void delete(int no) {
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

			String sql = "delete from hr.BBS where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);

			// con부품으로 sql스트링에 있는것을 SQL부품으로 만들어주기
			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update(String title, int no) {

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

			String sql = "update hr.BBS set title = ? where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setInt(2, no);

			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			ps.executeUpdate(); // insert , update, delete문만가능 sql문 실행결과가 int 이기 떄문에
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(int no, String title, String content , String writer) {

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

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into hr.BBS values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는것을 SQL부품으로 만들어주기
			// R빼고 , 인덱스 0부터 시작!!
			// 유일하게 db은 인덱스가 1부터 시작!!
			ps.setInt(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);

			// ==> insert into hr.MEMBER values('a','a','a','a'); 이렇게 넣어줌~~

			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
