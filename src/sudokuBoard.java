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
    public sudokuBoard(int[][] boardMatrix){
        board = boardMatrix;

    }

    /**
     * This method returns board[][]
     * @return board[][]
     */
    public int[][] getBoard() {
        return board;
    }

    /**
     * This method prints out the board
     */
    public void printBoard(){
        String printedBoard = "\n";
        for (int i = 0; i < 9; i++){


            for (int j = 0; j < 9; j++){
                if((j+1)% 3 == 0){
                    printedBoard += this.board[i][j] + "  |  ";
                } else{
                    printedBoard += this.board[i][j] + "  ";
                }
            }
            printedBoard += "\n";
            if ((i+1)%3 == 0){
                printedBoard += "----------------------------------"+"\n";
            }

        }
        System.out.println(printedBoard);
    }

    /**
     * This method returns number at board(i,j)
     * @param i row index
     * @param j column index
     * @return Number at index
     */
    public int getBlock(int i, int j){
        return board[i][j];
    }

    /**
     * This method changes the number at board(i,j) to int val
     * @param i row index
     * @param j column index
     * @param val changed value
     */
    public void setBlock(int i, int j, int val){
        if(val <= 9 && val >= 0){
            board[i][j] = val;
        } else {
            System.out.println("value is out of expected 0 to 9");
            board[i][j] = 0;
        }

    }

}
