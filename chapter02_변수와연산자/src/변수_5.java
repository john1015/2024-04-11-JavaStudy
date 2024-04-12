/*
 *  byte , char, int, long , float , double
 *  기타 : boolean
 *  
 *  1. 데이터형의 크기
 *     byte < char < int < long <float < double
 *     → 크기의 기준 : 수 표현의 갯수
 *     	 1 → 1.000000
 *     
 *     int a = 10L =→ X 크기가 다름 왼쪽이 같거나 크다 O 작다 X
 *     byte + byte = int
 *     char + char = int
 */
public class 변수_5 {

	public static void main(String[] args) {
		int a = 'A';
		System.out.println(a);
		char c = 65;
		double d ='A';
		    
	}

}
