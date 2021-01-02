import java.util.ArrayList;
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
     * The object is then appended to a linked list
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




}
