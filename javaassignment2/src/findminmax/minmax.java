
package findminmax;
import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String fname;

		int l=0;
		        int counter = 0;
		        float input = 0, sum = 0, average = 0;
		        float smallest = 0;
		        float largest = 0;
		     
		     
		        do {
		        System.out.println("Enter Your First Name: ");
		        fname = sc.nextLine();
		System.out.println("Enter the positive numbers " + fname + " or 0 to quit ");

		   
		        input = sc.nextFloat();
		        for(int i=0; i<input; i++)

		        {

		            if(input != 0){

		                    System.out.println("Enter the Next number "+fname+"  or 0 to quit");
		                    input = sc.nextFloat();
		                sum += input;
		                counter++;
		     
		               
		               
		                if(input > largest){
		                    largest = input;
		                } else if (input < smallest){
		                    smallest = input;
		               }

		            }

		        }

		        average = sum/counter;

 
		        System.out.println("The mean is " + average);
		        System.out.println("Smallest = " + smallest);
		        System.out.println("Largest = " + largest);
		       
		        System.out.println("\n \n Do you want to continue ? \n Press 1 for yes \t Press 0 for no");
		l = sc.nextInt();
		}
		while(l == 1);


		
	}

}
