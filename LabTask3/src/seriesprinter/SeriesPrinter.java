package seriesprinter;
public class SeriesPrinter {
    int i;
    void printSeries(int n) {

        for (i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    void printSeries(int startIndex, int endtIndex) {

        for (i = startIndex; i <= endtIndex; i++) {
            System.out.print(i + " ");
        }
    }

    void printSeries(int startIndex, int endtIndex, int interval) {

        for (i = startIndex; i <= endtIndex; i = i + interval) {

            System.out.print(i + " ");

        }
    }
}
