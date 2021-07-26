public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadColuna threadcoluna = new ThreadColuna();
        ThreadLinha threadlinha = new ThreadLinha();
        ThreadSubGrid threadubgrid1 = new ThreadSubGrid(0,0);
        ThreadSubGrid threadubgrid2 = new ThreadSubGrid(0,3);
        ThreadSubGrid threadubgrid3 = new ThreadSubGrid(0,6);
        ThreadSubGrid threadubgrid4 = new ThreadSubGrid(3,0);
        ThreadSubGrid threadubgrid5 = new ThreadSubGrid(3,3);
        ThreadSubGrid threadubgrid6 = new ThreadSubGrid(3,6);
        ThreadSubGrid threadubgrid7 = new ThreadSubGrid(6,0);
        ThreadSubGrid threadubgrid8 = new ThreadSubGrid(6,3);
        ThreadSubGrid threadubgrid9 = new ThreadSubGrid(6,6);

        threadcoluna.start();
        threadlinha.start();
        threadubgrid1.start();
        threadubgrid2.start();
        threadubgrid3.start();
        threadubgrid4.start();
        threadubgrid5.start();
        threadubgrid6.start();
        threadubgrid7.start();
        threadubgrid8.start();
        threadubgrid9.start();
    }
}
