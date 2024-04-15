/*
 * 점수 >= 60 <=100 → true
 */
public class 연산자_논리연산자_2 {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*100)+1;//1~100 난수 발생
		System.out.println("난수 값 : " + score);
		
		boolean bCheck =score >=60 && score%2==0;
		System.out.println(bCheck);
		//score가 40이상이고 score홀수면 
		bCheck = score >=40 && score%2!=0;
		System.out.println(bCheck);
		
		
	}

}
