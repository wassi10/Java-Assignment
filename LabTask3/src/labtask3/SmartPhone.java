package labtask3;
public class SmartPhone {
    String name;
    int internal_storage;
    double price;
    
    SmartPhone() {
        name = "Xiaomi Redmi Note 7";
        internal_storage = 64;
        price = 19999;
    }
    SmartPhone(String name, double price) {
        this.name = name;
        this.price = price;
    }
    SmartPhone(String name, int internal_storage, double price) {
        this.name = name;
        this.internal_storage = internal_storage;
        this.price = price;
    }
    void displayInfo() {
        System.out.println("Smartphone Name: " + name);
        System.out.println("Intertnal storage for this Smartphone : " + internal_storage + " GB");
        System.out.println("Smartphone Price: " + price);
    }
}
