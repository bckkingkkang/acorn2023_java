package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
	Data Access Object 만들어보기
	
	- DB에 insert, update, delete, select 작업을 대신해주는 객체를 생성할 클래스 설계
*/

public class MemberDao {
	
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0; // 초기값을 0으로 부여한다.
		try {

			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getConn();
			// 실행할 sql문
			String sql = "DELETE FROM member"
					+ " WHERE num = ?";

			// sql 문을 대신 실행해 줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ?가 존재하는 미완성이라면 여기서 완성한다.
			pstmt.setInt(1, num);
			// insert or update of delete 문을 실제 수행, 변화된 row의 갯수가 리턴된다.
			rowCount = pstmt.executeUpdate(); // 수행하고 리턴되는 값을 변수에 담는다.

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외 발생 여부와 상관없이 실행
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {}
		}
		// 변화된 row의 갯수가 0보다 크면 작업 성공
		if (rowCount > 0) {
			return true;
		} else { // 그렇지 않으면 작업 실패
			return false;
		}
	}
	
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0; // 초기값을 0으로 부여한다.
		try {
			
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getConn();
			// 실행할 sql문
			String sql = "UPDATE member"
					+ " SET name = ?, addr = ? "
					+ " WHERE num = ?";
			
			// sql 문을 대신 실행해 줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ?가 존재하는 미완성이라면 여기서 완성한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			
			// insert or update of delete 문을 실제 수행, 변화된 row의 갯수가 리턴된다.
			rowCount = pstmt.executeUpdate(); // 수행하고 리턴되는 값을 변수에 담는다.

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외 발생 여부와 상관없이 실행
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		// 변화된 row의 갯수가 0보다 크면 작업 성공
		if (rowCount > 0) {
			return true;
		} else { // 그렇지 않으면 작업 실패
			return false;
		}

	}
	
	// 회원 한 명의 정보를 저장하고 해당 작업의 성공 여부를 리턴해주는 메소드
	public boolean insert(MemberDto dto) {
		
		// 필요한 객체를 담을 지역 변수를 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert, update, delete 작업을 통해서 변화된 (추가, 수정, 삭제) row 의 갯수를 담을 변수
		int rowCount = 0;	// 초기값을 0으로 부여한다.
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getConn();
			// 실행할 sql문
			String sql = "INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES (member_seq.NEXTVAL, ?, ?)";
			// sql 문을 대신 실행해 줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ?가 존재하는 미완성이라면 여기서 완성한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// insert or update of delete 문을 실제 수행, 변화된 row의 갯수가 리턴된다.
			rowCount = pstmt.executeUpdate();	// 수행하고 리턴되는 값을 변수에 담는다.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {		// 예외 발생 여부와 상관없이 실행
			try {
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (Exception e) { }
		}
		// 변화된 row의 갯수가 0보다 크면 작업 성공
		if (rowCount > 0) {
			return true;
		} else {	// 그렇지 않으면 작업 실패
			return false;
		}
	}
}
