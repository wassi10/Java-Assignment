package ClassAndObject;

public class BillCalculator {

    double cal_unit, surcharge = 0;

    double calculateBasicBill(double unit) {

        if (unit <= 199) {
            cal_unit = unit * 1.20;
        } else if (unit >= 200 && unit < 400) {
            cal_unit = unit * 1.50;
        } else if (unit >= 400 && unit < 600) {
            cal_unit = unit * 1.80;
        } else if (unit > 600) {
            cal_unit = unit * 2.00;
        }
        if (cal_unit < 100) {
            return 100;
        } else {
            return cal_unit;
        }
    }

    double calculateSurcharge(double basicBill) {

        return surcharge = (basicBill * 0.15);
    }

    double getTotalBill(double unit) {
        
        double basic_bill = calculateBasicBill(unit);
        
        if (basic_bill > 300) {
            double amountOfsurcharge =  calculateSurcharge(basic_bill);
            double total_bill = basic_bill + amountOfsurcharge;
            return total_bill;
        }
        return basic_bill;
    }
}
