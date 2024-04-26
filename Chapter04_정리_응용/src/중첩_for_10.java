//알파벳 10개를 임의로 추출힌후에 정렬해서 출력 => ASC/DESC

import java.util.Arrays;

public class 중첩_for_10 {

	public static void main(String[] args) {
		char[] ran = new char[10];
		for (int i = 0; i < ran.length; i++) {
			ran[i]=(char)((Math.random()*27)+65);
		
		}
		System.out.println("변경전");
		System.out.println(Arrays.toString(ran));
		
		for (int i = 0; i < ran.length-1; i++) {
			for (int j = i; j < ran.length; j++) {
				if(ran[i]>ran[j]) {
					char temp=ran[i];
					ran[i]=ran[j];
					ran[j]=temp;
				}
			}
		}
		System.out.println("변경후-올림");
		System.out.println(Arrays.toString(ran));
		for (int i = 0; i < ran.length-1; i++) {
			for (int j = i; j < ran.length; j++) {
				if(ran[i]<ran[j]) {
					char temp=ran[i];
					ran[i]=ran[j];
					ran[j]=temp;
				}
			}
		}
		System.out.println("변경후-내림");
		System.out.println(Arrays.toString(ran));
		
	}

}
