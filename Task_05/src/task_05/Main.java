
package task_05;

import java.math.BigInteger;

public class Main {
    /*
        Name: Khadiza Akther.
        ID: 2012020295.
        Section: 5F.
        Email: cse_2012020295@lus.ac.bd
        Date: 09/10/2021
    */
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();

		int x = obj.divisorSum(6);
		BigInteger y = obj.findFactorial(4);

		System.out.println("Divisor sum: "+x);
		System.out.println("Factorial: "+y);
    }
}
