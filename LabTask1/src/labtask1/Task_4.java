package labtask1;

import java.util.Scanner;

public class Task_4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int choice;
        int num1, num2, result;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.println("1. Addition (+).\n2. Subtraction (-).");
        System.out.println("3. Multiplication (*).\n4. Division (/).\n");

        System.out.print("Enter operation number: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case 4:
                float result2 = (float) num1 / num2;
                System.out.println("The result is: " + result2);
                break;
            default:
                System.out.println("Wrong Choice Input.");
        }

    }
}
