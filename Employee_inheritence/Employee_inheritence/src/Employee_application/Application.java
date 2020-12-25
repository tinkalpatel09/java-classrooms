package Employee_application;

import java.util.ArrayList;
import java.util.Scanner;


public class Application {
	public static int sizeOf(ArrayList<Employee> emp) {
		int count = 0;
		for (Employee x : emp) {
			if (x != null) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		short option = 0;
		ArrayList<Employee> emp = new ArrayList<Employee>();
		Employee EntEmp = null;
		do {
			Employee empp = new Employee();
			System.out.println("EMPLOYEE MANAGER");
			System.out.println("1.Enter a new Employee.");
			System.out.println("2.Display the Employee entered.");
			System.out.println("3.Display all Employees.");
			System.out.println("4.Quit");
			System.out.println("-------------------------------");
			System.out.print("Select your option: ");
			option = input.nextShort();
			switch (option) {
			case 1: {
				empp.EnterEmployee(empp);
				emp.add(empp);
				EntEmp = empp;
				break;
			}
			case 2: {
				empp.DisplayEmployee(EntEmp);
				break;
			}
			case 3: {
				emp.forEach((n) -> empp.DisplayEmployee(n));
				break;
			}
			case 4: {
				System.out.print("Program is shut down.");
				System.exit(0);
				break;
			}
			}
		} while (true);

	}
}
