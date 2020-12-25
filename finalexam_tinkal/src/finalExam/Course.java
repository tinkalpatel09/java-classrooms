package finalExam;

//Tinkal Patel
public class Course {
	 private int courseID;
	 private String Coursename;

	 
	 void setcourseID( int cID) {
		courseID = cID;
		 }
			 
		int getTeacherID() {
			   return courseID;
		 }  
		
		 void setcoursename( String cname) {
			 Coursename = cname;
				 }
					 
				String getcoursename() {
					   return Coursename;
				 }  
				
				void printCourseData() {


				 	System.out.println("Course Id : "+courseID+"; Course name : "+Coursename);
				 }
}
