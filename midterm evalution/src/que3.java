import java.util.Scanner;
import java.util.Arrays;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkValue();

	}

	static void checkValue() {
		int[] arr = {3, 17, 1, 5, 51, 8, 20, 10, 7, 32};
		 int val = 0;
		 boolean find = false;
		 Scanner scanObj = new Scanner(System.in);

		 System.out.print("Enter a value:");
		 val = scanObj.nextInt();

		 for (int i=0; i<arr.length; i++) {
		 if(arr[i] == val) {
		 find = true;
		 break;
		 }
		 else {}
		 }

		 if (find)
		 { System.out.println(val+" is find into this array");}
		 else { System.out.println(val+" is not part of this array");}
		 }
}
