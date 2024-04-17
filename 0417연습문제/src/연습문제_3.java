//3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
import java.util.Scanner;

public class 연습문제_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = sc.nextInt();
		if(a<0) {
			a*=-1;
			System.out.println("a="+a);
		}
		else System.out.println("a="+a);
		
	}

}
