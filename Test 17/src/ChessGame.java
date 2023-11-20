public class ChessGame {


    public int n;


    public ChessGame(int n){
        this.n = n;
    }

    public  boolean safeToPut(String chessBoard[][], int row, int column) {
        /* Check upper column */
        for (int i = 0; i < row; i++)
            if (chessBoard[i][column] == "x") /* Check if the position is filled by a queen */
                return false;

        /* Check diagonal right in the upper side */
        for (int i = row, k = column; i >= 0 && k < n  ; i--, k++)
            if (chessBoard[i][k] == "x") /* Check if the position is filled by a queen */
                return false;

        /* Check diagonal left in the upper side */

        for (int i = row, k = column; i >= 0 && k >= 0; i--, k--)
            if (chessBoard[i][k] == "x") /* Check if the position is filled by a queen */
                return false;

        return true;
    }

    public boolean nQueenRecursiveMethod(String chessBoard[][], int row) {

        if (row >= n) /* Check if there are no more queens to place */
            return true;

        for (int i = 0; i < n; i++) {
            if (safeToPut(chessBoard, row, i)) {
                // place queen
            
                chessBoard[row][i] = "x";

                if (nQueenRecursiveMethod(chessBoard, row + 1))
                    return true;

                chessBoard[row][i] = "o";
            }

        }

        /* Cannot be placed in any column of the row */

        return false;

    }

    public void printMatrix(String chessBoard[][]) {

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void createBoard(String board[][]) {

        /* Filling chess initializing it */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = "o";
            }
        }

    }

}
