/*
 * 6. 0~9사이의 난수를 100개 발생해서 
   빈도를 구해서 출력하시오 
   예)
   0의 개수: 1
   1의 개수: 1
   ..
   9의 개수: 0

 */
public class 연습문제_6 {

	public static void main(String[] args) {
		
		int[] ran=new int[100];
		int[] num=new int[10];
		for (int i = 0; i < ran.length; i++) {
			ran[i]=(int)(Math.random()*10);
			switch (ran[i]){
			case 9: 
				num[9]++;
				break;
			case 8:
				num[8]++;
				break;
			case 7:
				num[7]++;
				break;
			case 6:
				num[6]++;
				break;
			case 5:
				num[5]++;
				break;
			case 4:
				num[4]++;
				break;
			case 3:
				num[3]++;
				break;
			case 2:
				num[2]++;
				break;
			case 1:
				num[1]++;
				break;
			case 0:
				num[0]++;
				break;
			}
			
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+"의 개수: "+num[i]);
		}
	}

}
