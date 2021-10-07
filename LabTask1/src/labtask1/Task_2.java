package labtask1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Please Enter Size of the array: ");
        n = input.nextInt();

        int[] ARR = new int[n];
        int pos = 0, neg = 0;

        System.out.print("Please Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            ARR[i] = input.nextInt();

            if (ARR[i] >= 0) {
                pos++;
            }
            if (ARR[i] < 0) {
                neg++;
            }
        }
        System.out.println("Positive number are: " + pos);
        System.out.println("Negative number are: " + neg);
    }
}
