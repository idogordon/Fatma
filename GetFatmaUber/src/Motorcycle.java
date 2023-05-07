
public class Motorcycle extends Vehicle {
	protected  int maxSpeed;
	protected double engineDisplacement;
	static int Serial = 0 ;
	
	
	public Motorcycle(int licenseNumber, String model, int year, Driver driver, int maxSpeed, double engineDisplacement) {
		
		super(licenseNumber , model, year, driver );
		Serial++;
		if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new IllegalArgumentException("Maximum speed must be a positive integer");
        }
		this.engineDisplacement = engineDisplacement;
		
		
	}
	
	public double calculateDrivingTime(double distance) {
        double P = 6.0 + Math.random() * 2.0; // נוצר מספר אקראי בין 6.0 ל- 8.0
		return distance / (this.maxSpeed * P); 
		
	}

	
	
	
	 public int getMaxSpeed() {
	        return maxSpeed;
	    }
	 public void setMaxSpeed(int maxSpeed) {
	        if (maxSpeed > 0) {
	            this.maxSpeed = maxSpeed;
	        } else {
	            throw new IllegalArgumentException("Maximum speed must be a positive integer");
	        }
	    }
	 public double getEngineDisplacement() {
	        return engineDisplacement;
	    }
	 
	 public void setEngineDisplacement(double engineDisplacement) {
	        this.engineDisplacement = engineDisplacement;
	    }
	 public  double getbaseFare() {
			return 0;
		}
	}


