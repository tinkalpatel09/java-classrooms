import java.util.Scanner;
public class firstquetion {
	
	
	
	

	public static void main(String[] args) {
	String fname;
	int a,b,c,d,e,f,l=0;
	float avg;

	do {
	System.out.println("Enter Your First Name: ");
	Scanner sc = new Scanner(System.in);
	fname = sc.nextLine();
	System.out.println("Enter the number 1 : ");
	a = sc.nextInt();
	System.out.println("Enter the number 2 : ");
	b = sc.nextInt();
	System.out.println("Enter the number 3 : ");
	c = sc.nextInt();
	System.out.println("Enter the number 4 : ");
	d = sc.nextInt();
	System.out.println("Enter the number 5 : ");
	e = sc.nextInt();
	System.out.println("Enter the number 6 : ");
	f = sc.nextInt();
	avg = (a+b+c+d+e+f)/6;

	if (a > b && a > c && a > d && a > e && a > f)
	System.out.println( "\n The bigger number " + fname + " entered is : " + a + " and the average is : " + avg);
	if (b > a && b > c && b > d && b > e && b > f)
	System.out.println("\n The bigger number " + fname + " entered is : " + b + " and the average is : " + avg);
	if (c > b && c > b && c > d && c > e && c > f)
	System.out.println( "\n The bigger number " + fname + " entered is : " + c + " and the average is : " + avg);
	if (d > b && d > c && d > a && d > e && d > f)
	System.out.println("\n The bigger number " + fname + " entered is : " + d + " and the average is : " + avg);
	if (e > b && e > c && e > d && e > a && e > f)
	System.out.println( "\n The bigger number " + fname + " entered is : " + e + " and the average is : " + avg);
	if (f > b && f > c && f > d && f > e && f > a)
	System.out.println("\n The bigger number " + fname + " entered is : " + f + " and the average is : " + avg );

	System.out.println("\n \n Do you want to continue ? \n Press 1 for yes \t Press 0 for no");
	l = sc.nextInt();
	}
	while(l == 1);
	}
	}
	
	
	
	
	

