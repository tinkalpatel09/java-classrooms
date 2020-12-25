package textfile;
import java.io.IOException;

public class Text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub




		String file_name = "test1.txt"; //create the file into project folder
		//String file_name = "../test2.txt"; //create the file into one higher level folder
		//String file_name = "C:/temp/test3.txt"; //create the file into C:/temp/ folder
		try {
		Writefile data = new Writefile( file_name , true );
		//append value now is true
		//WriteFile data = new WriteFile( file_name ); //or
		//WriteFile data = new WriteFile( file_name, false );
		//has or set the append value to false
		// so you can overwrite the entire content of the file
		data.WriteToFile( "This is another line of text" );
		data.WriteToFile( "\n\tThis is another line of text" );
		data.WriteToFile( "\n\tThis is smartest logic" );
		
		}
		catch(IOException e) {
		System.out.println(e.getMessage());
		}
		}
		
				
		
		
		
	}

