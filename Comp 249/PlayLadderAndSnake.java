import java.util.Arrays;
import java.util.Scanner;

public class PlayLadderAndSnake {
    public static void main(String[] args) {

     //   LadderAndSnake game = new LadderAndSnake(4);
     //   System.out.println(game.flipDice());
     //   System.out.println(Arrays.toString(game.playerOrder()));
        Scanner scan = new Scanner(System.in);
        System.out.println("How many players are there? (between 2 and 4)");

        int players = 0;
        while(true){
            int userIn = scan.nextInt();

            if (userIn >= 2 && userIn <=4){
                players = userIn;

                break;
            }
            else
                System.out.println("How many players are there? (between 2 and 4)");

        }
        int[] playerArr = new int[players-1];
        System.out.println(playerArr.length);


        Gamers gamer1 = new Gamers();
        Gamers gamer2 = new Gamers();
        Gamers gamer3 = new Gamers();
        Gamers gamer4 = new Gamers();
        int num1 = gamer1.flipDice();
        int num2 = gamer2.flipDice();
        int num3 = gamer3.flipDice();
        int num4 = gamer4.flipDice();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
