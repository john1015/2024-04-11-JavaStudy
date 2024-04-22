//13.	정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.

public class 연습문제_13 {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			int ran = (int)(Math.random()*10)+1;
			a[i]=ran;
			System.out.print(a[i] +" ");
		}
		System.out.println();
		int sum=0;
		for (int i = 0; i <10; i++) {
			
			sum+=a[i];
		}
		System.out.println("평균은 "+sum/10.0);
	}

}
