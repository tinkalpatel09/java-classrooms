package projecttriviaarray;

public class QuestionScience {
	String question;
	  String possibleAns1;
	  String possibleAns2;
	  String possibleAns3;
	
	  int CorrectAnsScienceNum;

	  QuestionScience(String ques, String ans1, String ans2, String ans3, int num)
	  {
	    question = ques;
	    possibleAns1 = ans1;
	    possibleAns2 = ans2;
	    possibleAns3 = ans3;
	    
	    CorrectAnsScienceNum = num;
	  }

	  QuestionScience(){
	  }

	  String getQuestion(){
	    return question;
	  }

	  String getAns1(){
	    return possibleAns1;
	  }

	  String getAns2(){
	    return possibleAns2;
	  }

	  String getAns3(){
	    return possibleAns3;
	  }
	  
	  void setQuestion(String newQuestion){
	    question = newQuestion;
	  }

	  void setAns1(String newPossibleAns1){
	    possibleAns1 = newPossibleAns1;
	  }

	  void setAns2(String newPossibleAns2){
	    possibleAns2 = newPossibleAns2;
	  }

	  void setAns3(String newPossibleAns3){
	    possibleAns3 = newPossibleAns3;
	  }

	  void setCorrectAnsScienceNum(int newCorrectAnsScienceNum){
	    CorrectAnsScienceNum = newCorrectAnsScienceNum;
	  }

	public int getCorrectAnsScienceNum() {
		// TODO Auto-generated method stub
		return CorrectAnsScienceNum;
	}

}
