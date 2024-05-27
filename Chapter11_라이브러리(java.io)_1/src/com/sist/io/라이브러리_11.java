package com.sist.io;

import java.io.*;
public class 라이브러리_11 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\java_data\\seoul_location.txt");
			// 파일 자동 생성이 안된다 => FileWriter/FileOutputSream
			int i = 0;
			long start = System.currentTimeMillis();
			String data = "";
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			long end = System.currentTimeMillis();
			System.out.println(data);
			System.out.println("걸린시간"+(end-start));
		} catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
