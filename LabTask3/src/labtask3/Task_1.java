package labtask3;

public class Task_1 {

    public static void main(String[] args) {

        SmartPhone phone1 = new SmartPhone("iPhone X", 256, 69990.9);
        phone1.displayInfo();
        System.out.println();
        
        SmartPhone phone2 = new SmartPhone("Samsung S8", 57999.99);
        phone2.displayInfo();
        System.out.println();
        
        SmartPhone phone3 = new SmartPhone();
        phone3.displayInfo();
        System.out.println();
    }
}
