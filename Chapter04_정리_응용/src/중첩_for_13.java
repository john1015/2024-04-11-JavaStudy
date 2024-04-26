//알파벳 10개 난수 => 버블정렬
//중복없이

import java.util.Arrays;

public class 중첩_for_13 {

	public static void main(String[] args) {
		char[] c= new char[10];
		for (int i = 0; i < c.length; i++) {
			c[i]=(char)((Math.random()*26)+65);
			for (int j = 0; j < i; j++) {
				if(c[i]==c[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("정렬전");
		System.out.println(Arrays.toString(c));
		for (int i = 0; i < c.length-1; i++) {
			for (int j = 0; j < c.length-1-i; j++) {
				if(c[j]>c[j+1]) {
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		System.out.println("정렬후");
		System.out.println(Arrays.toString(c));
		
		System.out.println("DESC");
		for (int i = 0; i < c.length-1; i++) {
			for (int j = 0; j < c.length-1-i; j++) {
				if(c[j]<c[j+1]) {
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
