package TicTacToe_LLD.Model;
import java.util.*;
public class Board {
    public int size;
    public PlayingPiece[][]board;

    public Board(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
    }

//    check if there is any free space to add the piece or not
    public boolean addPiece(int row,int col,PlayingPiece playingPiece){
        if(board[row][col]!=null){
            return false;
        }
        board[row][col]=playingPiece;
        return true;
    }

    public List<int[]> getFreeCells(){
        List<int[]>freePlaces=new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    int curr[]=new int[2];
                    curr[0]=i;
                    curr[1]=j;
                    freePlaces.add(curr);
                }
            }
        }
        return freePlaces;
    }

//    print the board

    public void printBoard(){

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
//                System.out.print("|");
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType+" ");
                }else{
                    System.out.print("  ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }



}
