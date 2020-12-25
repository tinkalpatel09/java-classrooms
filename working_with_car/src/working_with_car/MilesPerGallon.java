package working_with_car;

public class MilesPerGallon {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double startMiles, endMiles, gallons;
		System.out.print("Enter first reading: " );
		startMiles = scan.nextDouble();
		System.out.print("Enter second reading: " );
		endMiles = scan.nextDouble();
		System.out.print("Enter gallons: " );
		gallons = scan.nextDouble();	
		Car car = new Car( startMiles, endMiles, gallons );
		System.out.println( "Miles per gallon is " + car.calculateMPG() );
		Car details= new Car("BMW series 3","Tiger","Black",900,4,5);
		details.printDetails();
		
		//User Entered Details:
		System.out.println("Enter the model of your Car: ");
		String model=scan.next();
		System.out.println("Enter mark of your Car: ");
		String mark=scan.next();
		System.out.println("Enter color of your Car you want: ");
		String color=scan.next();
		System.out.println("Enter the weight of the Car: ");
		double weight=scan.nextDouble();
		System.out.println("Enter the number of doors you want of your Car: ");
		int doors=scan.nextInt();
		System.out.println("Enter the number of seats you want for your Car: ");
		int seats=scan.nextInt();
		
		Car userDetails=new Car(model,mark,color,weight,doors,seats);
		userDetails.printDetails();
		

}
