import java.util.*;

public class 배열_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		
		System.out.print("월 입력:");
		int month = scan.nextInt();
		
		System.out.print("일 입력:");
		int day = scan.nextInt();
		
		System.out.println("===== API 이용=====");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		String[] strweek = {"","일","월","화","수","목","금","토"}; 
		//week => 0 , week => 1
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strweek[week]+"요일입니다");
	}

}
