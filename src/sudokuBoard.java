/**
 * This class implements a sudoku board and some methods that might be needed for creating and dealing with the board
 * @author M. Kashwah
 */
public class sudokuBoard {
    private int[][] board = new int[9][9];

    /**
     * sudokuBoard constructor
     * @param boardMatrix Two dimensional array of the size 9x9
     * @return return board[][]
     */
    public int[][] sudokuBoard(int[][] boardMatrix){
        board = boardMatrix;
        return getBoard();
    }

    /**
     * Getter method for board[][]
     * @return board[][]
     */
    public int[][] getBoard() {
        return board;
    }

    /**
     * This method prints out the board
     */
    public void printBoard(){
        String printedBoard = null;
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                printedBoard += " | " + this.board[i][j];
            }
            printedBoard +="\n";
        }
        System.out.println(printedBoard);
    }
}
