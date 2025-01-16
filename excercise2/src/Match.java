public class Match {
    Team blue;
    Team red;

    public Match(Team blue, Team red) {
        this.blue = blue;
        this.red = red;
    }
    double averageAge(){
        return (double) (blue.bP1.age + blue.bP2.age + red.bP1.age + red.bP2.age) / 4;
    }

    void resultMatch(String redOrBlue) {
        if (!redOrBlue.equalsIgnoreCase("red") && !redOrBlue.equalsIgnoreCase("blue")) {
            throw new IllegalArgumentException("Invalid team: The winning team must be either 'red' or 'blue'.");
        }

        System.out.println("Match Statistics");
        System.out.println("================");
        System.out.println("Before the Match:");
        System.out.println("-----------------");
        printTeamStatistics(blue, "Blue");
        printTeamStatistics(red, "Red");

        if (redOrBlue.equalsIgnoreCase("blue")) {
            updateTeamStats(blue, red);
            System.out.println("\nResult: Blue Team Won!");
        } else {
            updateTeamStats(red, blue);
            System.out.println("\nResult: Red Team Won!");
        }

        System.out.println("\nAfter the Match:");
        System.out.println("----------------");
        printTeamStatistics(blue, "Blue");
        printTeamStatistics(red, "Red");
    }


    private void updateTeamStats(Team winningTeam, Team losingTeam) {
        winningTeam.nOfWins++;
        losingTeam.nofLosses++;
        winningTeam.bP1.nOfWins++;
        losingTeam.bP1.nOfLosses++;
        winningTeam.bP2.nOfWins++;
        losingTeam.bP2.nOfLosses++;
    }

    private void printTeamStatistics(Team team, String teamName) {
        System.out.println(teamName + " Team:");
        System.out.println("  Team Wins: " + team.nOfWins);
        System.out.println("  Team Losses: " + team.nofLosses);
        System.out.println("  Player 1: " + team.bP1.fName + " " + team.bP1.lName);
        System.out.println("    Wins: " + team.bP1.nOfWins);
        System.out.println("    Losses: " + team.bP1.nOfLosses);
        System.out.println("  Player 2: " + team.bP2.fName + " " + team.bP2.lName);
        System.out.println("    Wins: " + team.bP2.nOfWins);
        System.out.println("    Losses: " + team.bP2.nOfLosses);
    }

    String bestWinLossRatio() {
        double blueP1Ratio = blue.bP1.winLossRatio();
        double blueP2Ratio = blue.bP2.winLossRatio();
        double redP1Ratio = red.bP1.winLossRatio();
        double redP2Ratio = red.bP2.winLossRatio();

        BadmintonPlayer bestPlayer = blue.bP1;
        double bestRatio = blueP1Ratio;

        if (blueP2Ratio > bestRatio) {
            bestPlayer = blue.bP2;
            bestRatio = blueP2Ratio; // Update bestRatio
        }
        if (redP1Ratio > bestRatio) {
            bestPlayer = red.bP1;
            bestRatio = redP1Ratio; // Update bestRatio
        }
        if (redP2Ratio > bestRatio) {
            bestPlayer = red.bP2;
            bestRatio = redP2Ratio; // Update bestRatio
        }

        return bestPlayer.fName + " " + bestPlayer.lName + " has the best win-loss ratio";
    }

}
