import java.util.Arrays;

public class printarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray();
	}
	
	 static void printArray() {
		 int[] arr = {3, 17, 1, 5, 51, 8, 20, 10, 7, 32};
		 System.out.print("Unsorted array\n");
		 System.out.println("********************************");
		 for (int i=0; i<arr.length; i++)
		 System.out.println(arr[i]);
		 System.out.println("********************************");

		 Arrays.sort(arr);

		 System.out.println(" ");
		 System.out.print("Sorted array\n");
		 System.out.println("********************************");
		 for (int i=0; i<arr.length; i++)
		 System.out.println(arr[i]);
		 System.out.println("********************************");
		 System.out.println(" ");

		 int sum = 0;
		 for( int i : arr) {
		 sum += i;
		 }
		 System.out.print("Sum of the array\n");
		 System.out.println("********************************");
		 System.out.println(sum);
		 System.out.println(" ");

}
}