//1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 점수를 score 배열 변수에 저장하 고 1) 아래와 같이 출력하시오.
/*1번 학생 : 100점  
2번 학생 : 90점  
3번 학생 : 85점  

2) 학생들의 총점을 출력하시오.*/

public class 연습문제_1 {

	public static void main(String[] args) {
		int[] stu = {100,90,85};
		int total=0;
		for (int i = 0; i < stu.length; i++) {
			total+=stu[i];
		}
		System.out.println("학생들의 총점 : "+total);
	}

}
