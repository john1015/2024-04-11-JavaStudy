/*
 *  단항연산자
 *  	= 증감연산자 : ++,-- → 1개증가/1개감소
 *  	int a=10;
 *  	a++ → 10+1
 *  	a-- → 10-1
 *  
 *  	전치연산 : 먼저 증가후에 대입 : ++a/--a
 *  	후치 연산 : 대입후 나중에 증가 :a++/a--
 *  
 *  	int a=10; int b = ++a;
 *  	1)a값을 증가
 *  	2)증가값을 b에 대입 → a=11 , b=11
 *  
 *  	int a=10; int b = a++;
 *  	1) a값을 b에 대입
 *  	2) a값을 증가 → a=11 , b=10
 *  
 *  	ex) int a=10; int b=++a + ++a + a++;
 *  			a=13 , b=35(11+12+12)
 *  		int a=10; int b=a++ + a++ + a++;
 *  			a=13 , b=33(10+11+12)
 *  		int a=10; int b= ++a + ++a + ++a;
 *  			a=13 , b=36(11+12+13)
 *  		int a=10 ; int b = a++ + ++a + a++;
 *  			a=13 , b= 34(10+12+12)
 *  		→ 누적 , 제어문(반복문) , 총알
 *  
 *  	= 부정연산자 : !=
 *  	= 형변환연산자(boolean은 제외)
 */
public class 연산자_단항연산자 {

	public static void main(String[] args) {

		int a=10;
		a++; //11
		a++; //12
		a++; //13
		System.out.println("a = "+a);
		int b=10;
		b--; //9
		b--; //8
		b--; //7
		System.out.println("b = "+b);
		
		int c=10;
		++c;
		++c;
		++c;
		System.out.println("c = "+c);
		
		int d=10;
		--d;
		--d;
		--d;
		System.out.println("d = "+d);
	}

}
