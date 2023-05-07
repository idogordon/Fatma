
public class ServiceCall {

	protected Customer customer;
	protected Vehicle vehicle;
	protected String serviceArea;
	protected  double distance;
	
	public ServiceCall (Customer c, Vehicle v, String serviceArea, double distance)	{
		
		this.customer = c;
		this.vehicle = v;
		this.serviceArea = serviceArea;
		this.distance = distance;

	}
	public Customer getCustomer() {
	    return this.customer;
	}

	public Vehicle getVehicle() {
	    return this.vehicle;
	}
	public String getServiceArea() {
	    return this.serviceArea;
	}
	public double getDistance() {
	    return this.distance;
	}

	
	
}
