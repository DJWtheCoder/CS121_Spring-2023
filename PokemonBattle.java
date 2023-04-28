import java.util.Scanner;
import java.util.Random;
public class PokemonBattle {
    public static void main(String[] args){
        int p1wins =0;
        int p2wins = 0;
        Scanner keys = new Scanner(System.in);
        Random random = new Random();
        int tieBreaker = random.nextInt(1);

        System.out.println("Please enter a odd number for the amount of rounds: ");
        int rounds = Integer.parseInt(keys.nextLine());
        for (int i = 1; i <= rounds; i++){
            System.out.printf("\n\n======= Round %s =======\n", i);
            System.out.println("Player 1, please choose a Pokemon and enter the stats.");
            System.out.println("Enter name: ");
            String nameOne = keys.nextLine();
            System.out.println("Enter hit points: ");
            Integer hpOne = Integer.parseInt(keys.nextLine());
            System.out.println("Enter move: ");
            String moveOne = keys.nextLine();
            System.out.println("Enter move's power: ");
            Integer movePowerOne = Integer.parseInt(keys.nextLine());
            System.out.println("Enter attack speed: ");
            Integer speedOne = Integer.parseInt(keys.nextLine());

            System.out.println("Player 2, please choose a Pokemon and enter the stats.");
            System.out.println("Enter name: ");
            String nameTwo = keys.nextLine();
            System.out.println("Enter hit points: ");
            Integer hpTwo = Integer.parseInt(keys.nextLine());
            System.out.println("Enter move: ");
            String moveTwo = keys.nextLine();
            System.out.println("Enter move's power: ");
            Integer movePowerTwo = Integer.parseInt(keys.nextLine());
            System.out.println("Enter attack speed: ");
            Integer speedTwo = Integer.parseInt(keys.nextLine());

            //Setting up variables based on which plsyer starts the round
            String p1Name, p1Move, p2Name, p2Move, playerOne, playerTwo;
            Integer p1Hit, p1Power, p1Speed, p2Hit, p2Power, p2Speed;
            if (speedOne > speedTwo) {
                playerOne = "1";
                p1Name = nameOne;
                p1Hit = hpOne;
                p1Move = moveOne;
                p1Power = movePowerOne;
                p1Speed = speedOne;

                playerTwo = "2";
                p2Name = nameTwo;
                p2Hit = hpTwo;
                p2Move = moveTwo;
                p2Power = movePowerTwo;
                p2Speed = speedTwo;
            } else if (speedTwo > speedOne){
                playerOne = "2";
                p1Name = nameTwo;
                p1Hit = hpTwo;
                p1Move = moveTwo;
                p1Power = movePowerTwo;
                p1Speed = speedTwo;

                playerTwo = "1";
                p2Name = nameOne;
                p2Hit = hpOne;
                p2Move = moveOne;
                p2Power = movePowerOne;
                p2Speed = speedOne;
            } else if (tieBreaker == 0){
                playerOne = "2";
                p1Name = nameTwo;
                p1Hit = hpTwo;
                p1Move = moveTwo;
                p1Power = movePowerTwo;
                p1Speed = speedTwo;

                playerTwo = "1";
                p2Name = nameOne;
                p2Hit = hpOne;
                p2Move = moveOne;
                p2Power = movePowerOne;
                p2Speed = speedOne;
            } else {
                playerOne= "1";
                p1Name = nameOne;
                p1Hit = hpOne;
                p1Move = moveOne;
                p1Power = movePowerOne;
                p1Speed = speedOne;

                playerTwo = "2";
                p2Name = nameTwo;
                p2Hit = hpTwo;
                p2Move = moveTwo;
                p2Power = movePowerTwo;
                p2Speed = speedTwo;
            }

            while (p1Hit > 0 && p2Hit > 0){
                //Player 1's turn
                p2Hit -= p1Power;
                if(p2Hit <= 0){
                    System.out.printf("Player %s is the round winner with %s!\n",playerOne, p1Name);
                    if (playerOne.equals("1")){
                        p1wins += 1;
                    } else {
                        p2wins += 1;
                    }
                    break;
                }
                // Player 2's turn
                p1Hit -= p2Power;
                if(p1Hit <= 0){
                    System.out.printf("Player %s is the round winner with %s!\n",playerTwo, p2Name);
                    if (playerTwo.equals("1")){
                        p1wins += 1;
                    } else {
                        p2wins += 1;
                    }
                    break;
                }

            }
            if (i < rounds){
                System.out.println("------- Wins ------");
                System.out.println("Player 1: " + p1wins);
                System.out.println("Player 2: " + p2wins);
            }

        }
        System.out.println("\n============== Final Scores ===========");
        System.out.println("Player 1: " + p1wins);
        System.out.print("Player 2: " + p2wins);
        if (p1wins > p2wins){
            System.out.println("\nPlayer 1 won the game!");
        } else {
            System.out.println("\nPlayer 2 won the game!");
        }


    }
}
