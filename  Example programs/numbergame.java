 public class  numbergame {
    static final int SIZE = 9;
    // Function to print Sudoku board
    static void printBoard(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Check if number is safe to place
    static boolean isSafe(int[][] board, int row, int col, int num) {

        // Check row
        for (int x = 0; x < SIZE; x++) {
            if (board[row][x] == num)
                return false;
        }

        // Check column
        for (int x = 0; x < SIZE; x++) {
            if (board[x][col] == num)
                return false;
        }

        // Check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num)
                    return false;
            }
        }

        return true;
    }

    // Solve Sudoku using Backtracking
    static boolean solveSudoku(int[][] board) {

        int row = -1;
        int col = -1;
        boolean emptyFound = false;

        // Find empty cell
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyFound = true;
                    break;
                }
            }
            if (emptyFound)
                break;
        }

        // No empty cell means solved
        if (!emptyFound)
            return true;

        // Try numbers 1 to 9
        for (int num = 1; num <= 9; num++) {

            if (isSafe(board, row, col, num)) {

                board[row][col] = num;

                // Recursive call
                if (solveSudoku(board))
                    return true;

                // Backtrack
                board[row][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] board = {
            {3,1,6,5,7,8,4,9,2},
            {5,2,9,1,3,4,7,6,8},
            {4,8,7,6,2,9,5,3,1},
            {2,6,3,4,1,5,9,8,7},
            {9,7,4,8,6,3,1,2,5},
            {8,5,1,7,9,2,6,4,3},
            {1,3,8,9,4,7,2,5,6},
            {6,9,2,3,5,1,8,7,4},
            {7,4,5,2,8,6,3,1,9}
        };

        if (solveSudoku(board)) {
            System.out.println("Solved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}