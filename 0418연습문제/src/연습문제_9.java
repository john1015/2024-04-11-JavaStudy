
public class 연습문제_9 {

	public static void main(String[] args) {
		int a=1;
		for (int i = 1; i <=10; i++) {
			if(i%3==0) continue;
			else {
				if(i==10) System.out.println(i);
				else System.out.print(i+" ,  ");
			}
				
		}
	}

}
