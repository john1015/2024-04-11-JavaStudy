//10.	10~99까지 정수중에 같은 자리의 정수를 출력하시오
public class 연습문제_10 {

	public static void main(String[] args) {
		for (int i = 10; i <=99; i++) {
			if(i%11==0) System.out.print(i+" ");
		}
		
	}

}
