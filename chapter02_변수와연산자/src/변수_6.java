
public class 변수_6 {

	public static void main(String[] args) {
		byte byteValue = 10;// 구분이 없다 → -128~127사이의 정수만 대입
		//byteValue
		int intValue = 20;//컴퓨터에서는 모든 숫자를 → int 로 인식한다(21억4천)
		// 4byte
		long longValue = 30L;//구분 숫자뒤에 L,l
		// 8byte
		float floatValue = 10.5F;//구분 뒤에 F,f
		//4byte 소수점은 6자리까지
		double doubleValue = 10.5;
		//실수의 디폴트	
		//정수 → int , 실수 → double
		//실제 프로그램에서는  int,double 가장 많이 사용된다
		// 변수 → 계속 상태가 변경 ... / 고정 → 상수
		boolean booleanVlaue = true;
		//→ 조건식 1byte  →저장은 true/false만 저장이 가능
		char charValue='A';
		//문자 1개 저장 공간 → 2byte(0~65535)
		/*
		 *  byte = **char = int = long = double
		 *  boolean   ↓
		 *          String
		 */
		char c1 = '된';
		char c2 = '장';
		char c3 = '국';
		char c4 = ' ';
		char c5 = '끓';
		char c6 = '이';
		char c7 = '는';
		char c8 = ' ';
		char c9 = '법';
		System.out.println(c1+""+c2+c3+c4+c5+c6+c7+c8+c9);
		String s = "된장국 끓이는 법";
		System.out.println(s);
	}
   
}
