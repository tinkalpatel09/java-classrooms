package textfile;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Writefile {
	
	private String path;
	private boolean append_to_file = false;
	
	public Writefile(String file_path) {
		path = file_path;
	}
	
	public Writefile(String file_path, boolean append_value) {
		path = file_path;
		append_to_file = append_value;
	}
	
	//public method to write text file
	
	public void WriteToFile(String textLine) throws IOException{
		//create a text file object
		FileWriter objwrite = new FileWriter(path, append_to_file);
		
		//create the object to be printed
		
		PrintWriter print_line = new PrintWriter(objwrite);
		print_line.printf("%s"+"%n", textLine);
		print_line.close();
	}
}