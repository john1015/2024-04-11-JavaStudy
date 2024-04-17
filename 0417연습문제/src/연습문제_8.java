//8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
import java.util.Iterator;

public class 연습문제_8 {

	public static void main(String[] args) {

		int a = 0;
		for (int i = 0; i < 100; i += 2) {
			a = a + i;
		}
		System.out.println(a);

	}

}
