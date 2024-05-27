package com.sist.io;
/*
 *   파일쓰기 FileWriter
 *   => 크롤링한 데이터를 저장
 *   파일읽기 FileReader
 *   => 프로그램 제어
 *   => 읽기 => 한줄씩(파일에 있는 데이터를 메모리에 한번에 저장) / 한글자 (파일에 있는 데이터를 한개씩) 
 *   => 필터 스트림 => BufferedReader ***********(네트워크 , 웹)
 *   369page
 *   
 *   FileWriter (FileOutputStream) => write() , close()
 *   FileReader (FileInputStream) => read() , close()
 *   => 한글자씩 읽기 / 한글자씩 쓰기
 *      ----------- => 여러글자 입력이 가능
 *      	FileWriter => write(String s)
 *      	FilrOutputStream => write(byte[])
 *      
 *      	String에서 byte[]변환
 *      	String s = "aaa";
 *      	s.getBytes()
 */

import java.io.*;

public class 라이브러리_8 {
	// 1. FileOutputStream을 이용한 저장
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos=new FileOutputStream("c:\\java_data\\member.txt");
			// 파일이 없는 경우에는 자동 생성
			// 파일이 있는 경우에는 문자저장이 가능
			// => FileOutputStream / FileWriter => 경로명과 파일명을 지정하면 없는 경우 자동 생성이 된다
			// 한글자 입력 => byte(int,char) / 여러글자 한번에 입력(byte[])
			//fos.write('A');
			//fos.write('B');
			//fos.write('C');
			String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			fos.write(msg.getBytes());
			// 바이트단위로 저장 => byte , byte[] => getBytes()
			System.out.println("저장 완료!!!");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
