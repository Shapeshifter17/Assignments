public class LadderAndSnake {
    private int players;
    private final static int [][] board = {{1,38},{4,14},{9,31},{16,6},{21,42}
            ,{28,84},{36,44},{48,30},{51,67},{62,19},{64,60},{71,91},{93,68},{95,24}, {97,76},{98,78}};
    //Removed {80, 100} and hardcoding it into loop in play()

    public LadderAndSnake() {}
    public LadderAndSnake(LadderAndSnake las) {
        this.players = las.players;
    }
    public LadderAndSnake(int numPlayers) {
        players = numPlayers;
    }
    public int getPlayers() {
        return players;
    }
    public void setPlayers(int players) {
        this.players = players;
    }
    public int[] playerOrder() {
        return new int[]{1,2,3,4};
    }
    public int flipDice(){
        return (int)(Math.random()*6+1);
    }
    public void play() {
        boolean playing = true;
        boolean checkLS;
        boolean reg;
        String[] order = {"Player 1", "Player 2", "Player 3", "Player 4"};
        int[] positions = {0, 0, 0, 0};
        while(playing) {
            for(int i = 0; i < getPlayers(); i++) {
                checkLS = true;
                reg = true;
                int nextRoll = flipDice();
                System.out.println("\nRolling.......... ");
                System.out.println(order[i] + " rolls " + nextRoll);
                while(checkLS) {
                    for(int j = 0; j <15; j++) {
                        if(positions[i]+nextRoll == board[j][0]) {
                            if(positions[i] < board[j][1]) {
                                System.out.println("Its a ladder! " + order[i] + " moves up to square " + board[j][1]);
                            }
                            else {
                                System.out.println("Oh no! Player " + order[i] + " moves down to square " + board[j][1]);
                            }
                            positions[i] = board[j][1];
                            reg = false;
                            break;
                        }
                    }
                    checkLS = false;
                }
                while(reg)
                {
                    if(positions[i]+nextRoll > 100) {
                        int excess = 100-(positions[i] + nextRoll);
                        System.out.println("*****OVER 100*****");
                        String x = "Oh no! " + order[i] + " moves down to square " + positions[i];
                        if(100+excess == 98 ) {
                            positions[i] = 78;
                            System.out.println(x);
                            break;
                        }
                        if(100+excess == 97) {
                            positions[i] = 76;
                            System.out.println(x);
                            break;
                        }
                        if(100+excess == 95) {
                            positions[i] = 24;
                            System.out.println(x);
                        }
                        else {
                            positions[i] = 100 + excess;
                            System.out.println(order[i] + " moves down to square " + positions[i]);
                        }
                        break;
                    }
                    if(positions[i]+nextRoll==100 || positions[i]+nextRoll==80) {
                        positions[i] = 100;
                        System.out.println(order[i] + " moves up to square 100");
                        System.out.println(order[i] + " has won!");
                        playing = false;
                        i = 3;
                        break;
                    }
                    else
                    {
                        positions[i] = positions[i]+nextRoll;
                        System.out.println(order[i] + " moves up to square " + positions[i]);
                        reg = false;
                    }
                }
            }
        }
    }
}
