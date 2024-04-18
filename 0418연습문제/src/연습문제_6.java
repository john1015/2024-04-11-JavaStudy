import java.util.Scanner;

public class 연습문제_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = sc.nextInt();
		int sum=0;
		for (int i = 1; i <= a; i++) {
			sum+=i;
		}
		System.out.println("1~"+a+"까지의 합:"+sum);
	}

}
