public class BadmintonPlayer {
    String fName;
    String lName;
    int nOfWins;
    int nOfLosses;
    String sponsor;
    int age;
    public BadmintonPlayer(String fName, String lName, int age, int nOfWins, int nOfLosses) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.nOfWins = nOfWins;
        this.nOfLosses = nOfLosses;
    }


    public BadmintonPlayer(String fName, String lName, int age, int nOfWins, int nOfLosses, String sponsor) {
        this(fName, lName, age, nOfWins, nOfLosses);
        this.sponsor = sponsor;
    }
    double winLossRatio() {
        return nOfLosses == 0 ? nOfWins : (double) nOfWins / nOfLosses;
    }

}
