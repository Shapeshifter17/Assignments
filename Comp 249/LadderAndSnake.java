import java.util.Random;

class Gamers{
    int position;

    public Gamers(){
        position = 0;
    }

    public void add(int i){
        position = position + i;
        int sOrL = LadderAndSnake.checkBoard(i);
        if(sOrL != 0)
            position = sOrL;
    }
}
 
public class LadderAndSnake {
    private int players;
    // it goes from 0 to number of
    private final static int [][] board = {{1,38},{4,14},{9,31},{16,6},{21,42}
                            ,{28,84},{36,44},{48,30},{51,67},{62,19}
                            ,{64,60},{80,100},{71,91},{93,68},{95,24},
                            {97,76},{98,78}};

    public LadderAndSnake(int players) {
        this.players = players;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int flipDice(){
        Random rand = new Random();
        return rand.nextInt(1,6);
    }

    public void playerOrder()
    {

        for(int i=0; i < players; i++)
        {
            flipDice();
        }
    }

    public static int checkBoard(int i)
    {
        int pZeroBoard = 0;
        if(board[pZeroBoard][0] == i)
        {
            return board[pZeroBoard][1];
        }
        else
        {
            return 0;
        }
    }

    public int playerOrder()
    {
      Gamer gamer1 = new Gamer;
      Gamer gamer2 = new Gamer;
      Gamer gamer3 = new Gamer;
      Gamer gamer4 = new Gamer;
      return 2;

    }
    public void play(){

    }
}
