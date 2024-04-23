/*
 *  1~100 사이의 정수를 10개 추출
 *  → 최대값 / 최소값
 */
public class 자바제어문_반복문_4 {

	public static void main(String[] args) {
		
		int max=1,min=100; //가장 낮은수 / 높은수로 설정
		
		//반복 수행 → 임의의 정수 10개 추출
		for (int i = 1; i <= 10; i++) { // 출력하고 상관이 없다
			int ran = (int)(Math.random()*100)+1; // 임의의 정수
			if(max<ran) max = ran;
			if(min>ran) min = ran;
			System.out.println(i+" : "+ran);
		}
		/*
		 * int max=1;
		 * int a=10;
		 * int b=20;
		 * int c=30;
		 * 
		 * if(max<a)
		 * 	 max = a → max → 0 → 10
		 * if(max<b)
		 * 	 max = b → max → 10 → 20
		 * if(max<c)
		 * 	 max = c → max → 20 → 30
		 */
		System.out.println("최대값 : "+ max +" 최소값 : "+min);
		
	}

}
