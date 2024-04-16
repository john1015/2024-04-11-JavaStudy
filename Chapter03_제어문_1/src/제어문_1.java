/*
 *  자바에서 지원하는 제어문 
 *  → 프로그램의 흐름
 *   = 건너뛴다 / 실행  → 조건문
 *   = 여러개 반복 → 반복문
 *   = 필요한 부분 선택 → 선택문
 *   = 반복에서 나가기 → 반복제어문 ex)게임 ESC
 *   
 *   자바에서 코딩
 *   평문 / 조건문 / 반복문
 *   1. 조건문 
 *   	단일조건문 → 부정연산자, 비교연산자 , 논리연산자만 사용이 가능 → true/false
 *   		if(조건문){
 *   			조건이 true일 경우에만 수행 → false면 스킵
 *   		}
 *   	선택조건문 
 *   		if(조건문){
 *   			실행문장 → 조건문이 true일때 → id/pwd → login
 *   		}
 *   		else{
 *				실행문장 → 조건문이 false일때 → id나pwd가 틀리다 메세지
 *   		}
 *   	다중조건문
 *   		if(조건문){
 *   			true면 문장을 수행 → 종료
 *   			false면 밑에있는 조건문으로 이동
 *    		}
 *   		else if(조건문){
 *   			true면 문장을 수행 → 종료
 *   			false면 밑에있는 조건문으로 이동
 *   		}
 *   		else{
 *   			해당 조건이 없는 경우에 수행문장 → 생략 가능
 *   		}
 *   
 *   **** 중첩
 *   	if(조건문){ 
 *   		if(조건문){
 *   		
 *   		}
 *   	}
 *   	if(조건 && 조건){
 *   		
 *   	}
 *   2. 선택문 
 *   	switch~case
 *   3. 반복문
 *   	for : 반복횟수가 지정된 경우 → 10번 반복
 *   	while : 반복횟수가 없는 경우 → 서버,게임,데이터베이스 연동
 *   	do~while : 반드시 한번이상 수행할때
 *   4. 반복제어문
 *   	break : 반복을 벗어날때
 *   	continue : 특정 부분을 제외
 *   
 *   *** 모든 제어문은 바로 밑에 있는 문장만 제어할수 있다
 *   	
 *   ex)
 *   	if(조건문) 문장1 → if문이 제어
 *   	문장2 → 일반문장
 *   
 *   	문장2개를 동시에 제어하려면 { }
 *   	
 */
import java.util.*;

public class 제어문_1 {

	public static void main(String[] args) {
		//한개의 점수를 받는다 → 60점 이상 합격 / 60점이하면 불합격
		int score =(int)(Math.random()*101);
		System.out.println("점수 : "+score);
		/*
		 * if(score>=60) { System.out.println("합격"); } else
		 * System.out.println("불합격");
		 */
		System.out.println(score>=60? "합격":"불합격");
	}

}
