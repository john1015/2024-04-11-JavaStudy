
/*
 * 문자열 → char[]
 * String → 문자열을 저장하는 데이터형 / 클래스 (기능 → 메소드)
 * ------ 프로그램에서 가장 많이 사용되는 데이터형
 * 1) 형식
 * 	  String name = "홍길동";
 * 
 * String name = new String("홍길동"); → 제한이 없다
 * 2) 연산자 
 * 	  + : 문자열 결합
 * 	  String name = "홍길동";
 * 	  String etc = "입니다";
 *    → System.out.println(name+etc); → 홍길동입니다
 * 3) 기능
 * 	 ***= equals() : 같다(==) 같은 문자열이 있는 경우
 * 	 ***= contains() : 문자열중에 포함여부
 * -------------------서제스트(자동 완성기)
 * 	 = startsWith() : 시작하는 문자열이 같은 경우 → 검색    
 * 	 = endsWith() : 끝나는 문자열이 같은 경우 → 확장자 찾는 경우
 * -------------------
 *   = charAt() : 문자열중에 문자 한개 추출 → char
 *   ***= indexOf() : 문자가 몇번째 존재한느지 확인(앞에서부터)
 *   ***= lastIndexOf() : 문자가 몇번째 존재한느지 확인(뒤에서부터)
 *   ***= length() : 문자갯수
 *   = replace() : 문자변환
 *   ***= substring() : 문자를 자르는 경우에 사용
 *	 = toUpperCase() : 대문자 변환
 * 	 = toLowerCase() : 소문자 변환
 * 	 ***= trim() : 공백문자 제거 (좌우)
 * 	 = split , replaceAll() , ***valueOf()
 * --------------------------------- 반드시 암기
 * JavaScript → 문자열 기능 동일
 */
import java.util.Scanner;

public class 문자열_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String alpha = "abcdefg";
		System.out.println("문자 갯수 : " + alpha.length());
		System.out.println("대문자 변환 : " + alpha.toUpperCase());
		alpha = "ABCDEFG";
		System.out.println("소문자 변환 : " + alpha.toLowerCase());
		/*
		 * ABCDEFG → 문자열은 index번호를 가지고 있다 0123456
		 * 
		 */

		System.out.println("문자 추출 : 3번째 : " + alpha.charAt(2));
		String myId="admin";
		String myPwd="1234";
		System.out.print("아이디입력");
		String id=scan.next();
		System.out.print("비밀번호입력");
		String pwd=scan.next();
		
		if(id.equals(myId)&&pwd.equals(myPwd)) {
			System.out.println(id+"님 로그인되었습니다");
		}
		else {
			System.out.println("아이디나 비밀번호가 다릅니다");
		}

	}

}
