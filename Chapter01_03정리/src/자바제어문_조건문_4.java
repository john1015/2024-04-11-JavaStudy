// if~else

import java.util.Scanner;
import javax.swing.*;

public class 자바제어문_조건문_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id=JOptionPane.showInputDialog("ID입력 : ");
		String pwd=JOptionPane.showInputDialog("비밀번호 입력 : ");
		final String ID="admin";
		final String PWD="1234";
		
		if(ID.equals(id)&&pwd.equals(pwd)) {
			//로그인
			JOptionPane.showInternalMessageDialog(null, id+"님 로그인 되었습니다\n메인으로 이동합니다");
		}
		else {
			//로그인 실패
			JOptionPane.showInternalMessageDialog(null, "아이디나 비밀번호가 틀렸습니다\n다시 입력하세요");

		}
		
	}

}
