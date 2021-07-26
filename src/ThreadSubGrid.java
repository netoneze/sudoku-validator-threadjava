public class ThreadSubGrid extends Thread{
    public int row;
    public int column;
    public ThreadSubGrid(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public void run() {
        SudokuValidador.validateBox(row, column);
    }

}
