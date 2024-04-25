/*
 * 2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. (실적 0~100)1) 사번별 실적을 출력하시오.
 * 사원(1) 50..
 * 2) 1월 실적의 총점과 평균을 출력하시오.
 * 3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
 */
public class 연습문제_2 {

	public static void main(String[] args) {
		
		int[] human= {50,45,35,12,70};
		int total=0,max=0,min=100,maxn=0,minn=0;
		double avg=0;
		for (int i = 0; i < human.length; i++) {
			System.out.println((i+1)+"번 사원 실적 : "+human[i]);
			total+=human[i];
			if(human[i]>max) {
				max=human[i];
				maxn=i+1;
			}
			if(human[i]<min) {
				minn=i+1;
				min=human[i];
			}
		}
		avg=total/5.0;
		System.out.println("1월실적 총점 : "+total+" 평균 : "+avg);
		System.out.println("이달의 사원 : "+maxn+"번사원 "+max+"점 최악의 사원 : "+minn+"번사원 "+min);
	}

}
