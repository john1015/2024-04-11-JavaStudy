// startsWith / endsWith
// 자동 완성기
import java.util.*;

public class 문자열배열_2 {

	public static void main(String[] args) {
		String[] books = {
				"자바와 오라클",
				"자바로 시작하는 웹 프로그램",
				"자바와 JSP",
				"JSP와 오라클",
				"JSP와 Ajax",
				"Ajax와 JQuery",
				"혼자 배우는 자바",
				"자바 프로그래밍",
				"오라클 AND 자바",
				"최신 자바"
		};
		//데이터 모음
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd = scan.next();
		for (String book : books) {
			if(book.endsWith(fd)||book.startsWith(fd)) {
				System.out.println(book);
			}
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		
	}

}
