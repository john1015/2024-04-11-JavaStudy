//8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.

public class 연습문제_8 {

	public static void main(String[] args) {
		int jjak=0,hol=0;
		for (int i = 3; i <= 4462; i++) {
			if(i%2==0) jjak += i; 
			else hol+=i;
		}
		System.out.println("3~4462짝수의 합 : "+jjak);
		System.out.println("3~4462홀수의 합 : "+hol);
	}
	
	

	
}
