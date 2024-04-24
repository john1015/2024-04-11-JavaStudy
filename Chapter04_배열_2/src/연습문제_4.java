/*
 * 4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

 */
import java.util.Scanner;

public class 연습문제_4 {

	public static void main(String[] args) {
		//1. 정수 10개를 저장하는 공간 → 배열
		int num[] = new int[10];
		//2. 초기화
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("양의 정수 입력(10개) : ");
			num[i] = sc.nextInt();
			
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i]%3==0) System.out.print(num[i]+" ");//3. 출력(for-each도 가능)
		}
	}

}
