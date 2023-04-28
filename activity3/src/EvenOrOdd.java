import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = keyboard.nextInt();

        if (num % 2 == 0)
            System.out.println("The number was even.");
        else
            System.out.println("The number was odd.");
    }
}