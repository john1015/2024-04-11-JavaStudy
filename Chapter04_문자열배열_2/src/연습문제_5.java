/*
 * 5. 1~100사이의 정수를 10개 저장하고  
 정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장 
 정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장

 */

import java.util.Arrays;

public class 연습문제_5 {

	public static void main(String[] args) {
		
		int[] num= new int[10];
		int evenTotal=0,oddTotal=0;
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
			System.out.println((i+1)+"번째 : "+num[i]);
			if(num[i]%2==0) evenTotal+=num[i];
			else oddTotal+=num[i];
		}
		System.out.println("짝수의 합 : "+evenTotal);
		System.out.println("홀수의 합 : "+oddTotal);
		System.out.println(Arrays.toString(num));
	}

}
