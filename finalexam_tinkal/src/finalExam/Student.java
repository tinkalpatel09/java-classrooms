package finalExam;
//Tinkal Patel
public class Student extends Person {
	 private int studentID,grades;
	 private String name;
	 
void setStudeID(int id) {
	studentID = id;
 }
	 
int getStudeID() {
	   return studentID;
 }  

void setStudentname(Student Name) {
	name = name;
}
	 
String getStudentname() {
	   return name;
 } 
void setgrade(int grade) {
	grade = grade;
}
int getgrade() {
	return grades;
}
	
void printStudData() {
System.out.println("First name : "+super.getFName()+"; last name : "+super.getLName()+"; gender : "+super.getGender());
System.out.println("Student ID : "+studentID+"; name : "+name+"; grade : "+grades );
}

}
