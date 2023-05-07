public class PremiumTaxi extends Taxi {
    private double luxuryCharge;
    private boolean upgraded;
	

	
	
    public PremiumTaxi(int licenseNumber, String model, int year,Driver driver, double baseFare, int maxPassengers, double luxuryCharge) {
        super(licenseNumber, model, year, driver ,baseFare, maxPassengers);
    
        this.luxuryCharge = luxuryCharge;
        this.upgraded = false;
        if (maxPassengers < 1 || maxPassengers > 10) {
            throw new IllegalArgumentException("Number of passengers must be between 1 and 10.");
        }
    }

    public boolean upgrade() {
        if (upgraded) {
            return false;
        }
        if (Math.random() < 0.5) {
            upgraded = true;
            System.out.println("The" + licenseNumber  + "PremiumTaxi Upgrade H-Y-D-A-!");
            return true;
        }
        return false;
    }

   
    public String toString() {
        String result = super.toString();
        if (upgraded) {
            result += " (upgraded)";
        }
        return result;
    }
}
