package TicTacToe_LLD;

import TicTacToe_LLD.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTakToe {
    public Deque<Player>players;
    public Board gameBoard;

    public void initialiseGame(){
        players=new LinkedList<>();
//        board=new Board(3);

        PieceX crossPiece=new PieceX();
        Player player1=new Player("player1",crossPiece);
        PieceO knoughtPiece=new PieceO();
        Player player2=new Player("player2",knoughtPiece);

        players.add(player1);
        players.add(player2);
        gameBoard=new Board(3);
    }
    public String startGame(){

        boolean isWinner=false;
        while(!isWinner){

            Player playerTurn=players.removeFirst();
            gameBoard.printBoard();


            List<int[]>getFreeSapce=gameBoard.getFreeCells();
            if(getFreeSapce.isEmpty()){
                isWinner=true;
                continue;
            }
            System.out.println(playerTurn.name+" enter your moves i.e (row,col) ");
            Scanner s=new Scanner(System.in);
            int pos[]=new int[2];
            for(int i=0;i<=1;i++){
                pos[i]=s.nextInt();
            }
            boolean checkIfAdded=gameBoard.addPiece(pos[0],pos[1],playerTurn.playingPiece);
            if(!checkIfAdded){
                System.out.println("Incorrect positions, try again");
                players.addFirst(playerTurn);
                continue;
            }

            if(checkWinner(pos[0],pos[1],playerTurn.playingPiece)){
                isWinner=true;
                gameBoard.printBoard();

                return playerTurn.name;

            }
            players.addLast(playerTurn);


        }

        return "tie";
    }
    public boolean checkWinner(int row, int col, PlayingPiece playingPiece){
        PlayingPiece curr=playingPiece;
        boolean rowMatch=true;
        boolean colMatch=true;
        boolean diagonalMatch=true;
        boolean antiDiagonalMatch=true;

//        check for the row match
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[row][i]==null||gameBoard.board[row][i]!=playingPiece){
                rowMatch=false;
            }
        }


//        check for the col
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[i][col]==null||gameBoard.board[i][col]!=playingPiece){
                colMatch=false;
            }
        }

//        check for diagonal
        for(int i=0,j=0;i<gameBoard.size;i++,j++){
            if(gameBoard.board[i][j]==null||gameBoard.board[i][j]!=playingPiece){
                diagonalMatch=false;
            }
        }


        for(int i=0,j=gameBoard.size-1;i<gameBoard.size;i++,j--){
            if(gameBoard.board[i][j]==null||gameBoard.board[i][j]!=playingPiece){
                antiDiagonalMatch=false;
            }
        }



        return rowMatch||colMatch||diagonalMatch||antiDiagonalMatch;
    }
}
