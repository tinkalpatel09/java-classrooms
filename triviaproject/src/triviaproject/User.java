package triviaproject;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class User {

	private String username;
	private String password;
	
	public void setUsername(String uName) {
		this.username = uName;
	}
	public void setpassword(String pass) {
		this.password = pass;
	} 
	public String getUserName()
	{
		return this.username;
	}
	public String getPassword()
	{
		return this.password;
	}
	public boolean createFile(String path)
	{
		boolean check =true;
		File file= new File(path);
		try {
			if(file.createNewFile())
			{
				check = true;
			}
			else
			{
				check = false;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace(); 
		}
		
		
		
		return check;
	}
	public boolean Register(String UserName,String Password,String path)
	{
		try
		{
			FileWriter fWriter = new FileWriter(path,true);
//			fWriter.write("hi this is me");
//			fWriter.close();
			BufferedWriter bWriter =  new BufferedWriter(fWriter);
			bWriter.append(UserName.toString());
			bWriter.append(",".toString());
			bWriter.append(Password.toString());
			bWriter.newLine();
			bWriter.close();
			return true;
			
		}
		catch(Exception e)
		{
			 e.printStackTrace();
			
			 return false;
		}
		
	}
	
	public boolean checklogin(String UserName, String Password,String path)
	{
		String uName,pass,mainstring,usName="";
		String[] ArrayString ; 
		boolean check = true;
		try 
		{
			Scanner read = new Scanner (new File(path));
			
			while(read.hasNextLine())
			{
				mainstring= read.nextLine();
				ArrayString = mainstring.split(",");
				//System.out.println(Arrays.toString(ArrayString));
				uName = ArrayString[0];
				pass = ArrayString[1];
				//System.out.println(uName);
				//System.out.println(pass);
				read.nextLine();
				if(UserName.equals(uName) && Password.equals(pass))
				{
					check = true;
				}
				else
				{
					check = false;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return check;
		
	
	}
	
	
}	

