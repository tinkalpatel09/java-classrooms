import java.util.Scanner;
public class Mid_que2 {
	
	/*
	 * author: Tinkal
	 * 
	 * */
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner scan = new Scanner(System.in);
				String name;  
				
				double cel[], feh[] , sum=0;  //The Array for  the Input and Output Data
				cel = new double[10];
				feh = new double[10];
				do {
				System.out.println("Please Enter your Name:");
				name = scan.next();
				}while(name==null);           // if name is null
				
				System.out.println("Please Enter 10 Celcius Temperatures:");
				                          //Input Data
				for (int i = 0; i < 10; i++) {
					cel[i]= scan.nextDouble();   
				}
				                   //Output Data
				for (int i = 0; i < 10; i++) {
					feh[i]= (cel[i]*9/5)+32;
					sum = sum+feh[i];
				}
				
				
				System.out.println("The user name is :"+name);
				
				
				System.out.println("The Caluclated Temperatures are: ");
				for (int i = 0; i < 10; i++) {
					System.out.println(feh[i]);
				}
				System.out.println("The sum of the caluclated temperatures is:" +sum);
				System.out.println("The Average of the caluclated temperatures is:" +(sum/10));
			}

	}
