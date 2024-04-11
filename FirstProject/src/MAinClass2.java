/*
  출력 형식 
  = System.out.println();
  				=== ln() => new Line
  EX) System.out.println("Hello");
  	  System.out.println("Java");
  	  Hello
  	  Java
  	  
  = System.out.print(); ==> 옆으로 출력
  EX) System.out.print("Hello ");
  	  System.out.print("Java");
  	  Hello Java
  	  
  = System.out.printf(); ==> 서식이 있는 출력
    %d = 정수 
    %f = 실수 
    %c = 문자 
    %s = 문자열
 	= 자바에서 표현법
 	  정수표현법 => 	2진법 (0,1) 0b10(2)
 	   			 	8진법 (0~7) 010(8) ... 
 	   			 	10진법 (0~9) 10 ,20 ... 
 	   			 	16진법 (0~15) 0x10(16) => 색상표시 자주쓰임
 	   		==================================
 	   		    10 , 10L
 	   		   int  long
 	   	   => 32bit  64bit
 	  실수표현법 => 10.5 , 10.5F
 	  			 -----  ----- 32bit(4byte)  1byte => 8bit
 	  			 저장하는 메모리 크기 => 64 bit
 	  문자표현법 => 'A' -> 한글자만 사용 가능
 	  문자열표현법 => "Hello" -> 여러 문자 사용 가능
 
 */
public class MAinClass2 {

	public static void main(String[] args) {
		System.out.println("\"홍길동\""); // "홍길동"으로 출력하고 싶을때
		System.out.println("c:\\javaDev\\movie.txt"); //경로명 같은경우는 이미 사용하기 때문에 2번쓰기
	}

}