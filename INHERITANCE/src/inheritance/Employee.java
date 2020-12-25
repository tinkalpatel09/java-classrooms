package inheritance;

public class Employee extends Person {
	
	
	private String username;
	private int employeeid;
	private String position;
	private String companyname;
	//private String name;
	private int salary;
	//private String emailaddress;
	//private String password;
	

	public Employee()
	{
		
	}
	public void Employee(String Username,int employeeid, int salary,String position,String companyname)
	{
		this.username = Username;
		this.employeeid = employeeid;
		this.position = position;
		this.companyname = companyname;
		//this.name = name;
		this.salary = salary;
		//this.emailaddress = email;
		//this.password = password;
		
	}
	public void setUsername(String name)
	{
		this.username = name;
	}
	public void setemployeeid(int id)
	{
		this.employeeid = employeeid;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public void setposition(String pos) {
		this.position = pos;
	}
	public void setcompanyname(String cname) {
		this.companyname = cname;
	}
	public String getUsername() {
		return this.username;
	}
	public int getemployeeid() {
		return this.employeeid;
	}
	public int getsalary() {
		return this.salary;
	}
	public String getposition() {
		return this.position;
	}
	public String getcompanyname() {
		return this.position;
	}
	public void displayinfoemployee()
	{
		System.out.println("name "+this.username +"\n");
		System.out.println("id "+this.employeeid +"\n");
		System.out.println("position "+this.position +"\n" );
		System.out.println("companyname "+this.companyname +"\n");
		System.out.println("salary "+this.salary +"\n");
		
	}
	public void displayallemp()
	{
		System.out.println("name "+getfirstname() +"\n");
		System.out.println("name "+getlastname() +"\n");
		System.out.println("age "+getage() +"\n" );
		System.out.println("sex "+getsex()+"\n");
		
		System.out.println("name "+this.username +"\n");
		System.out.println("id "+this.employeeid +"\n");
		System.out.println("position "+this.position +"\n" );
		System.out.println("companyname "+this.companyname +"\n");
		System.out.println("salary "+this.salary +"\n");
		
	}
	
}
