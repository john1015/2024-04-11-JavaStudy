package com.sist.util;
// 사용자 정의
import java.util.*; 

class Student{
	private int hakbun;
	private String name;
	private int kor,eng,math;
	// 읽기 / 쓰기 기능 추가
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	// 데이터 추가
	// 자동으로 디폴트 생성자가 생성이 안된다 ... 
	// 사용자 입력값을 받아서 초기화 
	public Student(int hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 매개변수가 있는 생성자가 있는 경우에는 디폴트 생성자 만들어야 제어가 편리하다
	public Student() {
		// 초기화 => 모든 학생 정보가 같은 값을 가지고 저장이 된다
	}
}
class A{
	int a,b;
	public A() {
		a=10;
		b=20;
	}
	public A(int a,int b) {
		this.a = a;
		this.b = b;
	}
}
public class 컬렉션_3 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		// Object => Student변경
		list.add(new Student(1,"홍길동",90,80,70));
		list.add(new Student(2,"박문수",78,83,75));
		list.add(new Student(3,"이순신",95,80,70));
		list.add(new Student(4,"이 산",89,80,70));
		list.add(new Student(5,"심청이",67,80,70));
		System.out.println("====== 데이터 출력 =======");
		// 배열 / 컬렉션 => for ~ each를 이용해서 출력
		for (Student std : list) {
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
			
		}
		System.out.println("===== 데이터 추가 =====");
		Student s = new Student();
		s.setHakbun(6);
		s.setName("강감찬");
		s.setKor(90);
		s.setMath(80);
		s.setEng(90);
		list.add(s);
		for (Student std : list) {
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		
		System.out.println("======== 데이터 추가2 ========");
		list.add(new Student(7,"춘향이",89,80,90));
		for (Student std : list) {
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
			// 웹 => String.format("%-3d%-5s%-5d%-5d%-5d\n")
		}
		System.out.println("========= 데이터 출력 =========");
		for (int i = 0; i < list.size(); i++) {
			Student std = list.get(i);// 형변환 없이 사용이 가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("====== 학생 삭제 ========");
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			Student std = list.get(i);// 형변환 없이 사용이 가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("====== 학생 수정 ======");
		list.set(1, new Student(2,"수 정",90,90,90));
		for (int i = 0; i < list.size(); i++) {
			Student std = list.get(i);// 형변환 없이 사용이 가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("====== 학생 졸업 ======");
		list.clear();
		for (Student std : list) {
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
		}
		System.out.println("현재인원 : "+list.size());
		
	}
}
