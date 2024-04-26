/*
 * ★★★★★
 * ★★★★★
 * ★★★★★
 * ★★★★★
 * 
 * 1차 → 줄수 4 → 1-4
 * 2차 → ★ ==> 5개 ==> 1-5
 * 
 * 
 * ABCD
 * EFGH
 * IJKL
 * MNOP
 * 
 * ABCD
 * ABCD
 * ABCD
 * ABCD
 * 
 * ★★☆★★
 * ★★☆★★
 * ★★☆★★
 * ★★☆★★ 
 * 
 * ☆★★★★
 * ★☆★★★
 * ★★☆★★
 * ★★★☆★ 
 * ★★★★☆
 * 
 * ★★★★☆
 * ★★★☆★
 * ★★☆★★
 * ★☆★★★ 
 * ☆★★★★
 * 
 * 
 * ☆★★★☆
 * ★☆★☆★
 * ★★☆★★
 * ★☆★☆★ 
 * ☆★★★☆
 * 
 * 1=5
 * 2=4
 * 3=3
 * 4=2
 * 5=1
 * i+j=6
 * 
 * ♠♥♣◆
 * ♠♥♣◆
 * ♠♥♣◆
 * ♠♥♣◆
 */
public class 중첩_for_3 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("==============");
		char c='A';
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		System.out.println("==============");
		
		for (int i = 1; i <= 4; i++) {
			c='A'; // 1차  → 초기화
			for (int j = 1; j <= 4; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		
		System.out.println("==============");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j==3)System.out.print("☆");
				else System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("=================");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j==i) System.out.print("☆");
				else System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("=================");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if((i+j)==6) System.out.print("☆");
				else System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("=================");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(i==j||(i+j)==6) System.out.print("☆");
  				else System.out.print("★");
			}
			System.out.println();
		}
		
		String[] img= {"","♠","♥","♣","◆"};
		System.out.println("===================");
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(img[j]);
			}
			System.out.println();
		}
		
		
	}

}
