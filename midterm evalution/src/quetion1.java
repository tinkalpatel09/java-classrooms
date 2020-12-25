import java.util.Scanner;
public class quetion1 {

	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i = 0;
			float nbr1 = 0, nbrmax = 0, nbrmin = 0, total = 0, avg = 0;
			float arr6[] = new float[6];
			String name;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your name");
			name = scan.nextLine();
			System.out.println("Enter the number 1 : ");
			nbr1 = scan.nextFloat();
			arr6[0] = nbr1;
			nbrmax = nbr1;
			nbrmin = nbr1;
			total = nbr1;
			for (i = 1; i<arr6.length; i++)
			{
				System.out.println("Enter the number " + (i + 1) + " : ");
					arr6[i] = scan.nextFloat();
					if (nbrmax < arr6[i])
					nbrmax = arr6[i];
					if (nbrmax < arr6[i])
					nbrmax = arr6[i];
					total += arr6[i];
			}
			avg = total / arr6.length;
			System.out.println(name.toUpperCase()+" Enter the biggest number: "+nbrmax+"\nEnter the smallest number: "+nbrmin+" \n The average is : "+ avg);
			}
		
	}


