package com.sist.sql;

import java.sql.*;
// => 오라클 연결 => ojdbc8.jar => 데이터베이스 연결시 해당 업체에서 다운로드
// => 연결 => CheckedException => 반드시 예외처리를 하고 사용

public class 라이브러리_1 {
	public static void main(String[] args) {
		
		try {
			// 1. 오라클 연결을 위한 드라이버 설치
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 메모리 할당 => 리플렉션 => new
			// 2. 오라클 연결
			String url = "jdbc:oracle:thin:@localhost:1521:XE"; // localhost => IP
			// 3. sql문장 전송
			Connection conn  = DriverManager.getConnection(url,"hr","happy");
			// 4. 실행 결과값 받기
			String sql = "SELECT empno,ename,job,sal FROM emp";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 5. 브라우저로 전송 => 도스창에 출력
			ResultSet rs = ps.executeQuery();// 실행한 결과값을 가지고 온다
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
