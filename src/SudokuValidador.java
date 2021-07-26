public class SudokuValidador {

    private static final int GRID_SIZE = 9;
    private static int verifier = 0;
    private static final int[][] board = {
            {2, 3, 7, 8, 4, 1, 5, 6, 9},
            {1, 8, 6, 7, 9, 5, 2, 4, 3},
            {5, 9, 4, 3, 2, 6, 7, 1, 8},
            {3, 1, 5, 6, 7, 4, 8, 9, 2},
            {4, 6, 9, 5, 8, 2, 1, 3, 7},
            {7, 2, 8, 1, 3, 9, 4, 5, 6},
            {6, 6, 2, 9, 1, 8, 3, 7, 5},
            {8, 5, 3, 4, 6, 7, 9, 2, 1},
            {9, 7, 1, 2, 5, 3, 6, 8, 4},
    };

    //Procura número na linha, indo coluna por coluna
    private static boolean verifyRow(int number, int row){
        for(int i = 0 ; i < GRID_SIZE ; i++){
            if(board[row][i] == number){
                verifier++;
            }
        }
        return verifier > 1;
    }

    //Procura número na coluna, indo linha por linha
    private static boolean verifyColumn(int number, int column){
        for(int i = 0 ; i < GRID_SIZE ; i++){
            if(board[i][column] == number){
                verifier++;
            }
        }
        return verifier > 1;
    }

    //Procura número na caixa 3x3, a partir da primeira linha/coluna da mesma
    private static boolean verifyBox(int number, int row, int column){
        for (int i = row ; i < row + 3 ; i++) {
            for (int j = column ; j < column + 3 ; j++) {
                if (board[i][j] == number) {
                    verifier++;
                }
            }
        }
        return verifier > 1;
    }

    //Valida o sudoku pela linha
    public synchronized static void validateRow(){
        for(int i = 0 ; i < GRID_SIZE ; i++){
            for(int j = 0 ; j < GRID_SIZE ; j++){
                if (verifyRow(board[i][j], i)){
                    System.out.println("Sudoku inválido");
                    System.out.println("O número " + board[i][j] + " repete na linha " + (i+1));
                    verifier = 0;
                    return;
                }
                verifier = 0;
            }
        }
        System.out.println("Sudoku válido no quesito linha!");
    }

    //Valida o sudoku pela coluna
    public synchronized static void validateColumn(){
        for(int i = 0 ; i < GRID_SIZE ; i++){
            for(int j = 0 ; j < GRID_SIZE ; j++){
                if (verifyColumn(board[j][i], j)){
                    System.out.println("Sudoku inválido");
                    System.out.println("O número " + board[j][i] + " repete na coluna " + (j+1));
                    verifier = 0;
                    return;
                }
                verifier = 0;
            }
        }
        System.out.println("Sudoku válido no quesito coluna!");
    }

    //Valida a caixa 3x3 de acordo com a linha/coluna dada
    public synchronized static void validateBox(int row, int column){
        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                if (verifyBox(board[i][j], row, column)){
                    System.out.println("Sudoku inválido");
                    System.out.println("O número " + board[i][j] + " repete no quadro 3x3 que começa na linha " + (row+1) + " coluna " + (column+1));
                    verifier = 0;
                    return;
                }
                verifier = 0;
            }
        }
        System.out.println("Sudoku válido no quesito grid 3x3 que começa na linha " + (row+1) + " coluna " + (column+1));
    }

}
