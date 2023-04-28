import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile1 = new File("C:\\Users\\destiny.wells2\\OneDrive - Ball State University\\GitHub\\fileActivity\\districts.txt");
        File inputFile2 = new File("districts.txt");

        try {
            Scanner theFile = new Scanner(inputFile1);
            while(theFile.hasNextLine()){
                String line = theFile.nextLine();
                System.out.println(line);
            }
            theFile.close();
        } catch(FileNotFoundException e){
            System.err.println("File not found!");
        }
    }
}
