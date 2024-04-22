//11.	정수 입력을 받아서 60이상 합격 =>불합격  if~else
import java.util.Scanner;

public class 연습문제_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int num=sc.nextInt();
		if(num>=60&&num<=100) System.out.println("합격");
		else if(num>100) System.out.println("점수는 100점을 넘길수 없습니다!");
		else System.out.println("불합격");
	}

}
