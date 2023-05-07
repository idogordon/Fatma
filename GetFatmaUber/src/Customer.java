
public class Customer extends Person implements Comparable <Customer>{
		
	
	protected String phoneNumber;	
	protected int age;
	protected char gender;
	private double payments;
	
	public Customer (int ID, String name, int age, char gender) {
		
		super(ID,name);
		this.age = age;
		this.gender = gender;
	}

	public int giveRating() {			
		
		 int Rating = (int)(Math.random() * 5 + 1);
		return Rating;
	}
	
	public double pay(double time, double Fare) {
		
		double pay = 2*time + Fare;
		
		payments += pay;
		
		return pay;
		
	}

	
public int compareTo(Customer o) {
		
		if( payments < o.payments) return -1;
		if( payments > o.payments) return 1;
		return 0;
	}



	
}
