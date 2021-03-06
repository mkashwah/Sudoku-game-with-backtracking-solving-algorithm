public class sudokuGame {
    int n = 5;

    public void changeN(){
        n = 3;
    }

    public static void main(String[] args) {
        //testing board creation and printing

        //create multidimensional array 9x9 to hold the values of the board
        int[][] sudoku = {{0,8,0,9,0,0,5,0,0},
                          {0,0,9,0,0,5,0,4,6},
                          {0,5,0,0,0,0,0,1,3},
                          {3,1,0,0,0,0,0,7,0},
                          {0,0,0,0,3,6,0,0,4},
                          {0,0,0,0,0,0,0,8,0},
                          {6,0,0,2,0,0,0,0,0},
                          {0,0,0,6,0,3,0,9,5},
                          {7,0,0,0,0,1,0,0,0}};

        //create ref to sudokuBoard object
        sudokuBoard board = new sudokuBoard(sudoku);

        //testing printboard()
        board.printBoard();

//        //testing board.setBlock()
//        board.setBlock(1,2,5);
//        board.printBoard();

//        //testing backtrackingAlgorithm.findZeros()
        backtrackingAlgorithm bktrk = new backtrackingAlgorithm(board);
//        System.out.println(bktrk.zeroCellsSize);
        bktrk.backtrack();
        board.printBoard();

//        bktrk.findZeros();
//        bktrk.printLinkedList();

        //testing isValid()
//        bktrk.isValid(0,4,9);
//        bktrk.isValid(1,4,3);
//        bktrk.isValid(1,3,3);
//        bktrk.isValid(1, 6, 2);
//        bktrk.isValid(0,7,2);
//        bktrk.isValid(3,4,6);
//        bktrk.isValid(3,6,6);
//        bktrk.isValid(3,8,6);
//        board.printBoard();









    }
}
