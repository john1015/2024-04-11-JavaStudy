
public class 문자열_3 {

	public static void main(String[] args) {
		String msg = "Hello Java";
		System.out.println(msg.replace("a", "b"));
		msg="홍길동 hong gil dong";
		System.out.println(msg.replaceAll("[가-힣]", "")); 
		//한글 → [가-힣]
		// 알파벳 → [A-Z] [a-z] [A-Za-z]
		// 숫자 → [0-9]
		
	}

}
