import java.util.ArrayList;
	import java.util.List;

public class ServiceEmployee extends Person {

	protected double rating;
	protected int age;
	protected char gender;
	protected String serviceArea;
	protected double totalBonus;
	
	public ServiceEmployee (int ID, String Name, double rating, int age, char gender, String serviceArea) {
		
		super(ID, Name);
		this.age = age;
		this.gender = gender;
		this.rating = rating;
		this.serviceArea = serviceArea;
		this.totalBonus = 0;
     
		
	}
	
	 

	   
	 
	    public void Service(ServiceCall sc) {
	    	  Vehicle vehicle = null;
	          Driver driver = null;
	          double cost = 0;
	          String type = sc.getServiceType();
	          if (this.serviceArea.equals(sc.getServiceArea())) {
	        	  
	              ArrayList<Vehicle> availableVehicles = VehicleService.getAvailableVehicles(sc.getServiceType());
	              ArrayList<Driver> availableDrivers = DriverService.getAvailableDrivers(sc.getServiceType());

	              for (Driver currentDriver : availableDrivers) {
	                  if (currentDriver.hasLicense(type)) {
	                      driver = currentDriver;
	                      break;
	                  }
	              }

	              if (driver != null) {
	                  for (Vehicle currentVehicle : availableVehicles) {
	                      if (currentVehicle.isAvailable() && currentVehicle.getVehicleType().equals(type)) {
	                          vehicle = currentVehicle;
	                          break;
	                      }
	                  }

	                  if (vehicle != null) {
	                      cost = vehicle.getCostPerKm() * sc.getDistance();
	                      driver.addRevenue(cost);
	                      double driverBonus = 0.1 * cost;
	                      this.totalBonus += 2 * rating;
	                      driver.addBonus(driverBonus);
	                      rating = (rating + sc.getRating()) / 2;
	                      vehicle.setAvailable(false);
	                      driver.setAvailable(false);

	                      System.out.println("Welcome to GetFatmaUber! Driver: " + driver.getName() + ", Vehicle ID: " +
	                              vehicle.getVehicleID() + ", Vehicle Type: " + vehicle.getVehicleType() +
	                              ", Model: " + vehicle.getVehicleModel());

	                  } else {
	                      System.out.println("Sorry, no available vehicles.");
	                  }
	              } else {
	                  System.out.println("Sorry, no available drivers.");
	              }
	          } else {
	              System.out.println("Sorry, the requested service is not available in your area.");
	          }
	      }

	      public double getTotalBonus() {
	          return totalBonus;
	      }
	  }