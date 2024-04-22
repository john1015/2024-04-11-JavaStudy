//11.	정수 입력을 받아서 60이상 합격 =>불합격  if~else
import java.util.Scanner;

public class 연습문제_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int num=sc.nextInt();
		if(num>=60) System.out.println("합격");
		else System.out.println("불합격");
	}

}
