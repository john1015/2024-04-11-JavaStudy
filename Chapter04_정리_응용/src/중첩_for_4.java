/*
 * ★
 * ★★
 * ★★★
 * ★★★★
 * 
 * 줄수 별표
 * i   j
 * 
 *      *
 *     **
 *    ***
 *   **** 
 *   
 *   ****
 *    ***
 *     **
 *      * 
 *   줄수 공백 별표 공백 => i+j=4 ==> j=4-i , k=i
 *    i   j   k
 *    1	  3   1
 *    2   2   2
 *    3   1   3
 *    4   0   4
 *    
 */
public class 중첩_for_4 {

	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			// 한줄에 ★ 을 출력
			for (int j = 1; j <=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 4; j >=i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		for (int i = 1; i <= 4; i++) {
				
			for (int j = 1; j <=4-i; j++) { // 공백
				System.out.print(" ");
			}	
			for (int k = 1; k <= i; k++) { // 별표
				System.out.print("*");
			}	
			System.out.println();
		}
		System.out.println("=====================");
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <=i-1; j++) { // 공백
				System.out.print(" ");
			}	
			for (int k = 1; k <= 5-i; k++) { // 별표
				System.out.print("*");
			}	
			System.out.println();
		}
	}

}
