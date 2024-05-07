/*
 *    데이터를 묶어서 사용 => 1개 이름으로 여러개의 변수에 접근 
 *                       --------------------------
 *                       배열 : 같은 데이터형 크기를 이용한다 => 고정적이다 
 *                       클래스 : 다른 데이터형을 모아서 관리 => 가변적이다 
 *    자바는 클래스로 시작 클래스로 종료 
 *    --------------------------
 *    클래스 구성요소 
 *    ------------
 *     => 사용은 데이터형 / 연산자 / 제어문 / 메소드 
 *             ----------------------------- 필요한 경우에는 라이브러리 사용 
 *             1장 : 자바 설치 , 특징
 *             ------------------------------------------------  
 *             2장 : 변수 / 데이터형 
 *             3장 : 연산자 
 *             4장 : 제어문 / 배열 
 *             5장 : 클래스 *** , 6장(객체지향의 특성) 7장(클래스 종류) ***
 *             8장 : 예외처리  
 *             ------------------------------------------------ 웹 연결 
 *             9장 ~ 11장 : 라이브러리 (암기)
 *             12장 : 핵심 => 오라클 연동 
 *             
 *             프로그램 
 *             ------
 *              네트워크 =====> C/C++
 *              데이터베이스 ==> Java => 웹 
 *             
 *    메모리 구조 
 *    --------------------
 *      메소드영역 
 *      -------- 
 *        1. 메소드 
 *        2. static 변수 
 *    --------------------
 *      스택 => 메모리 자체 관리  
 *      ---
 *        1. 지역변수 
 *        2. 매개변수 ---------------> {}이 종료되면 자동으로 메모리에서 회수  
 *    --------------------
 *      힙 => 프로그래머가 관리 => GC (실제 데이터가 저장되는 영역)
 *      --                        ---------------------- 프로그램이 종료될때까지 유지
 *        1. 배열 
 *        2. 멤버변수 
 *    --------------------
 *    ------------------------------
 *      변수 
 *       지역변수 / 매개변수 => 메모리에 저장 (메소드 호출) 
 *                          사용범위는 메소드안에서만 사용이 가능 
 *                          지역변수 : 요청처리를 위한 변수 
 *                          매개변수 : 사용자 요청값이 있는 경우 
 *                       => 저장되는 위치 : 스택         
 *       멤버변수 => 메모리에 저장 시점 => new을 이용할때 따로 생성  
 *                 => 사용범위는 클래스 전체 / 다른 클래스에서도 사용이 가능 
 *       공유변수 => 메모리 저장 시점 => 컴파일시에 한개 메모리 공간 생성 
 *                 => 사용범위는 클래스 전체 / 다른 클래스에서도 사용이 가능 
 *       class A
 *       {
 *          int a;
 *          int c;
 *          ------- 저장이 안된 상태 
 *          static int b; ==> 저장
 *       }
 *       
 *       a,c => A aa=new A(); ==> 저장되는 시점 
 *       
 *        Stack      Heap
 *       --aa--
 *        0x100
 *       -----   ↖
 *                메모리 주소--------- new => 동적 메모리 할당 (실행시마다 메모리 생성 => 변수를 묶어주는 역할)
 *                0x100   -----
 *                          0  ----> a  ===> aa.a
 *                        -----
 *                          0  ----> c  ===> aa.c ( . => 메모리 주소 접근 연산자)
 *                        -----
 *                      ---------
 *                      ** aa는 메모리 주소에 연결된 변수만 사용이 가능 
 *                      
 *         A bb=new A();
 *         
 *         --bb--
 *          0x200
 *         ------  ↖ 0x200 --------
 *                          ------
 *                            0   --> a  ==> bb.a
 *                          ------
 *                            0   --> c  ==> bb.c
 *                          ------
 *                         --------
 *         A cc=new A();
 *         
 *         --cc--
 *          0x300
 *         ------  ↖ 0x300 --------
 *                          ------
 *                            0   --> a  ==> cc.a
 *                          ------
 *                            0   --> c  ==> cc.c
 *                          ------
 *                         --------
 *         static => 
 *         
 *         ---b---
 *            0     ==> aa.b , bb.b, cc.b , A.b ==> 공유가 가능하다 
 *         ------
 *          멤버변수 사용이 거의 대부분
 *          ------ 지역변수/매개변수 
 *          ** 프로그램 종료시까지 메모리 유지 / 따라 저장이 되기 때문에 관리 
 *             다른 데이터형 여러개를 묶어서 사용이 가능 
 *          ** 프로그램 : 데이터 관리 
 *             React / Vue / Next => 데이터 관리 프로그램
 *                                   ----- AI / 머신러닝 / 딥러닝 => data.go.kr 
 *          변수 
 *          ---- 초기화
 *           멤버변수 / 공유변수 => 기본 초기화
 *             int = 0 , boolean = false , double = 0.0 , String = null
 *           멤버변수 
 *           공유변수 
 *           ------- 명시적인 초기화 
 *           ------- 자동 초기화 
 *           ------- 메모리에 저장 초기화 => 생성자 
 *           
 *           class A
 *           {
 *              int b; => 0
 *              int a=100; => 명시적인 초기화 
 *              static int c;
 *              static int d=100;
 *              => 자동 초기화 (호출없이) 
 *              멤버변수 초기화
 *              {
 *                 => 초기화 블록 
 *                 a=1000;
 *              }
 *              
 *              공유 변수 초기화 
 *              static 
 *              {
 *                 d=1000;
 *              }
 *              
 *              {
 *                 => 자동 로그인 
 *              } => 멤버변수 초기화 
 *              static => 공유 변수 초기화 
 *              {
 *              }
 *              ------------------------------
 *              class A
 *              {
 *                 int a; => 선언만 가능 
 *                           구현이 불가능 
 *                           제어문 / 연산처리 / 라이브러리 (X) 메모리 호출 
 *              }
 *              ------------------------------
 *           }
 *           지역변수 => 반드시 초기화   
 *    ------------------------------
 *      생성자 / 초기화 
 *    ------------------------------
 *      메소드 : 저장된 변수 활용 
 *      ----- 기능 
 *      => 리턴형 / 매개변수 
 *          |       |
 *                 사용자가 요청한 값 => 웹 (검색어,로그인, 회원가입, 글쓰기,수정..)
 *        요청처리에 대한 결과값
 *    ------------------------------
 *    
 *    클래스 => 재사용 목적 (부품) => 컴포넌트 
 *     |
 *    1. 데이터 보호 (노출X) => 캡슐화/은닉화
 *    2. 재사용 => 상속 / 포함 
 *               is-a  has-a
 *    3. 유지 보수 => 수정 , 추가 
 *                  오버라이딩 , 오버로딩 => 다형성 
 *    ---------------------------------------- 6장 (면접의 단골) 
 *    *** 라이브러리를 사용 
 *        ------------- 미국(정보 제공) : 시각적 효과
 *          | 프로그램에 맞게 변경 사용 => 오버라이딩 
 *          | Math.random() => 형변환 
 *          | substring(int s,int e)
 *                            ----- e-1
 *          | Spring : 로드존슨 => 전자정부 프레임워크
 *     -------------------------------------------
 *     변수 => 멤버변수  
 *    
 */
public class 클래스변수 {
	// 변수 선언 , 메소드 선언  => {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}