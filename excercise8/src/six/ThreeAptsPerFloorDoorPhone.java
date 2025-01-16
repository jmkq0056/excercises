package six;

public class ThreeAptsPerFloorDoorPhone implements DoorPhone {
    private int numFloors;

    public ThreeAptsPerFloorDoorPhone(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public void call(String apt) throws NoSuchFloorException, NoSuchAptException, IllegalAptException {
        if (apt.length() != 3) {
            throw new IllegalAptException("Apartment number must be in the format <floor><side>, e.g., 2mf or 4tv.");
        }

        char floorChar = apt.charAt(0);
        if (!Character.isDigit(floorChar)) {
            throw new IllegalAptException("Floor number must be a digit.");
        }

        int floor = Character.getNumericValue(floorChar);
        if (floor < 1 || floor > numFloors) {
            throw new NoSuchFloorException("Invalid floor number: " + floor);
        }

        String side = apt.substring(1).toLowerCase();
        if (!side.equals("tv") && !side.equals("th") && !side.equals("mf")) {
            throw new NoSuchAptException("Invalid apartment side: " + side + ". Valid sides are 'tv' (left), 'th' (right), and 'mf' (middle).");
        }

        System.out.println("Calling apartment: " + apt);
    }
}
