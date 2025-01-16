public class Team {
    String name;
    BadmintonPlayer bP1;
    BadmintonPlayer bP2;
    int nOfWins;
    int nofLosses;
    public Team(String name, BadmintonPlayer bP1, BadmintonPlayer bP2){
        this.name = name;
        this.bP1 = bP1;
        this.bP2 = bP2;
    }

    double averageAge (){
        return (double) (bP1.age + bP2.age) / 2;
    }
}
