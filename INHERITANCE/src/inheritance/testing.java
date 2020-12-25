package inheritance;
import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		
		Scanner sobj = new Scanner(System.in);	
		Person p=new Person();
		
		Student s = new Student();
		Employee e = new Employee();
		
		do {
			System.out.println("Please Enter the Choice:");
			System.out.println("Enter 1 to Enter the values for Student");
			System.out.println("Enter 2 to display info of Student" );
			System.out.println("Enter 3 to enter the  info of employee" );
			System.out.println("Enter 4 to display info of employee" );
			
			System.out.println("Enter 0 to continue ...");
			System.out.println("Enter -1 to Exit ");		
			choice=sobj.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the FirstName:");
					p.setfirstName(sobj.next());
					System.out.println("Enter the Last Name:");
					p.setlastName(sobj.next());
					System.out.println("Enter the Age: ");
					p.setage(sobj.nextInt());
					System.out.println("Enter the User Name: ");
					s.setUsername(sobj.next());
					System.out.println("Enter the Email: ");
					s.setEmail(sobj.next());
					System.out.println("Enter the Student Id : ");
					s.setStudentID(sobj.nextInt());
					System.out.println("Enter the Password: ");
					s.setpassword(sobj.next());
					System.out.println("Enter the College Name: ");
					s.setCollege(sobj.next());
					System.out.println(" All The Values are entered... ");
					break;
					
				}
				case 2:
				{
					p.displayinfo();
					s.displayinfo();
					break;
				}
				case 3:
				{
					System.out.println("Enter the FirstName:");
					p.setfirstName(sobj.next());
					System.out.println("Enter the Last Name:");
					p.setlastName(sobj.next());
					System.out.println("Enter the Age: ");
					p.setage(sobj.nextInt());
					System.out.println("Enter the User Name: ");
					s.setUsername(sobj.next());
					System.out.println("Enter the Email: ");
					s.setEmail(sobj.next());
					System.out.println("Enter the employee Id : ");
					e.setemployeeid(sobj.nextInt());
					System.out.println("Enter the position: ");
					e.setposition(sobj.next());
					System.out.println("Enter the companyname: ");
					e.setcompanyname(sobj.next());
					System.out.println("Enter the salary: ");
					e.setsalary(sobj.nextInt());
					System.out.println(" All The Values are entered... ");
					break;
					
				}
				case 4:
				{
					e.displayallemp();
					s.displayinfo();
					break;
				}
				
				case 0:
				{
					System.out.println("Application Exit");
					break;
				}
			
			
			}
			
			
			
			
			
			
		}while(!(choice==0));
	}

}
		
		
		
		
		