//1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
import java.util.Scanner;

public class 연습문제_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a=sc.nextInt();
		
		if(a<0)System.out.println(a+"는(은) 음수입니다");
		else System.out.println(a+"는(은) 양수입니다");
	}

}
