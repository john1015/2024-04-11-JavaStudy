package com.sist.io;

import java.io.*;

public class 라이브러리_3 {
	public static void main(String[] args) {
		File dir = new File("c:\\java_project");
		// 존재여부 확인
		/*if(!dir.exists()) {
			dir.mkdir();
			System.out.println("폴더 생성완료!!");
		}
		else {
			System.out.println("이미 같은 폴더가 존재합니다!!"); 
		}*/
		if(dir.exists()) {
			dir.delete();
			System.out.println("폴더 삭제 완료!!");
		}
		else {
			System.out.println("이미 삭제되었거나 없는 폴더입니다!!");
		}
	}
}
