package ClassAndObject;

public class Task_3 {

    public static void main(String[] args) {
        
        BillCalculator bill_calculator = new BillCalculator();
        double result1 = bill_calculator.getTotalBill(25);
        System.out.println("Total Bill for 25 unit: "+result1);
        
        double result2 = bill_calculator.getTotalBill(250);
        System.out.println("Total Bill for 250 unit: "+result2);
        
        double result3 = bill_calculator.getTotalBill(812);
        System.out.println("Total Bill for 812 unit: "+result3);
    }
}
