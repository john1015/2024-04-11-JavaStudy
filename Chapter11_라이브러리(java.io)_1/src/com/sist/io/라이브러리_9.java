package com.sist.io;

import java.io.FileWriter;

// 파일쓰기 => 문자 스트림(2byte) => 한글 사용이 편리
// FileWriter
public class 라이브러리_9 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw=new FileWriter("c:\\java_data\\board.txt",true); // 없는 경우 자동 생성
			// 폴더는 생성하지 않는다
			String msg = "ABCDEFGHIJKLMNOOOOOOOOOOOOOOO132456789\r\n";
			fw.write(msg);
			System.out.println("저장 완료!!!");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
