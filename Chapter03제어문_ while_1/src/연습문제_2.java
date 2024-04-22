//2.	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.

import java.util.Scanner;

public class 연습문제_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String c=" ";
		System.out.println("달을 입력하세요(1~12)");
		int mon = sc.nextInt();
		//switch문
		switch(mon) {
			case 12:
			case 1:
			case 2:
				c="겨울";
				System.out.println(c);
				break;
			case 3:
			case 4:
			case 5:
				c="봄";
				System.out.println(c);
				break;
			case 6:
			case 7:
			case 8:
				c="여름";
				System.out.println(c);
				break;
			case 9:
			case 10:
			case 11:
				c="가을";
				System.out.println(c);
				break;
			default:
				System.out.println(mon+"월은 없는 월입니다!!");
		}
		//if~else
		mon=sc.nextInt();
		if(mon==12||mon==1||mon==2) {
			c="겨울";
			System.out.println(c);
		}
		else if(mon==3||mon==4||mon==5) {
			c="봄";
			System.out.println(c);
		}
		else if(mon==6||mon==7||mon==8) {
			c="여름";
			System.out.println(c);
		}
		else if(mon==9||mon==10||mon==11) {
			c="가을";
			System.out.println(c);
		}
		else System.out.println(c+"월은 없는 월입니다!!!");
		
		
	}

}
