//12.	5개으 정수를 임의로 추출하여 최대값,최소값을 출력하는 프로그램을 작성하시오

public class 연습문제_12 {

	public static void main(String[] args) {
		
		int max=1, min=100;
		for (int i = 1; i <=5; i++) {
			int ran = (int)(Math.random()*100)+1;
			if(max<ran) max=ran;
			if(min>ran) min = ran;
			System.out.println(ran);
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}

}
