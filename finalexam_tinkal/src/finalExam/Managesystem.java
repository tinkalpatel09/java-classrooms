//Tinkal Patel
package finalExam;
import java.io.IOException;
import java.lang.String;
import java.util.Scanner;

import PrepFE.ReadFile;
import PrepFE.WriteFile;


public class Managesystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //create Student,  Teacher, Course, grade	
		  Student objE = new Student();
		  Teacher objC = new Teacher();
		  Course objJ = new Course();
		  Grade objComp = new Grade();
		  
		  int [] arrstu = new int [2];
		  int [] arrTea = new int [2];
		  Course [] arrcourse = new Course [10];
		  
		  int i = 0, j = 0, h = 0;
		  
		  int choice = 0, option = 0;
		  Scanner input = new Scanner(System.in);
		  
		  //create the files into the project folder 		
		  String file_emp = "Teacher.txt"; //create file where the project is
		  String file_cust = "Student.txt"; 
		  String file_job = "Course.txt"; 
		  String file_comp = "Grades.txt"; 
		  
		  do {
		    	 System.out.println("Enter 1 to create objects (Student,  Teacher, Course, grade	)");
		    	 System.out.println("Enter 2 to display objects (Student,  Teacher, Course, grade	)");
		    	 System.out.println("Enter 0 to quit");
              choice = Integer.parseUnsignedInt(input.next());
              
          switch(choice) {
              case 1:{
        		  do {
        			 try{
        			  System.out.println("Enter 1 to create object Student and write to file");
        			  System.out.println("Enter 2 to create object Teacher and write to file");
        			  System.out.println("Enter 3 to create object Course and write to file");
        			  System.out.println("Enter 4 to create object grade and write to file");
        			  System.out.println("Enter 0 to quit");
                   option = Integer.parseUnsignedInt(input.next());

   	            if(option<0 || option>4) {throw new Exception();}
   	          }
   	         catch(Exception e){
   	    	   System.out.println("Enter 1,2,3,4 or 0 to quit, else is "+e.getMessage());   
   	         }	 
                   
                   switch(option) {
                   case 1:{	
                       boolean check = true;                  		
             		  Scanner inp = new Scanner(System.in);
             		  int id = 0;
             		  String fn, ln, gen;
             		  double sal = 0;
             		 do{ 	 
             	    	 try{
             	    	    System.out.print("Enter Student ID : \n");
             	            id = inp.nextInt();
             	            if(id<1) {throw new Exception();}
         		            else {objE.setStudeID(id);}
             	  
             	            check = false;
             	          }
             	         catch(Exception e){
             	    	   System.out.println("Enter Student ID (positive numerical value), else is "+e.getMessage());
          
             	    	   check = true;
             	         }	 
             	     }while(check);

             		 check = true;
             	      do{ 	 
             		    	 try{
               		    	    System.out.print("Enter First Name : \n");
             		            fn = inp.next();
             		     
             		            if(fn.length()<=1) {throw new Exception();}
             		            else {objE.setFName(fn);}
             		            check = false;
             		          }
             		         catch(Exception e){
             		    	   System.out.println("Enter first name (2 characters or more), else is "+e.getMessage());
             		    	 
             		    	   check = true;
             		         }	 
             		     }while(check);

              		 check = true;
         			 do{ 	 
         		    	 try{
         		    		 System.out.print("Enter Last Name : \n");
         		            ln = inp.next();
         		            if(ln.length()<=1) {throw new Exception();}
         		            else {objE.setLName(ln);}
         		            check = false;
         		          }
         		         catch(Exception e){
         		    	   System.out.println("Enter last name (2 characters or more), else is "+e.getMessage());
         		    	
         		    	   check = true;
         		         }	 
         		     }while(check);

              		 check = true;
         			 do{ 	 
         		    	 try{
         		    	    System.out.print("Enter the gender (f or m) : \n");
         		            gen = inp.next();
         		            if(gen.length()!=1) {throw new Exception();}
         		            else {objE.setGender(gen);}           		            
         		            //if(gen!="f\n" || gen!="F\n" || gen!="m\n" || gen!="M\n") {throw new Exception();}
         		            check = false;
         		          }
         		         catch(Exception e){
         		    	   System.out.println("Enter the gender (f or m) ");
         		    	  
         		    	   check = true;
         		         }	 
         		     }while(check);
         				
              		 check = true;
              		int grade = 0;
        				 do{ 	 
         			     try{
         			        System.out.print("Enter grade : \n");
         			        sal = Double.parseDouble(inp.next());
         			      
         			        if(sal<1) {throw new Exception();}
         		            else {objE.setgrade(grade);}           		            
         			            check = false;
         			        }
         			     catch(Exception e){
         			    	   System.out.println("Enter grade, else is "+e.getMessage());
         			   
         			    	   check = true;
         			         }	 
         			     }while(check);
         				 //inp.close();
         				 
          	         
                  } break;
              
                   case 2:{	
               		int id = 0;
               		String fn = "", ln = "", gen = "";
               		double bal = 0;
               		boolean check = true;
             		Scanner inp = new Scanner(System.in);
             		 do{ 	 
             	    	 try{
             	    	    System.out.print("Enter teacher ID : \n");
             	            id = inp.nextInt();
             	            if(id<1) {throw new Exception();}
             	            else {objC.setTeacherID(id);} 
             	            check = false;
             	          }
             	         catch(Exception e){
             	    	   System.out.println("Enter teacher ID (positive numerical value), else is "+e.getMessage());
             	    	   check = true;
             	         }	 
             	     }while(check);
             		
             		 check = true;
            	      do{ 	 
            		    	 try{
            		    	    System.out.print("Enter First Name : \n");
            		            fn = inp.next();
            		          
            		            if(fn.length()<=1) {throw new Exception();}
            		            else {objC.setFName(fn);}
            		            check = false;
            		          }
            		         catch(Exception e){
            		    	   System.out.println("Enter your first name (2 characters or more), else is "+e.getMessage());              		    	  
            		    	   check = true;
            		         }	 
            		     }while(check);

             		 check = true;
        			 do{ 	 
        		    	 try{
        		    		 System.out.print("Enter Last Name : \n");
        		            ln = inp.next();
        		            if(ln.length()<=1) {throw new Exception();}
        		            else {objC.setLName(ln);}
        		            check = false;
        		          }
        		         catch(Exception e){
        		    	   System.out.println("Enter your last name (2 characters or more), else is "+e.getMessage());         		    	  
        		    	   check = true;
        		         }	 
        		     }while(check);

             		 check = true;
        			 do{ 	 
        		    	 try{
        		    	    System.out.print("Enter the gender (f or m) : \n");
        		            gen = inp.next();
        		            if(gen.length()!=1) {throw new Exception();}
        		            else {objC.setGender(gen);}           		            
        		            check = false;
        		          }
        		         catch(Exception e){
        		    	   System.out.println("Enter the gender (f or m) ");
        		    	  
        		    	   check = true;
        		         }	 
        		     }while(check);
        				
             		
        				// inp.close(); //make infinite loop
             		 
          	          
                   
                 
       case 2:{	
    		  do {
    			  System.out.println("Enter 1 to display objects employe (read file)");
    			  System.out.println("Enter 2 to display objects customer (read file)");
    			  System.out.println("Enter 3 to display objects job (read file)");
    			  System.out.println("Enter 4 to display objects companie (read file)");
    			  System.out.println("Enter 0 to quit");
               option = input.nextInt();
               switch(option) {
                    case 1:{	              	 
                   	 String titre = "Employees";
                   	 System.out.println(titre);
                   	 try {    
             		        ReadFile file = new ReadFile(file_emp);
            		        String[] arrLines = file.OpenFile();
            		        int m;
            		        for(m=0; m < arrLines.length; m++) {
            		   	       System.out.println(arrLines[m]);    
            		        }   
            	          }   
            	         catch(IOException e) 
            	          {    
            		         System.out.println(e.getMessage());  
            	          }       	          
                    } break;
               
                    case 2:{	
                     	 String titre = "Customers";
                       	 System.out.println(titre);
                       	 try {    
                 		        ReadFile file = new ReadFile(file_cust);
                		        String[] arrLines = file.OpenFile();
                		        int m;
                		        for(m=0; m < arrLines.length; m++) {
                		   	       System.out.println(arrLines[m]);    
                		        }   
                	          }   
                	         catch(IOException e) 
                	          {    
                		         System.out.println(e.getMessage());  
                	          }       	          
                   } break;                
                    case 3:{	
                     	 String titre = "Jobs";
                       	 System.out.println(titre);
                       	 try {    
                 		        ReadFile file = new ReadFile(file_job);
                		        String[] arrLines = file.OpenFile();
                		        int m;
                		        for(m=0; m < arrLines.length; m++) {
                		   	       System.out.println(arrLines[m]);    
                		        }   
                	          }   
                	         catch(IOException e) 
                	          {    
                		         System.out.println(e.getMessage());  
                	          }       	          
                    } break;
                    case 4:{
                     	 String titre = "Company";
                       	 System.out.println(titre);
                       	 try {    
                 		        ReadFile file = new ReadFile(file_comp);
                		        String[] arrLines = file.OpenFile();
                		        int m;
                		        for(m=0; m < arrLines.length; m++) {
                		   	       System.out.println(arrLines[m]);    
                		        }   
                	          }   
                	         catch(IOException e) 
                	          {    
                		         System.out.println(e.getMessage());  
                	          }       	          
                    } break;
                    case 0:{
                  	  System.out.println("You decide to quit.");} break;
                    default : { // System.out.println("Enter 1, 2, 3 or 4 to display objects or 0 to quit.");
                 	   }
                    }//end switch
         		  }while(option != 0);
        	 
              } break;
              case 0:{System.out.println("You decide to quit.");} break;
              default : {
             	 System.out.println("Enter 1 to enter objects, 2 display objects or 0 to quit.");
              }
           }//end switch
		  }while(choice != 0);
       input.close();
		  
		  
	}

}
