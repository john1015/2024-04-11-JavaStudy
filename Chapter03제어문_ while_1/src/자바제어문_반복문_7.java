/*
 * 파일출력 / 데이터베이스 출력 / 네트워크 서버
 * 			|웹				|애플리케이션 → 자바→C/C++
 */
import java.util.*;
import java.io.*;

public class 자바제어문_반복문_7 {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
		int i=0; // 한글읽기 => 정수값을 읽는다
		while ((i=fr.read())!=-1) {// -1 EOF(End Of File)
			System.out.print((char)i);
		}
		fr.close();
	}

}
