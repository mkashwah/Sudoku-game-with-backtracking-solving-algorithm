import java.util.LinkedList;

public class backtrackingAlgorithm {

    sudokuBoard board;
    LinkedList<boardCell> zeroCells = new LinkedList<>();       //this linked list will contain the cells which has zero (empty cells to be solved)
    /**
     * Default constructor taking board object as parameter
     * @param board of sudokuBoard type. To be used across the algorithm.
     */
    public backtrackingAlgorithm(sudokuBoard board){
        this.board = board;
    }

    /**
     * This method finds the board cells which equal to zero. Which means that they're empty and the algorithm need to solve them.
     * When found, an object of type board cell is created that contains the indices and the value of the cell
     * The object is then appended to a linked list.
     * The use of the linked list is to mainly store the place on board[][] where the cell is equal zero so that later on it will be changed
     * directly through the method sudokuBoard.setBlock(int i, int j, int val)
     */
    public void findZeros(){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board.getBlock(i,j) == 0){
                    zeroCells.add(new boardCell(i,j,board.getBlock(i,j)));
                }
            }
        }
    }

    /**
     * This method prints out the linked list
     */
    public void printLinkedList(){
        System.out.println("\nPrinting the linked list");
        for (int i = 0; i < zeroCells.size(); i++){
            boardCell cell = zeroCells.get(i);
            System.out.println("cell " + cell.getI() + " " + cell.getJ() + " = " + cell.getVal());
        }
    }


    /**
     * This method checks if the number to be inserted at board[i][j] is valid according to the rules of the game
     * if the number to be inserted is int num = board [i][j] then
     * num != board [i][0 to 8] && num != board [0 to 8][j]
     * @param i row index
     * @param j column index
     * @param num value inputted
     * @return true if number can be inserted and false if not
     */
    public boolean isValid(int i, int j, int num){
        //checking row
        for(int c = 0; c < 9; c++){
            if(board.getBlock(i, c) == num){
                System.out.println("input is invalid. it exists in the same row");     //for debugging
                return false;
            }
        }

        //checking column
        for(int r = 0; r < 9; r++){
            if(board.getBlock(r, j) == num){
                System.out.println("input is invalid. it exists in the same column");     //for debugging
                return false;
            }
        }

        //checking the 3x3 blocks
        //these 4 variables set the 3x3 block around the block being validated
        int floorI = (i/3) * 3;
        int ceilI  = ((i/3) + 1) * 3;
        int floorJ = (j/3) * 3;
        int ceilJ  = ((j/3) + 1) * 3;

        for(int r = floorI; r < ceilI; r++){
            for(int c = floorJ; c < ceilJ; c++) {
                if(board.getBlock(r,c) == num){
                    System.out.println("input is invalid. it exists in the same block");        //for debugging
                    return false;
                }
            }
        }
        System.out.println("this was valid");       //for debugging
        return true;
    }




}
