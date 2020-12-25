package working_with_car;

public class createcar {

	// instance variables
	 double startMiles; // Stating odometer reading
	 double endMiles; // Ending odometer reading
	 double gallons; //Gallons of gas used between the readings
	 // constructor
	 Car( double first, double last, double gals )
	 {
	 startMiles = first ;
	 endMiles = last ;
	 gallons = gals ;
	 }
	 // methods
	 double calculateMPG()
	 {
	 return (last - first)/gals ; // WRONG, WRONG, WRONG
	 }
}
