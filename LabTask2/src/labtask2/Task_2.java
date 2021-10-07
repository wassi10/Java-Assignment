package labtask2;

public class Task_2 {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.tittle = "JAVA for Beginners";
        book1.edition = "3rd";
        book1.author = "Prof. David";
        book1.page = 537;
        book1.price = 299;
        book1.publication = "Easy Coding Publications";
        book1.showInfo();
        System.out.println("Address for Book1: " + book1);
        System.out.println();
        Book book2 = new Book();

        book2.tittle = "Omega Point";
        book2.edition = "12th";
        book2.author = "Humayun Ahmed";
        book2.page = 122;
        book2.price = 128;
        book2.publication = "Shomoy Prokashoni";
        book2.showInfo();
        System.out.println("Address for Book2: " + book2);
        System.out.println();
        Book book3 = new Book();

        book3.tittle = "Digital Fortress";
        book3.edition = "5th";
        book3.author = "Dan Brown";
        book3.page = 356;
        book3.price = 520;
        book3.publication = "St. Martin Press";
        book3.showInfo();
        System.out.println("Address for Book3: " + book3);
        System.out.println();

        book1 = book3;
        book1.showInfo();
        System.out.println(book1);
        System.out.println();

        book1 = book3;
        book1.edition = "1st";
        book3.showInfo();
        System.out.println(book3);
    }
}
