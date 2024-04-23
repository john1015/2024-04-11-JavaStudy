/*
 * 	1~100까지 정수 → 3의 배수 갯수 , 5의 배수 갯수 , 7의배수 갯수
 */

import java.util.Iterator;

public class 자바제어문_반복문_3 {

	public static void main(String[] args) {
		int thd=0,fif=0,sev=0;
		for (int i = 1; i <=100; i++) {
			if(i%3==0) thd++;
			if(i%5==0) fif++;
			if(i%7==0) sev++;
		}
		System.out.println("3의배수 갯수 : "+thd+" 5의배수 갯수 : "+fif+" 7의배수 갯수 : "+sev);
	}

}
