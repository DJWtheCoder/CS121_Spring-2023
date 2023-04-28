import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        Scanner keys = new Scanner(System.in);
        try{
            FileWriter inputFile = new FileWriter("districts.txt", true);
            PrintWriter output = new PrintWriter(inputFile);

            System.out.println("Enter the winner's name: ");
            String winner = keys.nextLine();
            System.out.println("Enter the district the winner orginated from: ");
            String district = keys.nextLine();
            System.out.println("Enter which annual Hunger Games they won: ");
            String game = keys.nextLine();

            output.printf("\n%s %s %s", winner, district, game);
            inputFile.close();
            output.close();

        } catch (FileNotFoundException e){
            System.err.println("File not found!!");
        }



    }
}
