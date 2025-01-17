package session4.A_Vehicle_Hierarchy;

public class TeslaS extends SportsCar {

    @Override
    public boolean goFast() {
        System.out.println("Going Fast!!!");
        return true;
    }

    @Override
    public int speed() {
        return 350;
    }
}
