/*
 * 7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
    A C D H J
 => A C D H J
 => J H D C A

 */

import java.util.Arrays;

public class 연습문제_7 {

	public static void main(String[] args) {

		char[] s = {'A', 'C', 'D', 'H', 'J'};
		char temp=' ';
		
		for (int i = 0; i < s.length-1; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i]>s[j]){
					temp=s[j];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(s);
		
		for (int i = s.length-1; i >=0; i--) {
			System.out.print(s[i]);
		}
	}

}
