//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램

import java.util.Scanner;

public class 연습문제_12 {

	public static void main(String[] args) {
		int thd=0,five=0;
		for (int i = 1; i <= 10; i++) {
			Scanner scan = new Scanner(System.in);
			int num=scan.nextInt();
			if(num%3==0) thd++;
			if(num%5==0) five++;
		}
		System.out.println("3의 배수 : "+thd+" 5의 배수 : "+five);
	}

}
