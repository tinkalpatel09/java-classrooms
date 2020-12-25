package finalExam;
//Tinkal Patel
public class Teacher extends Person {
	 private int teaID;
	 private double salary;
	 private String sub;
	 
	 void setTeacherID( int eID) {
			teaID = eID;
		 }
			 
		int getTeacherID() {
			   return teaID;
		 }  
		   
		void setSalary(double sal) {
			salary = sal;
		 }
			 
		double getSalary() {
			   return salary;
		 } 
		 void setSubjectname( String subject) {
				sub = subject;
			 }
				 
			String getSubjectname() {
				   return sub;
			 }  
		void printTeacherData() {
		 	System.out.println("First name : "+super.getFName()+"; last name : "+super.getLName()+"; gender : "+super.getGender());
		 	System.out.println("Teacher ID : "+teaID+"; Salary : "+salary+"; Subject : "+sub);
		 }
		
}
