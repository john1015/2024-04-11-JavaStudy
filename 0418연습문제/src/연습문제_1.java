import java.util.Scanner;

public class 연습문제_1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		int score = a/10;
		char hak = 'A';
		
		switch(score){
		case 10:
		case 9: hak = 'A'; System.out.println(hak+"학점입니다"); break;
		case 8: hak = 'B'; System.out.println(hak+"학점입니다"); break;
		case 7: hak = 'C'; System.out.println(hak+"학점입니다"); break;
		case 6: hak = 'D'; System.out.println(hak+"학점입니다"); break;
		case 5: case 4: case 3: 
		case 2: case 1: case 0: hak = 'F'; System.out.println(hak+"학점입니다"); break;
		default: System.out.println("잘못된 점수 입력입니다!!"); 
		}
	}

}
