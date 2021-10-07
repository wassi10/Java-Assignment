package seriesprinter;

public class Task_2 {

    public static void main(String[] args) {

        SeriesPrinter series1 = new SeriesPrinter();
        series1.printSeries(5);
        System.out.println();

        SeriesPrinter series2 = new SeriesPrinter();
        series2.printSeries(5, 10);
        System.out.println();

        SeriesPrinter series3 = new SeriesPrinter();
        series3.printSeries(5, 15, 3);
        System.out.println();
    }
}
