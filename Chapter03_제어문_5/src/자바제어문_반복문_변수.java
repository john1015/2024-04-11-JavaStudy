/*
 * 
 */
public class 자바제어문_반복문_변수 {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {//i<=10 , i=11종료 
			System.out.print(i+" ");
		}
		System.out.println();
		// i변수는 메모리에서 삭제 → {}밖에 변수를 위치시키자!!
		System.out.println("i = : "+i); 
	}

}
