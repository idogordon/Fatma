import java.util.ArrayList;

public class Company {
    private ArrayList<Customer> customers;
   
    private ArrayList<Driver> drivers;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<ServiceEmployee> SerivceEmployee;
    
    public Company() {
        customers = new ArrayList<Customer>();
        drivers = new ArrayList<Driver>();
        vehicles = new ArrayList<Vehicle>();
        SerivceEmployee = new ArrayList<ServiceEmployee>();
    }
    
    public void addCustomer(Customer c) {
        customers.add(c);
    }
    public void addVehicle(Vehicle v) {
        // הוספת הכלי הרכב למאגר הרכבים של החברה
    	vehicles.add(v);
    }
    
    public void addSerivceEmployee(ServiceEmployee se) {
    	SerivceEmployee.add(se);
    	
    }
    public void addDriver(Driver driver) {
    	drivers.add(driver);
    }
    
    public Customer getCustomerById(int id) { //  בודק האם הId 
        for (Customer c : customers) {
            if (c.getID() == id) {
                return c;
            }
        }
        return null;
    }

    public boolean serviceForCustomer(int customerID, String serviceType, String serviceArea, double distance) {
        Customer customer= getCustomerById(customerID); 
        
        if (customer == null) {
            System.out.println("Error: Customer with ID " + customerID + " not found.");
            return false;
        }

        boolean isDelivery = serviceType.equals("Delivery");
        boolean isTaxi = serviceType.equals("Taxi") || serviceType.equals("Taxi Premium");
        if (isDelivery) {
            System.out.println("Customer requests delivery service.");
        } else if (isTaxi) {
            System.out.println("Customer requests taxi service.");
        } else {
            System.out.println("Error: Service type " + serviceType + " is not supported.");
            return false;
        }
        System.out.println("Service area: " + serviceArea);
        System.out.println("Distance: " + distance);
        
        ServiceEmployee selectedEmployee = null;
        double lowestBonus = Double.MAX_VALUE;
        for (ServiceEmployee SerivceEmployee : SerivceEmployee) {
            if (SerivceEmployee != null) {
                if (SerivceEmployee.getBonus() < lowestBonus) {
                    selectedEmployee = employee;
                    lowestBonus = employee.getBonus();
                }
            }
        }

        if (selectedEmployee == null) {
            System.out.println("Error: No available employees found to handle the service.");
            return false;
        }

        Service service = new Service(customer, selectedEmployee, serviceType, serviceArea, distance);
        selectedEmployee.addService(service);
        System.out.println("Service assigned to employee " + selectedEmployee.getId() + " with bonus " + selectedEmployee.getBonus());
        return true;
    }
        

       

}
