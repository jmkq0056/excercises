package five;
public class ParkingMeter {
    private ParkingRate parkingRate;
    private double totalAmount;

    public ParkingMeter(ParkingRate parkingRate){
        this.parkingRate = parkingRate;
        this.totalAmount = 0.0;
    }

    public void setParkingRate(ParkingRate parkingRate) {
        this.parkingRate = parkingRate;
    }

    // Method to insert coins and pay for x minutes
    public double insertCoins(int minutes) {
        double amount = parkingRate.computeRate(minutes);
        totalAmount += amount;
        System.out.println("Paid for " + minutes + " minutes. Amount: DKK" + amount);
        return amount;
    }

    // Method to check the total amount collected
    public double getTotalAmount() {
        return totalAmount;
    }
}