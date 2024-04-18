/*
 * 단을 입력을 받는다
 *  → 구구단 출력
 *  
 *  단 >> 2
 *  2*1
 *  ...
 *  2*9=18 → 1~9증가 → 9바퀴 수행
 *  1) 반복 횟수
 *  2) 어디부터 어디까지 출력
 *     ------ ------
 *     초기값   조건식 → int i=1;i<=9;i++
 */

import java.util.Scanner;

public class 제어문_반복문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int num = scan.nextInt();
		
		for (int i = 1; i <=9; i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
	}

}
