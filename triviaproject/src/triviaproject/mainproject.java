package triviaproject;

import java.util.Scanner;


public class mainproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 0;
		Scanner sobj = new Scanner(System.in);	
		User u =new User();
		
		String st = "C:\\Users\\Tinkal\\eclipse-workspace\\triviaproject\\reg.txt";
		u.createFile(st);
		
		do {
			System.out.println("Please Enter the Choice:");
			System.out.println("Enter 1 to login ");
			System.out.println("Enter 2  to register" );
			System.out.println("Enter 3  for quiz"	+ "" );
			
			choice=sobj.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the UserName :");
					String uName = sobj.next();
					
					System.out.println("Enter the password :");
					String pass = sobj.next();
					
					System.out.println(u.checklogin(uName, pass, st));
					break;
				
				}
				case 2:
				{
					System.out.println("Enter the UserName :");
					String uName = sobj.next();
					
					System.out.println("Enter the password :");
					String pass = sobj.next();
					
					u.Register(uName, pass, st);
					
					break;
					
				}
				case 3:
				{
					System.out.println("lets start quiz");
					String q1 = "What colors are apples?\n"
							+ "(a)red/green\n(b)orange\n(c)Magenta\n";

					String q2 = "what colors are bananas?\n"
							+ "(a)yellow\n(b)red\n(c)black\n";
					
					Question [] que = {
							new Question(q1,"a"),
							new Question(q2,"a")
					};
					takeTest(que);
					
				}
			}
			
			
		}while(!(choice==0));
		
	}


public static  void takeTest(Question [] que) {
	int score = 0;
	Scanner keys = new Scanner(System.in); 
	for(int i = 0;i<que.length;i++) {
		System.out.println(que[i].prompt);
		String answer = keys.nextLine();
		if(answer.equals(que[i].answer)) {
			score ++;
		}
	}
	System.out.println("you got "+score + "/" + que.length);
}
}
