/*
 * 6.다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
 */
public class 연습문제_6 {

	public static void main(String[] args) {
		int[] num = { 94, 85, 95, 88, 90 };
		int max=0,min=100;
		for (int i = 0; i < num.length; i++) {
			if(max<num[i]) max=num[i];
			if(min>num[i]) min=num[i];
		}
		System.out.println("Max : "+max+ " min : "+min);
	}

}
