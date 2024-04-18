/*
 * 
 */
public class 제어문_선택문_2 {

	public static void main(String[] args) {
		
		int com =(int)(Math.random()*3);// 0 1 2
		// 정수 → 상수
		// 순서는 상관이 없다 → 분석 , 추가 → 순차적으로 서술 권장
		switch(com) { // 정수
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
			// 마지막은 break 생략 가능
				
			// defalut 생략이 가능
		}
	}

}
