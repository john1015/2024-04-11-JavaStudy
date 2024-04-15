/*
 * || (or) →
 * 		(조건) || (조건)
 * 		-----    -----
 *		  |        |
 *		  ----------
 *			   | 
 *			결과값 → 병렬연산자 → 조건중에 한개 이상이 true면 true가 되는 연산자 범위를 벗어난 경우에 주로 처리
 *							  score >=60 && score<70
 *							  score <=60 || score>70
 */
public class 연산자_논리연산자_3 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+1;
		boolean bCheck = (score<30) || (score>70);
		
		System.out.println("score : "+score);
		System.out.println(bCheck);
	}

}
