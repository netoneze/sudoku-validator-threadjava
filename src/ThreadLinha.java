public class ThreadLinha extends Thread{
    @Override
    public void run() {
        SudokuValidador.validateRow();
    }
}
