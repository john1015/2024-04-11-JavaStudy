package com.sist.main;

public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try ~ catch ==> 수행 (웹에서 필수 => 네트워크와 관련) , 오라클 연동 ...
		// 웹 , 파일 , 오라클 => 예외처리는 문법(반드시 추가)
		/*
		 * 파일을 읽어서 데이터 출력
		 * try{
		 * FileReader fr = new FileReader("경로명");
		 * int i=0;
		 * while((i=tr.read())!=-1){
		 * 	System.out.print((char)i);
		 * }
		 * fr.close();
		 * }catch(IOException e){}
		 */
		
		try {
			System.out.println("문장 1");
			System.out.println("문장 2");
			System.out.println("문장 3");
			int[] arr = new int[2]; // 0,1
			System.out.println(arr[2]);// 상위 클래스 에러 설정 or 여기에 해당되는 에러 catch
			//System.out.println(10/0);// 에러 발생 4~5건너뛴다
			System.out.println("문장 4");
			System.out.println("문장 5");// => catch는 건너뛴다
		} catch (ArithmeticException e) {
			System.out.println("에러발생 => 복구"); // 에러가 발생시에만 수행
		}
		System.out.println("문장 6");
		System.out.println("문장 7");
		System.out.println("프로그램 종료");
		
	}

}
