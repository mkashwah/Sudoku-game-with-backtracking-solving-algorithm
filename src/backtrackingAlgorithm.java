import java.util.ArrayList;
import java.util.LinkedList;

public class backtrackingAlgorithm {

    sudokuBoard board;
    LinkedList<boardCell> zeroCells = new LinkedList<>();
    /**
     * Default constructor taking board object as parameter
     * @param board of sudokuBoard type. To be used across the algorithm.
     */
    public backtrackingAlgorithm(sudokuBoard board){
        this.board = board;
    }

    public void findZeros(){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board.getBlock(i,j) == 0){
                    System.out.println("found zero at " + i + " " + j);
                }
            }
        }
    }




}
