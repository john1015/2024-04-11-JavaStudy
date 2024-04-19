//1~100까지 좌우대칭 숫자를 추출해서 출력

public class EX1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=100; i++) {
			if(i%11==0) System.out.print(i+" ");
		}
	}

}
