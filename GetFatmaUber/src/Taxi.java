
public class Taxi extends Vehicle  {
	protected double baseFare;
	protected int maxPassengers;
	static int Serial = 0 ;

	public Taxi(int licenseNumber, String model, int year,Driver driver, double baseFare, int maxPassengers) {
		
		super(licenseNumber , model , year , driver);
		 Serial++ ;
		this.baseFare = baseFare;
		this.maxPassengers = maxPassengers;
		
		if (maxPassengers < 1 || maxPassengers > 4) {
            throw new IllegalArgumentException("Invalid number of passengers for a taxi");
        }
    }
		
	
	
	
	
	public double calculateDrivingTime(double distance) {
		
        double P = Math.random() * (8.0 - 6.0) + 6.0;
		return (distance / (100 * P)) + 2;  
	}
	public  double getbaseFare() {
		return this.baseFare;
	}
}
