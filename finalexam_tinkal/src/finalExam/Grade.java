package finalExam;
//Tinkal Patel
public class Grade {
//	  int marks[] = new int[6];
//      int i;
//      float total=0, avg;

	   private int numGrade;

	   public Grade(int grade) {
	        numGrade = grade;
	   }

	   public int getGrade() {
	       return numGrade;
	   }

	   public void setGrade(int grade) {
	        numGrade = grade;
	   }

	   public String getLetterGrade() {
	       if(numGrade <0 || numGrade > 100) throw new IllegalArgumentException("No such a grade!");

	       else if(numGrade>=90) return "A";

	       else if (numGrade >= 80) return "B";

	       else if(numGrade >= 70) return "C";

	       else if(numGrade >= 60) return "D";

	       else return "F";

	   }

	   public String toString(){
	        return numGrade + " is a " + getLetterGrade() + "\n";
	   } 
}
