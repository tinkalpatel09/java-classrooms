import java.util.Scanner;
	public class MidtermPractice {
	
	
	
	
	Scanner scan = new Scanner(System.in);
	class Course{
	String name, code, group;
	int numOfStudents, hours, year;
	void setStudentDetails() {
	System.out.println("Enter the Name:");
	name = scan.nextLine();
	System.out.println("Enter the Code:");
	code = scan.next();
	System.out.println("Enter the Group:");
	group = scan.next();
	do{
	System.out.println("Enter the number of students in the class (10 – 27):");
	numOfStudents = scan.nextInt();
	while(numOfStudnts < 10 || numOfStudnts > 27);
	System.out.println("Enter the number of hours per week:");
	hours = scan.nextInt();
	System.out.println("Enter the current year:");
	year = scan.nextInt();
	}



