
public class Driver extends Person implements Comparable <Driver>{
		
	protected String phoneNumber;	
	protected double rating;
	protected String[] liscenses;
	protected static double profits;	
	protected Vehicle vehicle;
	

	public Driver(int ID, String name, String phoneNumber, double rating, String [] licenses) {
		
		super(ID ,name);
		this.phoneNumber = phoneNumber;
		this.rating = rating;
		this.liscenses = licenses;
		
	}
	public double drivingProfit(Customer c, int time, Vehicle v) {
		
		double P = 0.5 + Math.random() * 0.5;
		
		double	profit = (c.pay(time, v.getbaseFare()) + (c.giveRating())) - ((time*P));
		
		profits += profit;
		
		return	profit;

	}
	public int compareTo(Driver o) {
		
		if( rating < o.rating) return -1;
		if( rating > o.rating) return 1;
		return 0;
	}
	
}
