/*
 * 정렬
 * --- 버블 정렬 (인접한 수끼리 비교) ==> 뒤에서부터 고정
 * 16  18  28  35  2  19 => 2 16 18 19 28 35 ASC(오름차순)
 * 
 * 16  18  28  35  2  19
 * --  --
 * 16  18
 *     --  --
 *     18  28
 *         --  --
 *         28  35
 *             --  --
 *             2   35
 *                 --  --
 *                 19  35
 * ------------------------ for 1
 * 16  18  28  2   19  35
 * --  --              -- 고정
 * 16  18
 *     --  --
 *     18  28
 *         --  --
 *         2   28
 *             --  --
 *             19  28
 * ------------------------ for 2
 * 16  18  2   19  28  35
 * --  --          ------
 * 16  18
 *     --  --
 *     2   18
 *         --  --
 *         18  19
 * ------------------------ for 3
 * 16  2   18  19  28  35
 * --  --      ----------
 * 2   16 
 *     --  --
 *     16  18
 * ------------------------- for 4
 * -- --  ---------------
 * 2  16
 * ------------------------- for 5 
 * 버블 정렬 ----- length-1바퀴                
 * 
 */

import java.util.Arrays;

public class 중첩_for_12 {

	public static void main(String[] args) {
		int[] arr= {16, 18, 28, 35, 2, 19};
		System.out.println("=========== 정렬전 ============");
		System.out.println(Arrays.toString(arr));
		System.out.println("========= 정렬후 ASC ==========");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println((i+1)+"Round:"+Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("========== DESC =============");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println((i+1)+"Round:"+Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
