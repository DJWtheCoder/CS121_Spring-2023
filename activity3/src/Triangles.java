import java.util.Scanner;

public class Triangles {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a side measure 1: ");
        int s1 = keyboard.nextInt();
        System.out.print("Please enter a side measure 2: ");
        int s2 = keyboard.nextInt();
        System.out.print("Please enter a side measure 3: ");
        int s3 = keyboard.nextInt();

        if (s1 == s2 && s2 == s3) {
            System.out.println("This is a equilateral triangle!");
        }else if (s1 == s2 || s1 == s3 || s2 == s3) {
            System.out.println(("This is a isosceles triangle!"));
        }else {
            System.out.println("This is a scalene triangle!");
        }
    }
}
