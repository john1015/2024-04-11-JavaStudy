package com.sist.main;

abstract class Button{
	public abstract void click();
	
}
class Login extends Button{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("로그인 요청 ...");// 버튼이 공통기반 => 선언 => 구현내용이 틀리다 
	}
	
}
class Join extends Button{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("회원 가입 요청 ...");
	}
	
}
// 결합성이 낮게 만들 수 있다

public class 추상클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Login();
		btn.click();
		btn = new Join();
		btn.click();
	}

}
