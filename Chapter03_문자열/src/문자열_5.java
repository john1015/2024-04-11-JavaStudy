
public class 문자열_5 {

	public static void main(String[] args) {
		
		String f="자두:plum";
		System.out.println("자두의 영어는?");
		System.out.println("영어는 "+f.substring(f.indexOf(":")+1));
		/*
		 * subString : 문자열을 자르는 경우에 사용
		 * Hello Java
		 * 0123456789
		 * substring(6) → 6789(Java)
		 * sunstring(3,8) → 34567(lo Ja)
		 * substring(int startIndex)
		 * substring(int startIndex , int endIndex) → endIndex-1
		 */
		String msg = "Hello Java";
		System.out.println(msg.substring(0,7)+"...");
	}

}
