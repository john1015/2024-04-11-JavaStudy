/*
 *  A-Z까지 for
 *  Z-A까지 while
 */
public class 자바제어문_반복문_3 {

	public static void main(String[] args) {
		System.out.print("for A-Z : ");
		for (char c = 'A'; c <='Z'; c++) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.print("while Z-A : ");
		char c='Z';
		while (c>='A') {
			System.out.print(c+" ");
			c--;
		}
	}

}
