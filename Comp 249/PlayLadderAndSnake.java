//--------------------------------------------------------------------------------------------------------
// Elise Proulx (40125538) and Andrei Barbulescu (40208635)
// COMP 249 - Section S
// Assignment 1
// 02/07/2022
//--------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------
// Assignment Description:
// This program is a Snakes and Ladders simulation game. A welcome message is 
// displayed and then the user is prompted for the number of players (between
// 2 and 4). If the user enters an invalid number 4 times the program terminates.
// If they enter a valid number of players the program prompts the user for the 
// Player's name. The program then calls a player order method, passing the entered
// names to the method. This method then rolls for each player and then places the 
// players in order, from the highest roll to lowest. If two players roll the same number,
// a re-roll between those two players occurs, within the method as well. Once every 
// player has a unique roll number, the method sorts the players and displays the player
// order using a string array. The play method is then called, passing the string array
// of players to the method. The play method rolls for each player, one by one, and adds 
// the roll to the players positions (all players start at square 0). If the players lands 
// on a square with a snake or a ladder, the program moves the players up/down respectively,
// attaining these snake/ladder values from the two-dimensional array at the beginning of
// the LadderAndSnake class. If a player, at any point, rolls over 100, the player is 
// moved back by number of places the went over 100. Once a player has successfully reached 
// square 100, the player is declared a winner and a message is displayed. The game them terminates.
//--------------------------------------------------------------------------------------------------------

// Importing Scanner
import java.util.Scanner;
public class PlayLadderAndSnake {
    public static void main(String[] args) {
        // Calling Scanner
        Scanner scan = new Scanner(System.in);
        // Initializing temporary String array for custom player names
        String[] playersTemp = {"", "", "", ""};
        // Welcome message
        System.out.println("--------------------------------------------");
        System.out.println("	WELCOME TO SNAKES AND LADDERS! \n--------------------------------------------\nLET'S PLAY!\n");
        // Loop for 4 invalid numbers (number of players) entered
        for(int attempt = 0; attempt < 4; attempt++) {
            // Prompting user for number of players
            System.out.println("Please Enter Numbers of Players (between 2 and 4): ");
            int numPlay = scan.nextInt();
            // If you enters a valid number, program prompts for each player's custom name
            if (numPlay >= 2 && numPlay <=4){
                for(int i =0; i < numPlay; i++) {
                    System.out.print("Please enter Player " +(i+1)+ "'s name:");
                    // Passing user's entries to temporary String array
                    playersTemp[i] = scan.next();
                }
                // Creating a LadderAndSnake object, and passing number of players
                LadderAndSnake g1 = new LadderAndSnake(numPlay);
                // Setting number of players
                g1.setPlayers(numPlay);
                // Calling playerOrder() method, passing custom names to method
                System.out.println("\n\nLet's pick player order!");
                String[] pOrder = g1.playerOrder(playersTemp[0], playersTemp[1], playersTemp[2], playersTemp[3]);
                // Displaying order once it is finalized
                System.out.println("FINAL PLAYER ORDER : ");
                for(int i =0; i < numPlay; i++) {
                    System.out.print((i+1) + ". " + pOrder[i] + "		");
                }
                System.out.println("\n");

                // Calling play() method and game executes until someone is declared a winner
                g1.play(pOrder);
                break;
            }
            // Message to user if they do not enter a number between 2 and 4
            else {
                System.out.println("Invalid!");
            }
        }
        // Goodbye message
        System.out.println("\n           --- Game is now OVER ---\n--- Thanks for playing Snake and Ladders!! ---");
        scan.close();
    }
}
