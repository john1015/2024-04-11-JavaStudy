/*
 * if(조건문) → 웹(page를 나눈 경우 , 상세보기 , 검색)
 * 			→ 사람 → 한눈에 볼 수 있는 이미지 → 15~20
 * 54page
 * 조건문 형식)
 * 			if (조건문) → true/false → 부정연산자(!) , 비교연산자 , 논리연산자{
 * 				실행문장 → 조건이 true일때만 수행이된다
 * 			}
 * 			----------------------------
 * 			연산자 사용법
 * 			산술연산자
 * 			비교연산자 
 * --------------------------------		
 * 			논리연산자 
 * 			부정연산자 
 * 	--------------------------------조건문,반복문 
 * 			증감연산자 
 *-------------------------------- 반복문 
 * 			대입연산자 → 결과값 받기
 * 
 * 대입연산자
 * 		
 */
public class 제어문_단일조건문_3 {
	public static void display() {

		int sum=0;
		int num=(int)(Math.random()*100)+1;
		
		System.out.println("1.num"+num);//1~100임의추출
		if(num>=50) sum+=num;// sum=sum+num
		
		num=(int)(Math.random()*100)+1;
		System.out.println("2.num"+num);
		if(num>=50) sum+=num;
				
		num=(int)(Math.random()*100)+1;
		System.out.println("3.num"+num);
		if(num>=50) sum+=num;
		
		System.out.println("====== 결과값 ======");
		System.out.println("sum : "+sum);
	}
	public static void main(String[] args) {
		
		int sum=0;
		int num=(int)(Math.random()*100)+1;
		
		System.out.println("1.num "+num);//1~100임의추출
		if(num>=50) sum+=num;// sum=sum+num
		
		num=(int)(Math.random()*100)+1;
		System.out.println("2.num "+num);
		if(num>=50) sum+=num;
				
		num=(int)(Math.random()*100)+1;
		System.out.println("3.num "+num);
		if(num>=50) sum+=num;
		
		System.out.println("====== 결과값 ======");
		System.out.println("sum : "+sum);
		display();
	}

}
