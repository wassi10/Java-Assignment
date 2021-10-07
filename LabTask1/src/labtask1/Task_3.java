package labtask1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer number : ");
        int n = input.nextInt();
        int i, j; // i = row; j = coloum

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.printf("%d", j);
            }
            System.out.println();
        }

    }
}
