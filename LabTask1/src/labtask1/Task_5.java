package labtask1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Please enter the size of array: ");
        n = input.nextInt();

        int[] ARR = new int[n];

        System.out.print("Please Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            ARR[i] = input.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int Search_value, cnt = 0;
        Search_value = input.nextInt();

        for (int X : ARR) {
            if (Search_value == X) {
                cnt++;
            }
        }
        System.out.println(Search_value + " occured " + cnt + " times in the array.");
    }
}
