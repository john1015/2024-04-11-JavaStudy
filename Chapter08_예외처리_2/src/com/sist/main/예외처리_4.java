package com.sist.main;
/*
 *    멀티 예외 처리
 *    -----------
 *    catch를 여러개 사용 => catch(1개로 통합)
 * 
 */
public class 예외처리_4 {
	// throws뒤에 있는 예외가 예상된다 => 사용시는 예외 처리후에 사용한다 => 에러발생시 대처
	// => 처리는 개발자에게 맡기는 프로그램 => 떠맡기기
	public void display() throws NullPointerException,NumberFormatException,ArrayIndexOutOfBoundsException{
		
	}
	public void print() throws NullPointerException,NumberFormatException,ArrayIndexOutOfBoundsException{
		display();
	}
	public void print2() throws Exception{
		display();
	}
	public void print3() {
		try {
			
		} catch (NullPointerException e) {}
		catch (NumberFormatException e) {}
		catch (ArrayIndexOutOfBoundsException e) {}
	}
	public void print4() {
		try {
			display();
		} catch (Exception e) {	}
	}
	public void print5() {
		try {
			display();
		} catch (NullPointerException|NumberFormatException|ArrayIndexOutOfBoundsException e) {	}
	}
	// => throws(알림) => 알림, 직접처리가 가능하다
	// => try => 직접처리 => 알림을 줄 필요가 없다
	public static void main(String[] args) throws Exception {
		Thread.sleep(1000);
	}
}
