
public class 연습문제_7 {

	public static void main(String[] args) {
		int cnt=0;
		for (int i = 1; i <=30; i++) {
			if(i%2==0) { System.out.print(i+" "); cnt++;}
			if(cnt==3) { cnt=0; System.out.println();}
		}
		
	}

}
