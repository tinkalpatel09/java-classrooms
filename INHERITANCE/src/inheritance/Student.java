package inheritance;

public class Student extends Person{
	private String Username;
	private int StudentID;
	private String College;
	private String Email;
	private String Password;

	public Student()
	{
		
	}
	public void student(String Username,int StudentID, String College,String Email,String Password)
	{
		this.Username = Username;
		this.StudentID = StudentID;
		this.College = College;
		this.Email = Email;
		this.Password = Password;
		
	}

	public void setUsername(String name)
	{
		this.Username = name;
	}
	public void setStudentID(int id)
	{
		this.StudentID = id;
	}
	public void setCollege(String clg)
	{
		this.College = clg;
	}
	public void setEmail(String email)
	{
		this.Email = email;
	}
	public void setpassword(String pass)
	{
		this.Password = pass;
	}
	public String getUsername() {
		return this.Username;
	}
	public int getStudentID() {
		return this.StudentID;
	}
	public String getCollege() {
		return this.College;
	}
	public String getEmail() {
		return this.Email;
	}
	public String getpassword() {
		return this.Password;
	}
	public void displayinfo()
	{
		System.out.println("name "+this.Username +"\n");
		System.out.println("name "+this.StudentID +"\n");
		System.out.println("age "+this.Password +"\n" );
		System.out.println("sex "+this.Email +"\n");
		System.out.println("name "+this.College +"\n");
		
	}
	public void displayall()
	{
		System.out.println("name "+getfirstname() +"\n");
		System.out.println("name "+getlastname() +"\n");
		System.out.println("age "+getage() +"\n" );
		System.out.println("sex "+getsex()+"\n");
		
		System.out.println("name "+this.Username +"\n");
		System.out.println("name "+this.StudentID +"\n");
		System.out.println("age "+this.Password +"\n" );
		System.out.println("sex "+this.Email +"\n");
		System.out.println("name "+this.College +"\n");
		
	}
	
	
	
	
}
