//4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
import java.util.Scanner;

public class 연습문제_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int a=sc.nextInt();
		if(a%4==0 && a%100!=0||(a%400==0))System.out.println(a+"년도는 윤년입니다");
		else System.out.println(a+"년도는 윤년이 아닙니다");
	}

}
