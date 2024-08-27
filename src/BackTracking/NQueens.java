package BackTracking;

import java.util.Scanner;

public class NQueens {

    public static Boolean insertQueens(int[][] board,int row){
        //Base condition
        if(row==board.length){
            return true;
        }

        for (int col = 0; col<board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                if(insertQueens(board,row+1)){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }
    public static Boolean isSafe(int[][] board,int row,int col){
        //checking rows and cols
        for( int i=0; i<board.length; i++){
            if(board[row][i] == 1 || board[i][col] == 1){
                return false;
            }
        }
        //checking Diagonally left
        for(int i = row-1 , j = col-1;i >= 0 && j >= 0;i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        //check diagonally right
        for(int i = row-1 , j = col+1; i >= 0 && j < board.length;i--,j++)
            if (board[i][j] == 1) {
                return false;
            }
        return true;
    }
    public static void printBoard(int[][] board) {
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens in the board: ");
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        printBoard(board);
        if (insertQueens(board,0)) {
            System.out.println("Queens have been inserted");
            printBoard(board);
        }
        else
            System.out.println("Queens have not been inserted");

    }
}
