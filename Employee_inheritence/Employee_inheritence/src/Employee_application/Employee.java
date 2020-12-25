package Employee_application;
import java.util.Scanner;


public class Employee extends Person {
	Scanner input = new Scanner(System.in);
	private String username;
	private String employee_id;
	private String position;
	private String company_name;
	private String salary;
	private String email;
	private String password;
	boolean trial = false;

	public Employee() {
		username = "roop96";
		employee_id = "0000";
		position = "Clerk";
		this.setFirstname("firstname");
		this.setLastname("lastname");
		company_name = "ComputerTech";
		this.setAge("23");
		this.setGender("M");
		salary = "100000";
		email = "default@gmail.com";
		password = "xyz123";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void EnterEmployee(Employee x) {
		input.useDelimiter("\n");
		System.out.print("Enter EmployeeID(4 digits): ");
		x.setEmployee_id(input.next());
		System.out.print("Enter username: ");
		x.setUsername(input.next());
		System.out.print("Enter password: ");
		x.setPassword(input.next());
		System.out.print("Enter First Name: ");
		x.setFirstname(input.next());
		System.out.print("Enter Last Name: ");
		x.setLastname(input.next());
		System.out.print("Enter Age(2 digit number): ");
		x.setAge(input.next());
		System.out.print("Enter Gender(M/F): ");
		x.setGender(input.next());
		System.out.print("Enter Company Name: ");
		x.setCompany_name(input.next());
		System.out.print("Enter Position: ");
		x.setPosition(input.next());
		System.out.print("Enter Salary: ");
		x.setSalary(input.next());
	}

	public void DisplayEmployee(Employee x) {
		System.out.print("Employee ID: " + x.getEmployee_id());
		System.out.print("Username: " + x.getUsername());
		System.out.print("Password: " + x.getPassword());
		System.out.print("First Name: " + x.getFirstname());
		System.out.print("Last Name: " + x.getLastname());
		System.out.print("Age: " + x.getAge());
		System.out.print("Gender: " + x.getGender());
		System.out.print("Company: " + x.getCompany_name());
		System.out.print("Position: " + x.getPosition());
		System.out.print("Salary: " + x.getSalary());
		System.out.println("---------------------------------");
	}
}
