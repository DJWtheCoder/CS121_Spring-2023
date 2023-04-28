import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keys = new Scanner(System.in);
        File outputFile = new File("moreDistricts.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String winner;
        String district;
        String game;

        output.printf("%s %s %s\n", "winner", "district", "game");

        for(int record = 1; record <=3; record++){
            System.out.println("Please enter the name of the winner: ");
            winner = keys.nextLine();
            System.out.println("Please enter which district thee winner was from: ");
            district = keys.nextLine();
            System.out.println("Please enter which annual Hunger Game the winner won: ");
            game = keys.nextLine();

            output.printf("%s %s %s\n", winner, district, game);

        }
    output.close();
    }
}
