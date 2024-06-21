package com.sist.dao;

import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;

public class EmpMemberDAO {
    private Connection conn;
    private PreparedStatement ps;
    private final String URL = "jdbc:oracle:thin:@192.168.10.124:1521:XE";
    private static EmpMemberDAO dao; // Singleton pattern

    // Constructor: Driver registration
    public EmpMemberDAO() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Get connection to Oracle
    public void getConnection() {
        try {
            conn = DriverManager.getConnection(URL, "hr3", "happy");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Close connection
    public void disConnection() {
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Singleton instance
    public static EmpMemberDAO newInstance() {
        if (dao == null)
            dao = new EmpMemberDAO();
        return dao;
    }

    // Fetch all employees
    public ArrayList<EmpVO> empListData() {
        ArrayList<EmpVO> list = new ArrayList<EmpVO>();
        try {
            getConnection();
            String sql = "SELECT empno, ename, job, sal, hiredate, performance, dname, loc "
                    + "FROM (SELECT empno, ename, job, sal, hiredate, performance, dname, loc, rownum as num "
                    + "FROM (SELECT empno, ename, job, sal, hiredate, performance, dname, loc "
                    + "FROM emp, dept WHERE dept.deptno = emp.deptno ORDER BY empno ASC))";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmpno(rs.getInt(1));
                vo.setEname(rs.getString(2));
                vo.setJob(rs.getString(3));
                vo.setSal(rs.getInt(4));
                vo.setHiredate(rs.getString(5));
                vo.setPerformance(rs.getInt(6));
                vo.getDvo().setDname(rs.getString(7));
                vo.getDvo().setLoc(rs.getString(8));
                list.add(vo);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            disConnection();
        }
        return list;
    }

    // Fetch employee ranks
    public ArrayList<EmpVO> empRankData() {
        ArrayList<EmpVO> list = new ArrayList<EmpVO>();
        try {
            getConnection();
            String sql = "SELECT empno, ename, dname, performance "
                    + "FROM (SELECT empno, ename, dname, performance, rownum as num "
                    + "FROM (SELECT empno, ename, dname, performance "
                    + "FROM emp, dept WHERE dept.deptno = emp.deptno ORDER BY performance DESC))";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmpno(rs.getInt(1));
                vo.setEname(rs.getString(2));
                vo.getDvo().setDname(rs.getString(3));
                vo.setPerformance(rs.getInt(4));
                list.add(vo);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            disConnection();
        }
        return list;
    }

    // Calculate total pages for pagination
    public int empTotalPage() {
        int total = 0;
        try {
            getConnection();
            String sql = "SELECT CEIL(COUNT(*)/12.0) FROM emp";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                total = rs.getInt(1);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            disConnection();
        }
        return total;
    }

    // Fetch employee details by ID
    public EmpVO empDetailData(String no) {
        EmpVO vo = new EmpVO();
        try {
            getConnection();
            String sql = "SELECT empno, ename, job, sal, hiredate, performance, "
                    + "(SELECT dname FROM dept WHERE dept.deptno = emp.deptno), "
                    + "(SELECT loc FROM dept WHERE dept.deptno = emp.deptno), "
                    + "(SELECT deptno FROM dept WHERE dept.deptno = emp.deptno) "
                    + "FROM emp WHERE empno=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, no);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vo.setEmpno(rs.getInt(1));
                vo.setEname(rs.getString(2));
                vo.setJob(rs.getString(3));
                vo.setSal(rs.getInt(4));
                vo.setHiredate(rs.getString(5));
                vo.setPerformance(rs.getInt(6));
                vo.getDvo().setDname(rs.getString(7));
                vo.getDvo().setLoc(rs.getString(8));
                vo.getDvo().setDeptno(rs.getInt(9));
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            disConnection();
        }
        return vo;
    }

    // Fetch employees for a specific page
    public ArrayList<EmpVO> empListData(int page) {
        ArrayList<EmpVO> list = new ArrayList<EmpVO>();
        try {
            getConnection();
            String sql = "SELECT empno, ename, job, sal, dname "
                    + "FROM (SELECT empno, ename, job, sal, dname, rownum as num "
                    + "FROM (SELECT empno, ename, job, sal, dname "
                    + "FROM emp, dept WHERE dept.deptno = emp.deptno ORDER BY empno ASC)) "
                    + "WHERE num BETWEEN ? AND ?";
            int rowSize = 12;
            int start = (rowSize * page) - (rowSize - 1);
            int end = rowSize * page;
            ps = conn.prepareStatement(sql);
            ps.setInt(1, start);
            ps.setInt(2, end);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmpno(rs.getInt(1));
                vo.setEname(rs.getString(2));
                vo.setJob(rs.getString(3));
                vo.setSal(rs.getInt(4));
                vo.getDvo().setDname(rs.getString(5));
                list.add(vo);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            disConnection();
        }
        return list;
    }

    // Find employees by name
    public ArrayList<EmpVO> empFindData(String name) {
        ArrayList<EmpVO> list = new ArrayList<EmpVO>();
        try {
            getConnection();
            String sql = "SELECT empno, ename, job, sal, hiredate, dname, loc, performance "
                    + "FROM emp, dept WHERE emp.deptno = dept.deptno AND ename LIKE '%'||?||'%' ORDER BY empno ASC";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmpno(rs.getInt(1));
                vo.setEname(rs.getString(2));
                vo.setJob(rs.getString(3));
                vo.setSal(rs.getInt(4));
                vo.setHiredate(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate(5)));
                vo.getDvo().setDname(rs.getString(6));
                vo.getDvo().setLoc(rs.getString(7));
                vo.setPerformance(rs.getInt(8));
                list.add(vo);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            disConnection();
        }
        return list;
    }

    // Fetch data for update
    public EmpVO empUpdateData(int no) {
        EmpVO vo = new EmpVO();
        try {
            getConnection();
            String sql = "SELECT empno, ename, job, sal ,hiredate , performance , dname ,loc , emp.deptno FROM emp , dept  WHERE dept.deptno = emp.deptno and empno=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, no);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vo.setEmpno(rs.getInt(1));
                vo.setEname(rs.getString(2));
                vo.setJob(rs.getString(3));
                vo.setSal(rs.getInt(4));
                vo.setHiredate(rs.getString(5));
                vo.setPerformance(rs.getInt(6));
                vo.getDvo().setDname(rs.getString(7));
                vo.getDvo().setLoc(rs.getString(8));
                vo.getDvo().setDeptno(rs.getInt(9
                		));
                
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            disConnection();
        }
        return vo;
    }

    // Update employee details
    public boolean empUpdate(EmpVO vo) {
        boolean bCheck = false;
        try {
            getConnection();
            String sql = "UPDATE emp SET sal=?, job=? WHERE empno=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, vo.getSal());
            ps.setString(2, vo.getJob());
            ps.setInt(3, vo.getEmpno());
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                bCheck = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            disConnection();
        }
        return bCheck;
    }
}
