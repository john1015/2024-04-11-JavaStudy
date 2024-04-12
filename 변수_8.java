import java.util.Arrays;

public class 변수_8 {

	public static void main(String[] args) {
		
		int[] arr = {30,20,40,50,10};
		System.out.println("변경전: ");
		System.out.println(Arrays.toString(arr));
		/*
		 * for(int i=0; i< arr.length-1; i++) { for(int j=i+1; j<arr.length; j++) {
		 * if(arr[i]>arr[j]) { int temp=arr[i]; arr[i]=arr[j]; arr[j]=temp; } } }
		 */
		Arrays.sort(arr);
		System.out.println("변경후: ");
		System.out.println(Arrays.toString(arr));
		 
	}

}
