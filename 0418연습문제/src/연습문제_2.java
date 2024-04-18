import java.util.Scanner;

public class 연습문제_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num1 = sc.nextInt();
		System.out.println("+ - * / 입력 : ");
		char op = sc.next().charAt(0);
		System.out.println("정수입력 : ");
		int num2 = sc.nextInt();
		
		switch(op) {
		case '+': System.out.println(num1+"+"+num2+"="+(num1+num2));  break;
		case '-': System.out.println(num1+"-"+num2+"="+(num1-num2));  break;
		case '*': System.out.println(num1+"*"+num2+"="+(num1*num2)); break;
		case '/': 
			if(num2==0) System.out.println("0으로 나눌수 없습니다!!"); 
			else System.out.println(num1+"/"+num2+"="+(num1/num2)); 
			break;
		}
	}

}
