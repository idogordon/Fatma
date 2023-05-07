
public abstract class Vehicle implements Comparable<Vehicle> {
	protected  static int licenseNumber;
	protected String model;
	protected int year;
	protected Driver driver; 
	
	public Vehicle(int licenseNumber, String model, int year,Driver  driver ) {
		this.licenseNumber = licenseNumber;
		this.model = model;
		this.year = year;
		this.driver = driver;

	}
	public boolean addDriver(Driver driver) {
		  // check if motorcycle is available
        if (this.driver != null) {
            return false;
        }
        // assign motorcycle to driver
        this.driver = driver;
        return true;

	}
	protected abstract double getbaseFare();
	
	
		
	
}
