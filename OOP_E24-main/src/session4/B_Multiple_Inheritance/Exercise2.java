package session4.B_Multiple_Inheritance;

/**
 * Exercise:
 *  - Create a class called ElectricPetrolStation that provides a method void chargeVehicle(ElectricVehicle vehicle). This method should:
 *      - Accept only instances of vehicles that implement the ElectricVehicle interface.
 *      - Call the batteryLevel() method to check the current battery level before charging.
 *      - Simulate charging the vehicle by increasing the battery level (for simplicity, assume charging adds 10% to the battery, but does not exceed 100%).
 *
 *  - Modify the ElectricVehicle interface to allow updating the battery level of a vehicle.
 *
 *  - Create a class to represent Electric Buses manufactured by Volvo.
 *
 *  - Add code below to simulate a scenario where both a TeslaModelS and a Volvo Electric Bus go to an ElectricPetrolStation and get charged.
 *
 *  - Verify that you can not charge a Porsche911 car in the ElectricPetrolStation.
 */

public class Exercise2 {

    public static void main(String[] args) {

        //ElectricBusVolvo volvoElectriBus = new asdñflaksj();
        TeslaModelS teslaModelS = new TeslaModelS();

        //ElectricPetrolStation electricPetrolStation  = new  ElectricPetrolStation();

        //Charge volvoElectriBus at electricPetrolStation

        //Charge teslaModelS at electricPetrolStation

        Porsche911 porsche911 = new Porsche911();

        //Try to charge the porsche911 at electricPetrolStation




        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session4_B2", I_did_finish, I_did_understand, comment);
        */

    }
}
