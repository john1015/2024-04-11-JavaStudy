//10)숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. 
import java.util.Scanner;

public class 연습문제_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)");
		int a = sc.nextInt();
		
		if(a>=1&&a<=12) {
			if(a==12||a==1||a==2)System.out.println("겨울");
			else if(a<=5&&a>=3)System.out.println("봄");
			else if(a<=8&&a>=6)System.out.println("여름");
			else if(a<=11&&a>=9)System.out.println("가을");
		}
		else System.out.println("잘못된 입력입니다!!");
	}

}
