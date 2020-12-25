package triviagame;
import java.io.IOException; 
import java.io.FileReader; 
import java.io.BufferedReader; 


public class Sports {
	private String path;    
	
	 public Sports(String file_path) 
	 {   path = file_path;  } 
	 int readLines() throws IOException{
		 int nbrOfLines = 0;
		 String aLine;
		 FileReader file_to_read = new FileReader(path);
		 BufferedReader bf = new BufferedReader(file_to_read);
		 do{
			 aLine = bf.readLine();
			 if(aLine != null) 
			   {nbrOfLines++;}
	     }while(aLine != null); 
		 //close the object
		 bf.close();
		 return nbrOfLines;
	 }
	 
	 public String[] OpenFile() throws IOException{
		 FileReader fr = new FileReader(path);
		 BufferedReader readText = new BufferedReader(fr);
		 // int nbrOfLines = 5;	 //hard coded value for the array size
		 int nbrOfLines = readLines();  //calling the method that will return       
		 //the number of file text lines to set the array size
		 String[] textData = new String[nbrOfLines];
		 int i;
		 for(i=0; i<nbrOfLines; i++) {
			 textData[i] = readText.readLine();  
			 }      
		 readText.close(); 
		 //closing the object
		 return textData; 
	 }
}
