package session4.B_Multiple_Inheritance;

public class TeslaModelS extends SportsCar implements ElectricVehicle{
    double batteryLevel = 0;

    public TeslaModelS() {
        super();
        batteryLevel = 100;
    }

    @Override
    public boolean goFast() {
        System.out.println("Going Fast!!!");
        return true;
    }

    @Override
    public int speed() {
        return 350;
    }

    @Override
    public double batteryLevel() {
        return this.batteryLevel;
    }
}
