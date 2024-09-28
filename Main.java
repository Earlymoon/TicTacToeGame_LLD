package TicTacToe_LLD;

public class Main {
    public static void main(String[] args) {
       TicTakToe ticTakToe=new TicTakToe();

       ticTakToe.initialiseGame();
//        System.out.println(ticTakToe.gameBoard.board);
        System.out.println("game winner is :"+ticTakToe.startGame());
    }
}
