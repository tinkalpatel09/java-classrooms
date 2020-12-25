package projecttriviaarray;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;
import java.lang.String;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;




public class TriviaGame
{
  public static void main(String args[]) throws IOException
  {
	  
	  //Constructors
		    Scanner input = new Scanner(System.in);
		    Random randomizer = new Random();
		   
		 
		    
	
	  // initilize variables
		       int pointsPlayer1 = 0;   
			   int c=0;
			   int select=0;
			   String aa ="gamer";
			   String ans = null;
			   boolean loop = true;
			  
			  
				   ///// data for enter to admin and user
				 try {
						    System.out.println("1.please enter IDNUMBER if you are ADMIN, if you are USER enter one number for start the game");
						    //aa=input.next();
						    c=input.nextInt();
		             }
				 catch(Exception e)
					 {
					        	 System.out.println("1.try agayn");
							   
					 }   
			    //Enter to Menu for admin
				 
			     if (c == 123)// && c == 123)
					{
						                     // show tiltle game
										   System.out.println("**********************************************************");
										   System.out.println("\t\tWELCOME ADMIN TO GAME TRIVIA");
										     do {	    
										   System.out.println("********************select section************************");					
							
							
							
								// option to selection trivia	   	   
								   System.out.println("1.Modify information in topic Sport");
								   System.out.println("2.Modify information in Science");		   
								   System.out.println("3.Modify information in Art");		   
								   System.out.println("4.Modify information in Geography");
								   System.out.println("5.Modify information in History");
								   System.out.println("6.Exit");
								   
								   
								//Start loop   
								
							   //start switch case
								   int a = input.nextInt();
								   switch (a) {
									case 1:	
										
										 
                                           		  
											//start option 1	questions and answer	 
										    QuestionSport sp1 = new QuestionSport("in 1877,wich country's first ever home football international was played in the  Racecource ground?", "Colombia", "Brazil", "Wales", 3);
										    QuestionSport sp2 = new QuestionSport("What is  the diameter of the basketball hoop inches", "10", "18", "25", 2);
										    QuestionSport sp3 = new QuestionSport("Which nation does Novak Djokovic come from? ", "Belgium", "Polonia", "Serbia", 3);
										    QuestionSport sp4 = new QuestionSport("Which former NBA player had a starring role in the 1980 comedy movie \"Airplane!\"? ", "Dennis rodman", "Jordan", "Kareem Abdul-Jabbar", 3);
										    QuestionSport sp5 = new QuestionSport("Rafael Nadal's 10th title in the men's singles French Open Championship came in which year? ", "2017", "2016", "2015", 1);
										   
										 
								
										///array for save each selection
										    ArrayList<QuestionSport> questionList = new ArrayList<QuestionSport>();
										
										    questionList.add(sp1);
										    questionList.add(sp2);
										    questionList.add(sp3);
										    questionList.add(sp4);
										    questionList.add(sp5);
										    
										   System.out.println("select what do you do :\n1- Insert New Question. \n2 - Delete Question." + "\n ");
										    int b = input.nextInt();
										    System.out.println("This is where you should expect user input\n");
											 if (b==1) {
												 System.out.println("here,is " + b + "\n");
												   //read new input string into newQ
												 String newQ = input.next();
								                    sp1.setQuestion(newQ);
								                    questionList.set(1,sp1);
										            System.out.println ("new question:" + questionList);
										        } else if (b==2) {
										        	System.out.println("Here, a is " + b + "\n");
										        	  questionList.remove(1);
										        	  boolean loop2 = false;
										        	do {
										               // System.out.println("Current Question is " + questionList);
										                System.out.println("Add more? (y/n) ");
										                if (input.next().startsWith("y")) {
										                    System.out.println("Enter : ");
										                    //read new input string into newQ
										                    //String newQ = input.next();
										                    //sp1.setQuestion(newQ);
										                    //questionList.set(1,sp1);   
										                } else {
										                    break;
										                }
										            } while (loop2 = true);

										          }
											    
											
										
										    System.out.println("****Player1****");
										//get information for show
										    for(int i = 0; i < 5; i++)
										    {
										    	
										    	
										    	QuestionSport sp = questionList.get(i);
										
										      System.out.println("\n" + (i+1) + ". " + sp.getQuestion());
										      System.out.println("1) " + sp.getAns1());
										      System.out.println("2) " + sp.getAns2());
										      System.out.println("3) " + sp.getAns3());
										      
										      
										
										      System.out.print("Enter your answer: ");
										      int userAns = input.nextInt();
										
										      if (userAns == sp.getCorrectAnsSportNum())
										        pointsPlayer1++;		   
										    
							    }break;
							   
													   
									case 2:
											
											//start option2questions and answer
											 QuestionScience s1 = new QuestionScience("What number comes next: 1, 11, 21, 1211, 111221, ...? ", "1111212", "21212121", "312211", 3);
											 QuestionScience s2 = new QuestionScience("What is a meteor called when it reaches Earth's surface? ", "Asteroid", "Meteorite", "Diamant", 2);
											 QuestionScience s3 = new QuestionScience("What percentage of a pandas diet is bamboo?  ", " 98%", "88%", "99%", 3);
											 QuestionScience s4 = new QuestionScience("Which US city has been hit by the most tornadoes? ", "Oklahoma City", "Boston", "Springfield", 1);
											 QuestionScience s5 = new QuestionScience("At what wind speed does a Tropical storm turn into a Hurricane?", "74 MPH", "21MPH", "190MPH", 1);
											
										 
											///array for save each selection
										    ArrayList<QuestionScience> questionList1 = new ArrayList<QuestionScience>();
							
										    questionList1.add(s1);
										    questionList1.add(s2);
										    questionList1.add(s3);
										    questionList1.add(s4);
										    questionList1.add(s5);
										   
										 
							
										    System.out.println("****Player1****");
							
										    
										  //get information for show
										    for(int i = 0; i < 5; i++)
										    {
										    	QuestionScience s = questionList1.get(i);
							
										      System.out.println("\n" + (i+1) + ". " + s.getQuestion());
										      System.out.println("1) " + s.getAns1());
										      System.out.println("2) " + s.getAns2());
										      System.out.println("3) " + s.getAns3());
										      
							
										      System.out.print("Enter your answer: ");
										      int userAns = input.nextInt();
							
										      if (userAns == s.getCorrectAnsScienceNum())
										        pointsPlayer1++;
										    }
										break;
									case 3:
										
											//start option 3questions and answer
											 QuestionArt a1 = new QuestionArt("Who painted The Persistence of Memory?", "Rembrandt", "Picasso", "Salvador Dali.", 3);
											 QuestionArt a2 = new QuestionArt("Which 17th century artist painted more than 60 self-portraits?", "Rembrandt", "Picasso", "Salvador Dali.", 1);
											 QuestionArt a3 = new QuestionArt("Who painted The anatomy lesson of Dr Tulp?", "Rembrandt", "Picasso", "Salvador Dali.", 4);
											 QuestionArt a4 = new QuestionArt("What nationality was Picasso?", "Spanish", "Portugues", "Italian", 1);
											 QuestionArt a5 = new QuestionArt("Which famous painter and sculptor was also an architect and engineer to Cesare Borgia?", "Leonardo de Vinci.", "Salvador Dali", "Picasso", 1);
											
											///array for save each selection
										    ArrayList<QuestionArt> questionList2 = new ArrayList<QuestionArt>();
							
										    questionList2.add(a1);
										    questionList2.add(a2);
										    questionList2.add(a3);
										    questionList2.add(a4);
										    questionList2.add(a5);
										 
										
							
										    System.out.println("****Player1****");
							
										    for(int i = 0; i < 5; i++)
										    {
										    	QuestionArt ar = questionList2.get(i);
							
										      System.out.println("\n" + (i+1) + ". " + ar.getQuestionArt());
										      System.out.println("1) " + ar.getAns1());
										      System.out.println("2) " + ar.getAns2());
										      System.out.println("3) " + ar.getAns3());
										      
							
										      System.out.print("Enter your answer: ");
										      int userAns = input.nextInt();
							
										      if (userAns == ar.getCorrectAnsNum())
										        pointsPlayer1++;
										    }
										break;
									case 4:
										//start option 4questions and answer
											 QuestionGeography g1 = new QuestionGeography("What is the main dialect of Chinese spoken in Hong Kong by the majority of the locals? ", "Cantonese", "Chinesse", "Jponese", 1);
											 QuestionGeography g2 = new QuestionGeography("The Black Forest is located in what European country? ", "Germany", "Italy", "Egypth", 1);
											 QuestionGeography g3 = new QuestionGeography("Which U.S. state has the longest coastline? ", "Florida", "Canada", "Alaska", 4);
											 QuestionGeography g4 = new QuestionGeography("Which Spanish festival is featured in Ernest Hemingway's The Sun Also Rises? ", "San Justin ", "San Fermin", "San Pedro",2 );
											 QuestionGeography g5 = new QuestionGeography("What is the largest island in the Caribbean Sea? ", "Cuba", "Jamaica", "Puert Rico", 1);
										
											///array for save each selection
										    ArrayList<QuestionGeography> questionList3 = new ArrayList<QuestionGeography>();
							
										    questionList3.add(g1);
										    questionList3.add(g2);
										    questionList3.add(g3);
										    questionList3.add(g4);
										    questionList3.add(g5);
										    
										  
										    
										    System.out.println("****Player1****");
										  //get information for show
										    for(int i = 0; i < 5; i++)
										    {
										    	QuestionGeography g = questionList3.get(i);
							
										      System.out.println("\n" + (i+1) + ". " + g.getQuestionGeography());
										      System.out.println("1) " + g.getAns1());
										      System.out.println("2) " + g.getAns2());
										      System.out.println("3) " + g.getAns3());
										      
							
										      System.out.print("Enter your answer: ");
										      int userAns = input.nextInt();
							
										      if (userAns == g.getCorrectAnsNum())
										        pointsPlayer1++;
										    }
										break;
									case 5:
										
											//start option 5 questions and answer
											 QuestionHistory h1 = new QuestionHistory("What shark is thought to have been the largest in Earth's history? ", "white", "hammer", "Megalodon", 3);
											 QuestionHistory h2 = new QuestionHistory("Historically, parts from which animal were used to stiffen corsets? ", "Dolphin", "Seal", "Whale", 3);
											 QuestionHistory h3 = new QuestionHistory("How many stars does the American Flag have?", "32", "50", "24", 2);
											 QuestionHistory h4 = new QuestionHistory("On what date was the Declaration of Independence signed? in USA", "04/04/76", "04/04/75", "04/04/74", 1);
											 QuestionHistory h5 = new QuestionHistory("On what year did the Ford Model T enter production?", "1918", "1921", "1908", 3);
											 
											///array for save each selection
										    ArrayList<QuestionHistory> questionList4 = new ArrayList<QuestionHistory>();
							
										    questionList4.add(h1);
										    questionList4.add(h2);
										    questionList4.add(h3);
										    questionList4.add(h4);
										    questionList4.add(h5);
										   
							
										    System.out.println("****Player1****");
										  //get information for show
										    for(int i = 0; i < 5; i++)
										    {
										    	QuestionHistory h = questionList4.get(i);
							
										      System.out.println("\n" + (i+1) + ". " + h.getQuestionHistory());
										      System.out.println("1) " + h.getAns1());
										      System.out.println("2) " + h.getAns2());
										      System.out.println("3) " + h.getAns3());
										      
							
										      System.out.print("Enter your answer: ");
										      int userAns = input.nextInt();
							
										      if (userAns == h.getCorrectAnsNum())
										        pointsPlayer1++;
										    }
										break;
									case 6:
										      System.out.println("Good bye!!!!!!!");
								              System.exit(0);
										break;
									
									default:
									          System.out.println("Invalid selection");
									    break;
															   
							               }
					
			                                 //show the points
								              System.out.println("\n****Points Earned****");
											  System.out.println("Player 1: " + pointsPlayer1);//points to player 
											  
										
											 //  String ans = null;
											   //   do
											   //   {
											           System.out.println( " System.out.println(\"PRESS ANY KEY TO SELECT AN OTHER OPTION TO MENU \");");
											           
											             ans = input.next();
											      }
											      while(loop=true);  
							//	}while	(loop == true);
					 //end game
  }
			     else {
                     // show title game
				   System.out.println("**********************************************************");
				   System.out.println("\t\tWELCOME "+ c +" TO GAME TRIVIA");
				   System.out.println("**********************************************************");
				   System.out.println("**********************************************************");
do {	    
				   System.out.println("********************select section************************");					
	
	
	
		// option to selection trivia	   	   
		   System.out.println("1.Sport");
		   System.out.println("2.Science");		   
		   System.out.println("3.Art");		   
		   System.out.println("4.Geography");
		   System.out.println("5.History");
		   System.out.println("6.Exit");
		   
		//Start loop   
		
	   //start switch case
		   int a = input.nextInt();
		   switch (a) {
			case 1:	
					//start option 1	questions and answer	 
				    QuestionSport sp1 = new QuestionSport("in 1877,wich country's first ever home football international was played in the  Racecource ground?", "Colombia", "Brazil", "Wales", 3);
				    QuestionSport sp2 = new QuestionSport("What is  the diameter of the basketball hoop inches", "10", "18", "25", 2);
				    QuestionSport sp3 = new QuestionSport("Which nation does Novak Djokovic come from? ", "Belgium", "Polonia", "Serbia", 3);
				    QuestionSport sp4 = new QuestionSport("Which former NBA player had a starring role in the 1980 comedy movie \"Airplane!\"? ", "Dennis rodman", "Jordan", "Kareem Abdul-Jabbar", 3);
				    QuestionSport sp5 = new QuestionSport("Rafael Nadal's 10th title in the men's singles French Open Championship came in which year? ", "2017", "2016", "2015", 1);
				   
				
		
				///array for save each selection
				    ArrayList<QuestionSport> questionList = new ArrayList<QuestionSport>();
				
				    questionList.add(sp1);
				    questionList.add(sp2);
				    questionList.add(sp3);
				    questionList.add(sp4);
				    questionList.add(sp5);
				    
				    
				
				    System.out.println("****Player1****");
				//get information for show
				    for(int i = 0; i < 5; i++)
				    {
				    	QuestionSport sp = questionList.get(i);
				
				      System.out.println("\n" + (i+1) + ". " + sp.getQuestion());
				      System.out.println("1) " + sp.getAns1());
				      System.out.println("2) " + sp.getAns2());
				      System.out.println("3) " + sp.getAns3());
				      
				
				      System.out.print("Enter your answer: ");
				      int userAns = input.nextInt();
				
				      if (userAns == sp.getCorrectAnsSportNum())
				        pointsPlayer1++;
				     
				      
				    
	    }break;
	   
	    //System.out.println(");
	    //System.exit();
        
	   
			case 2:
					
					//start option2questions and answer
					 QuestionScience s1 = new QuestionScience("What number comes next: 1, 11, 21, 1211, 111221, ...? ", "1111212", "21212121", "312211", 3);
					 QuestionScience s2 = new QuestionScience("What is a meteor called when it reaches Earth's surface? ", "Asteroid", "Meteorite", "Diamant", 2);
					 QuestionScience s3 = new QuestionScience("What percentage of a pandas diet is bamboo?  ", " 98%", "88%", "99%", 3);
					 QuestionScience s4 = new QuestionScience("Which US city has been hit by the most tornadoes? ", "Oklahoma City", "Boston", "Springfield", 1);
					 QuestionScience s5 = new QuestionScience("At what wind speed does a Tropical storm turn into a Hurricane?", "74 MPH", "21MPH", "190MPH", 1);
					
				 
					///array for save each selection
				    ArrayList<QuestionScience> questionList1 = new ArrayList<QuestionScience>();
	
				    questionList1.add(s1);
				    questionList1.add(s2);
				    questionList1.add(s3);
				    questionList1.add(s4);
				    questionList1.add(s5);
				   
				    
	
				    System.out.println("****Player1****");
	
				    
				  //get information for show
				    for(int i = 0; i < 5; i++)
				    {
				    	QuestionScience s = questionList1.get(i);
	
				      System.out.println("\n" + (i+1) + ". " + s.getQuestion());
				      System.out.println("1) " + s.getAns1());
				      System.out.println("2) " + s.getAns2());
				      System.out.println("3) " + s.getAns3());
				      
	
				      System.out.print("Enter your answer: ");
				      int userAns = input.nextInt();
	
				      if (userAns == s.getCorrectAnsScienceNum())
				        pointsPlayer1++;
				    }
				break;
			case 3:
				
					//start option 3questions and answer
					 QuestionArt a1 = new QuestionArt("Who painted The Persistence of Memory?", "Rembrandt", "Picasso", "Salvador Dali.", 3);
					 QuestionArt a2 = new QuestionArt("Which 17th century artist painted more than 60 self-portraits?", "Rembrandt", "Picasso", "Salvador Dali.", 1);
					 QuestionArt a3 = new QuestionArt("Who painted The anatomy lesson of Dr Tulp?", "Rembrandt", "Picasso", "Salvador Dali.", 4);
					 QuestionArt a4 = new QuestionArt("What nationality was Picasso?", "Spanish", "Portugues", "Italian", 1);
					 QuestionArt a5 = new QuestionArt("Which famous painter and sculptor was also an architect and engineer to Cesare Borgia?", "Leonardo de Vinci.", "Salvador Dali", "Picasso", 1);
					
					///array for save each selection
				    ArrayList<QuestionArt> questionList2 = new ArrayList<QuestionArt>();
	
				    questionList2.add(a1);
				    questionList2.add(a2);
				    questionList2.add(a3);
				    questionList2.add(a4);
				    questionList2.add(a5);
				 
				    
	
				    System.out.println("****Player1****");
	
				    for(int i = 0; i < 5; i++)
				    {
				    	QuestionArt ar = questionList2.get(i);
	
				      System.out.println("\n" + (i+1) + ". " + ar.getQuestionArt());
				      System.out.println("1) " + ar.getAns1());
				      System.out.println("2) " + ar.getAns2());
				      System.out.println("3) " + ar.getAns3());
				      
	
				      System.out.print("Enter your answer: ");
				      int userAns = input.nextInt();
	
				      if (userAns == ar.getCorrectAnsNum())
				        pointsPlayer1++;
				    }
				break;
			case 4:
				//start option 4questions and answer
					 QuestionGeography g1 = new QuestionGeography("What is the main dialect of Chinese spoken in Hong Kong by the majority of the locals? ", "Cantonese", "Chinesse", "Jponese", 1);
					 QuestionGeography g2 = new QuestionGeography("The Black Forest is located in what European country? ", "Germany", "Italy", "Egypth", 1);
					 QuestionGeography g3 = new QuestionGeography("Which U.S. state has the longest coastline? ", "Florida", "Canada", "Alaska", 4);
					 QuestionGeography g4 = new QuestionGeography("Which Spanish festival is featured in Ernest Hemingway's The Sun Also Rises? ", "San Justin ", "San Fermin", "San Pedro",2 );
					 QuestionGeography g5 = new QuestionGeography("What is the largest island in the Caribbean Sea? ", "Cuba", "Jamaica", "Puert Rico", 1);
				
					///array for save each selection
				    ArrayList<QuestionGeography> questionList3 = new ArrayList<QuestionGeography>();
	
				    questionList3.add(g1);
				    questionList3.add(g2);
				    questionList3.add(g3);
				    questionList3.add(g4);
				    questionList3.add(g5);
				    
				    System.out.println("****Player1****");
				  //get information for show
				    for(int i = 0; i < 5; i++)
				    {
				    	QuestionGeography g = questionList3.get(i);
	
				      System.out.println("\n" + (i+1) + ". " + g.getQuestionGeography());
				      System.out.println("1) " + g.getAns1());
				      System.out.println("2) " + g.getAns2());
				      System.out.println("3) " + g.getAns3());
				      
	
				      System.out.print("Enter your answer: ");
				      int userAns = input.nextInt();
	
				      if (userAns == g.getCorrectAnsNum())
				        pointsPlayer1++;
				    }
				break;
			case 5:
				
					//start option 5 questions and answer
					 QuestionHistory h1 = new QuestionHistory("What shark is thought to have been the largest in Earth's history? ", "white", "hammer", "Megalodon", 3);
					 QuestionHistory h2 = new QuestionHistory("Historically, parts from which animal were used to stiffen corsets? ", "Dolphin", "Seal", "Whale", 3);
					 QuestionHistory h3 = new QuestionHistory("How many stars does the American Flag have?", "32", "50", "24", 2);
					 QuestionHistory h4 = new QuestionHistory("On what date was the Declaration of Independence signed? in USA", "04/04/76", "04/04/75", "04/04/74", 1);
					 QuestionHistory h5 = new QuestionHistory("On what year did the Ford Model T enter production?", "1918", "1921", "1908", 3);
					 
					///array for save each selection
				    ArrayList<QuestionHistory> questionList4 = new ArrayList<QuestionHistory>();
	
				    questionList4.add(h1);
				    questionList4.add(h2);
				    questionList4.add(h3);
				    questionList4.add(h4);
				    questionList4.add(h5);
				   
				    
	
				    System.out.println("****Player1****");
				  //get information for show
				    for(int i = 0; i < 5; i++)
				    {
				    	QuestionHistory h = questionList4.get(i);
	
				      System.out.println("\n" + (i+1) + ". " + h.getQuestionHistory());
				      System.out.println("1) " + h.getAns1());
				      System.out.println("2) " + h.getAns2());
				      System.out.println("3) " + h.getAns3());
				      
	
				      System.out.print("Enter your answer: ");
				      int userAns = input.nextInt();
	
				      if (userAns == h.getCorrectAnsNum())
				        pointsPlayer1++;
				    }
				break;
			case 6:
				      System.out.println("Good bye!!!!!!!");
		              System.exit(0);
				break;
			
			default:
			          System.out.println("Invalid selection");
			    break;
									   
	               }

                     //show the points
		              System.out.println("\n****Points Earned****");
					  System.out.println("Player 1: " + pointsPlayer1);//points to player 
					  
					
					  String filetowrite = "C:/Users/Desktop/test.txt"; //  location file
					  FileWriter fw = new FileWriter(Integer.toString(pointsPlayer1));
					  fw.write("Hello, This is the points to player 1");
					  
					  System.out.println(pointsPlayer1);
					  
					  fw.close();
					
					           System.out.println("PRESS ANY KEY TO RETURN TO MENU AND CHOICE AN OTHER OPTION ");
					           
					             ans = input.next();
					             
					             //System.out.ptintln(""+ sp.getCorrectAnsNum()+"");
					             
					             
					      }

                            
					      while(loop=true);  
	
//end game
    }
  } 
}



