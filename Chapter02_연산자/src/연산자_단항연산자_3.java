/*
 *  형변환 연산자
 *  -----------(데이터형) → boolean은 제외
 *  	UpCasting → 데이터형을 크게 만든다
 *  	DownCasting → 데이터형을 낮게
 *  
 *  		 =================> UpCasting
 *  	byte < char < int < long < float < double
 *  	   DownCasting <===============
 *  예)
 *  	'A' → char
 *  	(int)'A' → 65(int형) → UpCasting
 *  
 *  	
 *  	10.5 → double
 *  	(int)10.5 → 10(int형) → DownCasting  
 */
public class 연산자_단항연산자_3 {

	public static void main(String[] args) {
		// 형변환 (데이터형) → (int) ,(double) , (char) ...
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println(98);
		System.out.println((char)98);
		
		System.out.println(10.5);
		System.out.println((int)10.5);
		/*
		 * 10.5+10.5 → 21.0
		 * (int)(10.5+10.5) → 21
		 * 
		 * (int)10.5+(int)10.5 → 20
		 * 
		 * double d=123456.78
		 * int i 123456
		 *  (int)((d-i)*100) → 77.9999999999999999... → 77 float는 78로 나옴 bit값이 달라서 이렇게됨
		 */
		
		int rand=(int)(Math.random()*100)+1; // 0.0~0.99 → 0.0~99.0 +1 → 1~100
		System.out.println("rand = "+rand);
	}

}
