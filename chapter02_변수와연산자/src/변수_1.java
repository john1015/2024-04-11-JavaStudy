/*
 * 
 * 변수 : 한개의 데이터를 저장하는 메모리 공간의 이름
 * ------------------------
 *  필요시에는 변경이 가능
 *  메모리 공간 → 4byte씩 나눠진다
 *  0-----------
 *		사용중
 *  4-----------
 *  	사용중
 *  8-----------
 *  	10-------------별칭 a
 *  12----------
 *  
 *  16----------
 *  ...
 *  ...
 *  
 *  1) 변수 명칭법
 *  	1. 알파벳이나 한글로 시작한다
 *  	   알파벳 사용시에는 대소문자를 구분한다 a / A
 *  	2. 숫자 사용이 가능하다(앞에 사용할수 없다) a1 , a2
 *  	3. 특수문자 사용이 가능( _ , $ ) → 단어가 2개 → file_name
 *  	4. 키워드는 사용할 수 없다 - 자바에서 이미 사용중인 단어(빨간색 단어들(예약어) public , class , int 등)
 *  	5. 공백이 있으면 안된다 String a b; → X
 *  	6. 변수먕에 대한 제한이 없다
 *  	   --------------3~10 → 압축
 *  	   국어점수 : a => kor 같이 알아보기 쉽게
 *  	   kor = 89
 *  	  ----   --
 *         kor : 변수 → 다음에 다시 사용한다 
 *         89 : 실제 저장된 값 → 리터럴
 *         
 *         변수의 형식
 *          데이터형 변수면 = 값
 *          -----------
 *          정수 
 *          	★1byte → byte → 파일읽기 / 업로드 / 다운로드 / 네트워크 전송
 *          		-128~127까지만 사용이 가능 → 기능을 벗어남 
 *          	2byte → short → 사용빈도는 거의 없다 (C언어와 호환성)
 *          	---------------------------------------------------
 *          	★4byte → int → default (컴퓨터는 무조건 숫자 → int)
 *          	★8byte → long → 금융권
 *          	---------------------------------------------------구분 하는법 숫자뒤에 L(l)
 *          	byte → 메모리 공간을 절약  속도 대부분은 (int)
 *          	10(int) 10l(long)
 *          	→ 컴퓨터에 저장 0,1
 *          	1byte → 8bit(0,1→8로 저장)
 *          	-----------------------------------------------------
 *          	부호비트 1 1 1 1 1 1 1
 *          	--------
 *          	0 → 양수
 *          
 *          실수 
 *          	4byte
 *           	8byte
 *          문자 
 *          	2byte
 *          논리 
 *          	1byte
 *          데이터를 저장해서 재사용 → 변수(한개만 저장이 가능)
 *          정수
 *          byte → 1byte (-128~127)
 *          shirt → 2byte (-32768~32767)
 *          int → 4byte (-21억4천 ~ 21억3천)
 *          long → 8byte → 64bit
 */
public class 변수_1 {

	public static void main(String[] args) {
		//byte b=127; //사용범위 , 메모리 크기 → 데이터형
		byte b1 = -128;
		//데이터형 변수명 실제 메모리에 저장된 값
		System.out.println(b1);
		b1=100;
		System.out.println(b1);
		
		int kor = 90;// 4byte 메모리 공간을 만들어서 → kor 이라는 이름으로 90을 저장한다 
		int eng = 80;
		int math = 70;
		int total = 0;
		/*
		 *  초기값은 무조건 주어져야 한다  
		 *  1. 명시적 초기화 → int a100;  
		 *  2. 난수발생 → 임의로 숫자를 추출 ex)게임
		 *  3. 사용자로부터 값을 받아서 초기화  
		 *   초기값 없이 사용하면 오류발생
		 */		total = kor + eng + math;
		System.out.println(kor + eng + math); 
		System.out.println(total);
		/*
		 *  변수 
		 *  1. 지역변수 : 반드시 초기화를 해서 사용 
		 *  → 선언과 동시에 초기값 부여 int a = 0; or 선언을 먼저 int a; a = 10; or 여러개를 동시에 선언 int a,b,c; a=b=c=10;	 
		 *  2. 멤버변수 
		 *  3. 공유변수  
		 *  4. 참조변수  
		 *  30page
		 *  논리형 → boolean → 저장하는 값 → true/false
		 *  1byte → true=1,false=0
		 *  → 사용하는 위치는 조건을 사용할때
		 *  → 형식 boolean bCheck = false;
		 */	
		boolean bCheck = false;
		System.out.println(bCheck);
		/*
		 * 문자형 
		 * → char : 멀티바이트 → 2byte  => uniCode
		 * → C언어는 싱글바이트(1byte)를 씀 => ASCII
		 *   → 각 문자마다 번호를 부여
		 *   → 0~65535
		 *   → 0~255
		 *   → A → 65
		 *   → a → 97
		 *   → '0' → 48
		 */
		char haljum = 'B';
		System.out.println(haljum);
		char fname = '홍';
		System.out.println(fname);
		char num = '0';
		System.out.println(num);
		System.out.println(num);
		
		System.out.println((int)num);
	}

}
