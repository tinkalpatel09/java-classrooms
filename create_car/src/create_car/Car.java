package create_car;

public class Car {
	double startMiles; // Stating odometer reading
	double endMiles; // Ending odometer reading
	double gallons; //Gallons of gas used between the readings
	String model;
	String mark;
	String color;
	double weight;
	int doors;
	int seats;
	
	// constructor
	Car( double first, double last, double gals )
	{
	startMiles = first ;
	endMiles = last ;
	gallons = gals ;
	}
	Car(String model2,String mark2,String color2,double weight2,int doors2,int seats2)
	{
		model=model2;
		mark=mark2;
		color=color2;
		weight=weight2;
		doors=doors2;
		seats=seats2;
		
	}
	// methods
	double calculateMPG()
	{
	return (endMiles - startMiles)/gallons ;
	}
	void printDetails()
	{
		System.out.println("model of your car is:"+model);
		System.out.println("mark of your car is:"+mark);
		System.out.println("color of your car is:"+color);
		System.out.println("weight of your car is:"+weight+" kg");
		System.out.println("Your car has "+doors+" doors");
		System.out.println("Your car has "+seats+" seats");
	}

}
