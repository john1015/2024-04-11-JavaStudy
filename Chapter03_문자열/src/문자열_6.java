
public class 문자열_6 {

	public static void main(String[] args) {
		
		String alpha="ABCDEFGHIJ";
		//            0123456789
		// 1. → C~J
		// 2. → E~G
		
		System.out.println(alpha.substring(2));
		System.out.println(alpha.substring(4,7));
		
		String id=" admin ";
		System.out.println(id.length());
		//공백도 문자열 길이에 포함
		id=id.trim();
		System.out.println(id.length());
		//trim()  좌우의 공백 제거 → 검색 , 입력
		// " 감자" → 실수(space)
		
		String msg="Hello Java";
//				  	0123456789
		System.out.println(msg.indexOf("a")); // 앞에서부터 찾기
		System.out.println(msg.lastIndexOf("a"));// 뒤에서부터 찾기
		
		String ext = "Hello.java";
		System.out.println(ext.substring(ext.indexOf(".")+1));//.을찾고 .을제외하기위해 +1
		// 업로드 / 다운로드
		/*
		 * 데이터형
		 * 	정수 : 정수만 저장 → int long , byte
		 * 					  → Integer , Long , Byte
		 *  실수 : 실수만 저장 → double 
		 *  				  → Double
		 *  문자 : 문자1개 저장 → char
		 *  논리 : true/false → boolean
		 *  				  → Boolean
		 *  문자열 : 문자 여러개를 동시에 저장 → String , 기능을 가지고 있다 → 문자열을 제어하는 기능을 제공
		 *  
		 */
		
		int a=Integer.parseInt(msg);
	}

}
