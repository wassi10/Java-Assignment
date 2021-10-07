package labtask2;

public class Book {

    String tittle, author, edition;
    int page, price;
    String publication;

    void showInfo() {
        System.out.println(tittle+", "+edition+" Edition");
        System.out.println("By " + author);
        System.out.println(page + " pages");
        System.out.println("Price: " + price+" tk");
        System.out.println(publication);
    }
}
