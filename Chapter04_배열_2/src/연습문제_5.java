/*
 * 5. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 

 */
public class 연습문제_5 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)(Math.random()*10)+1;
			System.out.print(a[i]+" ");
			sum+=a[i];
		}
		System.out.println();
		System.out.println(sum/10.0);
	}

}
