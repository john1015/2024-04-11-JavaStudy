package com.sist.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 	INSERT / UPDATE / DELETE가 여러개 동시에 수행 될때
 *  ------------------------- 일괄처리 (트랜잭션)
 */
public class MainClass_2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url , "hr","happy");
			conn.setAutoCommit(false);
			// SQL 
			String sql = "INSERT INTO card VALUES(3,'park',20000)";
			ps = conn.prepareStatement(sql);
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			
			sql = "INSERT INTO point VALUES(3,4,200)";
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			conn.commit();
		} catch (Exception ex) {
			try {
				conn.rollback();
			} catch (Exception e) {}
		} finally {
			try {
				conn.setAutoCommit(true);
				if(ps!=null) ps.close();
				if(conn!=null) ps.close();
			} catch (Exception ex) {
				// TODO: handle exception
			}
		}
	}
}
