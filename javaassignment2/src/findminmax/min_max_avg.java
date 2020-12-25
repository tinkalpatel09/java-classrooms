
package findminmax;
import java.util.Scanner;

public class min_max_avg {
	
	public static int getMaxValue(int[] numbers){
	 Scanner userInput = new Scanner(System.in);
     System.out.print("Enter positive integers. Enter -1 to stop. ");
     int integers = userInput.nextInt();
     
     int sum = 0;
     while(integers != 0)
     {
         //keep gathering user input
         integers = userInput.nextInt();
        
     }

     //print the results to the user
     System.out.println("You entered: " + integers + ", ");
     
     


		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
			  maxValue = numbers[i];
			}
		  }
		  return maxValue;
		}
		public static int getMinValue(int[] numbers){
		  int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
			  minValue = numbers[i];
			}
		  }
		  return minValue;
		}
	
}
