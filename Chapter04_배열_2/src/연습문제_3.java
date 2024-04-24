/*
 * 3. 배열 alpha를 모두 출력하고자 한다. 빈칸(for문 조건식있는부분)에 적절한 코드를 삽입하시오.

 */

import java.util.Arrays;

public class 연습문제_3 {

	public static void main(String[] args) {
		char[] alpha = {'a', 'b', 'c', 'd'};

		for(int i=0; i< alpha.length; i++)
		     System.out.print(alpha[i]+" ");
		System.out.println("\n====== for-each ======");
		for (char c : alpha) { // 출력용 → 웹 → for-each
			// 받는 변수 데이터형 = 배열의 데이터형이 동일
			// 받는 변수 데이터형이 크다
			System.out.print(c+" "); // 실제값 출력 for-each
		}
		System.out.println("\n"+Arrays.toString(alpha));
		
	}

}
