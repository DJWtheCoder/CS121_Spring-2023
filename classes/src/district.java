public class district {

    int districtNumber;
    String industry;
    int wins;
    String mentions;

    public district(int districtNumber, String industry, int wins, String mentions){
        this.districtNumber = districtNumber;
        this.industry = industry;
        this.wins = wins;
        this.mentions = mentions;
    }

    void districtDictionary(){
        System.out.println("\n!!!!!!!!!! District Information !!!!!!!!!!!");
        System.out.printf("~ District: %s\n" +
                "~ Main industry: %s\n" +
                "~ Number of wins: %s\n" +
                "~ Honorable mentions: %s\n", districtNumber,industry,wins,mentions);
    }

    void calculateWinningChance(){
        if (districtNumber >= 5 || districtNumber == 3){
            System.out.println(" ^^^^^^ Winning Chance: slim to none!");
        } else {
            System.out.println("^^^^^^ Winning Chance: ver high.");
        }
    }
}
