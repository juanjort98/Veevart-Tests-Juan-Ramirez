public class Main {

    public static void main(String[] args) throws Exception {

        int N = 4; /* Testing with 4x4 matrix */

        ChessGame chess = new ChessGame(N);

        String board[][] = new String[N][N];

        chess.createBoard(board);


        if (chess.nQueenRecursiveMethod(board, 0) == false) {
            System.out.println("Cannot be solve");
        }

        chess.printMatrix(board);

    }

}
