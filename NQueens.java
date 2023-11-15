
//import java.net.SocketTimeoutException;
import java.util.Scanner;

public class NQueens {

    // time.c O(n!)
    public static boolean isSafe(char board[][], int row, int col) {
        // veryical up

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }

        }

        // diag. left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag. right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int count = 0;

    public static void nQueens(char board[][], int row) { // boollean
        if (row == board.length) {
            printBoard(board);
            count++;
            return; // return true
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // return true
                board[row][j] = 'x'; // }

            }
            // board[row][j] = 'x'; back tracking step

        }
        // return true;
    }

    public static void printBoard(char board[][]) {
        // int count = 0;

        System.out.println("------chess board------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }

        // System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Chess Board Size");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("total number of ways = " + count);
        sc.close();
        // if nqueens (board,0){syso(solution found)}
        // else {syso(not found)}
    }

}
