/*
 *  컴퓨터 / 사용자 → 가위바위보
 * 	→ 난수   → 입력
 * => 임의로 설정
 * 	0=> 가위
 * 	1=> 바위
 * 	2=> 보
 */
import java.util.Scanner;

public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		System.out.print("가위(0) 바위(1) 보(2) ");
		
		int user;
		Scanner sc = new Scanner(System.in);
		user = sc.nextInt();
		
		//컴퓨터
		int com=(int)(Math.random()*3);//0 1 2
		int result = com-user;
		if(result==-2||result==1) System.out.println("컴퓨터 win");
		if(result==-1||result==2) System.out.println("사용자 win");
		if(result==0) System.out.println("비겼다");
		
		/*
		if(com==0 && user==0) System.out.println("컴퓨터: 가위 나: 가위 → 비겼다");
		if(com==0 && user==1) System.out.println("컴퓨터: 가위 나: 바위 → 사용자 승리");
		if(com==0 && user==2) System.out.println("컴퓨터: 가위 나: 보 → 컴퓨터 승리");
		
		if(com==1 && user==0) System.out.println("컴퓨터: 바위 나: 가위 → 컴퓨터 승리");
		if(com==1 && user==1) System.out.println("컴퓨터: 바위 나: 바위 → 비겼다");
		if(com==1 && user==2) System.out.println("컴퓨터: 바위 나: 보 → 사용자 승리");
		
		if(com==2 && user==0) System.out.println("컴퓨터: 보 나: 가위 → 사용자 승리");
		if(com==2 && user==1) System.out.println("컴퓨터: 보 나: 바위 → 컴퓨터 승리");
		if(com==2 && user==2) System.out.println("컴퓨터: 보 나: 보 → 비겼다");
		*/
		
		//게임 결과 출력
		/*
		 * com-suer
		 * com → 0(가위)
		 * 		user → 0(가위) → 비겼다
		 * 			   1(바위) → 사용자 win
		 * 			   2(보) → 컴퓨터 win
		 * com → 1(바위)
		 * 		user → 0(가위) → 컴퓨터 win
		 * 			   1(바위) → 비겼다
		 * 			   2(보) → 사용자 win
		 * com →2(보)
		 * 		user → 0(가위) → 사용자 win
		 * 			   1(바위) → 컴퓨터 win
		 * 			   2(보) → 비겼다
		 */
		
		/*
		 * if(com==1) System.out.println("컴퓨터: 바위"); if(com==2)
		 * System.out.println("컴퓨터: 보");
		 */
		
		
		

	}

}
