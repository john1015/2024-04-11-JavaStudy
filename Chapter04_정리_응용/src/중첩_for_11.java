import java.util.Arrays;

public class 중첩_for_11 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println("정렬전");
		System.out.println(Arrays.toString(arr));
		//=> 전부 지원하지 않는다 => 직접 만들어서 사용 , 기존 라이브러리를 수정해서 사용
								//   |오버로딩			|오버라이딩
		Arrays.sort(arr);
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(arr));
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
