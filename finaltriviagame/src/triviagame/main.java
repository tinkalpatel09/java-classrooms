package triviagame;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.lang.String;


public class main {

	public static void main(String[] args)throws Exception 
	{
		  // pass the path to the file as a parameter 
		String[][] ques=new String[4][6];
	   // FileReader fr =  new FileReader("C:\\Users\\Tinkal\\eclipse-workspace\\finaltriviagame\\sports.txt"); 
	    String file_name = "C:\\Users\\Tinkal\\eclipse-workspace\\finaltriviagame\\sports.txt"; 
	    try {    
			Sports file = new Sports(file_name);
		String[] arrLines = file.OpenFile();
		int inc=0,increment=0;
		for(int i=0; i < arrLines.length; i++) {
			//System.out.println(arrLines.length);    
			if(increment==6) {increment=0;inc++;}
			ques[inc][increment]=arrLines[i];
			increment++;
			}   
		}   
		catch(IOException e) 
		{    
			System.out.println(e.getMessage());  
		}
	 /*   for(int i=0;i<ques.length;i++)
	    {
	    	for(int j=0;j<ques[i].length;j++)
	    	{
	    		System.out.println(ques[i][j]);
	    	}
	    }
		*/
	    boolean flag=true;
		System.out.println("Welcome to art quiz\n");
		//input.nextLine();
		int score = 0;
		
		Scanner input = new Scanner(System.in); 
			do {
				try {
					for(int i=0;i<4;i++)
		            {
		            	for(int j=0;j<(ques[i].length-1);j++)
		            	{
		            		System.out.println((ques[i][j]));
		            		
		                }
		            	String ans=input.next(); 
						//if(ans!="1" || ans!="2" || ans!="3" || ans!="4") {throw new Exception();}
						if(!ans.equals(ques[i][]))
						{
							System.out.println(" its Wrong Answer "+ans+",right Ans is: "+ques[i][5]+"\n");
							
						}
						else {
							System.out.println("its right Answer  "+ans+",right Ans is: "+ques[i][5]);
							score ++;
						}
						
					
						String[][] answers=new String[0][1];
						System.out.println("you got "+score + "/" + ques.length);
						
					}
					
					System.out.println("Done\n");
					input.nextLine();
				
					//showMenu(user);
					flag=false;
				}catch(Exception e) 
				{
					System.out.println(e);
					input.nextLine();
					flag=true;
				}
				
			}while(flag);

	    
		
	    
	    
	  } 
	
	
	

	
}

