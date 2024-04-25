/*
 *  3. 크기가 10인 정수형 배열을 생성하고 여기에 0부터 9까지의 값으로 배열을 채우는 프로그램 만들기

 */
public class 연습문제_3 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i]=i;
			System.out.println(num[i]);
		}
	}

}
