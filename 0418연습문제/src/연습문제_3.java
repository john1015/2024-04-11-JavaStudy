/*
 * 1) 형식  for(초기값;조건문;증가식){반복 실행 문장}
 * 2) 순서       1     2     4      3   2,3,4...반복
 * 3) 초기값 :시작점 → int i=0,inti=1,char c='A' ...
 * 4) 조건식 : 어디까지 출력(범위) i<=10
 * 5) 증가 : 2씩증가,1씩증가,1씩감소... 
 */
public class 연습문제_3 {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==0)sum+=i;
		}
		System.out.println("2+4+...100의 합 : "+sum);
	}
}
