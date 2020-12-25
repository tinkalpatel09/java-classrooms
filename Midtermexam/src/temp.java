 import java.lang.String;
public class temp {
/* 
 * author : Tinkal Patel
 * 
 * */
	
	
	
	public float CtoF(float C)
	{
		float F;
		F=((C*9/5)+32);
		
		return F;
	}
	//method for converting from f to c
	public float FtoC(float F)
	{
		float C;
		C =((F - 32) * (5/9));
		
		return C;
	}
	public void displayinfo(float c, float f) {
		// TODO Auto-generated method stub
		
		System.out.print(c+" the Temperature "+  f);
		
	}
}
