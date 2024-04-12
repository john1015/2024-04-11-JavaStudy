/*
 *   돈 : 5600원
 *   	 → 지출 
 *   		점심:3000원
 *   		커피:1500원
 *   		심심풀이:250원
 */
public class 변수_4 {

	public static void main(String[] args) {
		
		int m = 5600;
		int lunch = 3000;
		int coffee = 1500;
		int fun = 250;
		
		System.out.println("돈 : "+m);
		System.out.println("점심 : "+lunch);
		System.out.println("커피 : "+coffee);
		System.out.println("심심풀이 : "+fun);
		System.out.println("남은돈 : "+m+" - "+lunch+" - "+coffee+" - "+fun+" = "+(m-lunch-coffee-fun));
		
	}

}
