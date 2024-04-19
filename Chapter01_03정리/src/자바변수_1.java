/*
 * 돈까스 : 8000
 * 칼국수 : 6000
 * 왕만두 : 5000
 * ------------
 * 주문 돈까스 → 16인분
 *     칼국수 → 8인분
 *     왕만두 → 1인분
 *     ---- 총계산서를 출력하는 프로그램을 작성
 */

import java.util.Scanner;

public class 자바변수_1 {

	public static void main(String[] args) {
		
		/*
		 * final int 돈까스=8000; final int 칼국수=6000; final int 만두=5000;
		 * System.out.println(돈까스*16+칼국수*8+만두);
		 */
		
		Scanner scan = new Scanner(System.in);
		int don,kal,man,total;
		
		System.out.print("돈까스를 주문할 인분을 선택해 주세요 ");
		don = scan.nextInt();
		System.out.print("칼국수를 주문할 인분을 선택해 주세요 ");
		kal = scan.nextInt();
		System.out.print("만두를 주문할 인분을 선택해 주세요 ");
		man = scan.nextInt();
		total = don*8000+kal*6000+man*5000;
		System.out.println("돈까스 "+don+"인분 "+"칼국수 "+kal+"인분 "+"만두 "+man+"인분을 시키셨습니다!");
		System.out.println("총 "+total+"원 입니다!!!");
	}

}
