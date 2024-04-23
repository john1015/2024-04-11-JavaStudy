/*
 * 
 */

import java.util.Scanner;

public class 자바제어문_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance=0;
		//while(run) {
		do {	
		System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.print("메뉴 선택 >>");
			int menu = scan.nextInt();
			/*
			 * switch(menu) { case 1: System.out.print("예금액> "); balance+=scan.nextInt();
			 * break; case 2: System.out.print("출금액> "); int input =scan.nextInt();
			 * if(balance<input)System.out.println("잔액이 부족합니다"); else balance -=input;
			 * break; case 3: System.out.print("잔액> "); System.out.print(balance); break;
			 * case 4: run=false; break; // System.exit(0) → 자신의 제어문에서 처리 → switch를 종효 //
			 * while을 제어할 수 없다 }
			 */
			if(menu==1) {
				System.out.print("예금액> "); balance+=scan.nextInt();
				
			}
			else if(menu==2) {
				 System.out.println("출금액> "); int input =scan.nextInt();
				 if(balance<input)System.out.println("잔액이 부족합니다"); else balance -=input;
				
			}
			else if(menu==3) {
				System.out.print("잔액> "); System.out.println(balance);
			}
			else if(menu== 4) {
				run=false;  // System.exit(0)
			}
			else System.out.println("메뉴가 존재하지 않습니다");
		}while(run); // for문일경우 true / false가아니라 break를 써야함
		System.out.println("프로그램 종료");
	}

}
