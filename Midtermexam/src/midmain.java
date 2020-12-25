 import java.lang.String;
 import java.util.Scanner;
public class midmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * author : Tinkal Patel
		 * 
		 * */

		Scanner sobj = new Scanner(System.in);
		temp temp=new temp();
		float[] tempcelcius =new float[10];
		float[] tempfarheit =new float[10];
		float temper;
		int choice;
		do {
			//options for the user
			System.out.print("Enter 1 for Converting From C to F \n");
			System.out.print("Enter 2 for Converting From F to C \n");
			System.out.print("Enter 0 to Quit\n");
			System.out.print("Enter the choice: ");
			choice=sobj.nextInt();
			switch(choice)
			{
			//case for converting from c to f and displaying
			case 1:
			{
				int num;
				System.out.print("Enter the number of Temperatues You want to change: ");
				num=sobj.nextInt();
				for(int i=0;i<num;i++)
				{
					System.out.print("Enter the Temperature "+ (i+1) + "  :");
					temper=sobj.nextFloat();
					tempcelcius[i]=temper;
					//CtoF method is for converting from f to c
					tempfarheit[i]=temp.CtoF(temper);
					
				}
				System.out.print("Celsius To Fahrenheit : \n");
				for(int i=0;i<num;i++)
				{
					temp.displayinfo(tempcelcius[i],tempfarheit[i]);
				}
				
				break;	
			}
			//case for converting from c to f and displaying
			case 2:
			{
				int num;
				System.out.print("Enter the number of Temperatues You want to change: ");
				num=sobj.nextInt();
				for(int i=0;i<num;i++)
				{
					System.out.print("Enter the Temperature "+ (i+1) + "  :");
					temper=sobj.nextFloat();
					tempfarheit[i]=temper;
					//FtoC method is for converting from c to f
					tempcelcius[i]=temp.FtoC(temper);
					
				}
				System.out.print("Fahrenheit To celsius : \n");
				for(int i=0;i<num;i++)
				{
					
					temp.displayinfo(tempfarheit[i],tempcelcius[i]);
				}
				break;
			}
			case 0:
			{
				System.out.println("You have choose to quit");
				break;
			}
			default:
				System.out.println("Please enter a valid number 1, 2 or 0 to quit");
				break;
			}
			
			
			
			
			
		}while(choice!=0);
		
	}



	}



/*output
 * Enter 1 for Converting From C to F 
Enter 2 for Converting From F to C 
Enter 0 to Quit
Enter the choice: 1
Enter the number of Temperatues You want to change: 4
Enter the Temperature 1  :100
Enter the Temperature 2  :40
Enter the Temperature 3  :30
Enter the Temperature 4  :10
Celsius To Fahrenheit : 
100.0 the Temperature 212.040.0 the Temperature 104.030.0 the Temperature 86.010.0 the Temperature 50.0Enter 1 for Converting From C to F 
Enter 2 for Converting From F to C 
Enter 0 to Quit
Enter the choice: 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

