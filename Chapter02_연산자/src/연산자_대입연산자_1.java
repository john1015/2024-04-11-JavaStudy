/*
 *  대인연산자 → 메모리에 저장
 *  
 *  = → int a=10;
 *  		  10을 a라는 메모리에 저장(대입)
 *    → 형변환
 *    	int a='A'
 *    	----  ---
 *    	  4    2  → 작은 값은 대입 가능
 *    ** 'A' →65로 변경후 저장
 *    long l=20;
 *    ------ --
 *     8     4 
 *     → 20 => 20L
 *     double d=20; → 20.0
 *     ---------------------
 *     복합대입연산자
 *     
 *     	+=
 *     		int a=10; a+=1 → a=a+1
 *      -= 
 *          a=a-1;
 *      *= 
 *          a=a*2
 *      /=
 *      	a=a/2
 */
public class 연산자_대입연산자_1 {

	public static void main(String[] args) {

		int a=10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println(a);
		
		int b=10;
		b+=5;
		System.out.println(b);
		
		int score1=10;
		int score2=5;
		score1+=score2;
		System.out.println("score1 : "+score1);
		
		score1-=score2;
		System.out.println("score1 : "+score1);
		//변수값이 변경 → ++ -- += -=
		// 나머지 연산자는 변수값 변경이 안된다
		int m=10;
		int n=20;
		System.out.println(m+n);;
		m++;
		System.out.println(m+n);
	}

}
