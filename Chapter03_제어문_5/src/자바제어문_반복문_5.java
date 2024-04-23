/*
 *  A~Z사이에서 → 사용자가 입력한 알파벳이 몇번째 있는지 확인 
 */

import java.util.Iterator;
import java.util.Scanner;

public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳을 입력해주세요 : ");
		char c = scan.next().charAt(0);

		/*
		 * if (c >= 97 && c < 123) System.out.println(c + "는 " + (c - 96) + "번째 위치합니다");
		 * else if (c >= 65 && c < 97) System.out.println(c + "는 " + (c - 64) +
		 * "번째 위치합니다"); else System.out.println("알파벳이 아닙니다");
		 */

		int i = 1;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (c == ch)
				break;
			i++;
		}
		System.out.println(c + "는(은) " + i + "번째 있습니다");
	}

}
