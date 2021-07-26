public class ThreadColuna extends Thread{
    @Override
    public void run() {
        SudokuValidador.validateColumn();
    }
}
