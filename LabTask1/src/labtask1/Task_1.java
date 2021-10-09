package labtask1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter final value: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Sum: " + sum);
    }
}
