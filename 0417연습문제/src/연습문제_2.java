//2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
import java.util.Scanner;

public class 연습문제_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = sc.nextInt();
		if(a%3==0&&a!=0)System.out.println(a+"는(은) 3의 배수입니다");
		else System.out.println(a+"는(은) 3의배수가 아닙니다");
		
	}

}
