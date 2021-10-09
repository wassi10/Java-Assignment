
package task_05;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{
    /*
        Name: Khadiza Akther.
        ID: 2012020295.
        Section: 5F.
        Email: cse_2012020295@lus.ac.bd
        Date: 09/10/2021
    */
    @Override 
	public int divisorSum(int n){
		int allSum = 1;
		
		for(int i=1; i<=n/2; i++){
			if(n % i == 0){
				allSum += n / i;
			}
		}
		return allSum;
	}
	
	@Override
	public BigInteger findFactorial(int n){
		BigInteger fac = BigInteger.ONE;

		for(int i=2; i<=n; i++){
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
	}
}
