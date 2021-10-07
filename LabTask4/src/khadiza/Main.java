
package khadiza;

public class Main {
    /*
        Name: Khadiza Akther.
        ID: 2012020295.
        Section: 5F.
        Email: cse_2012020295@lus.ac.bd
        Date: 10/09/2021
    */
    public static void main(String[] args) {
      
        Player player = new Player("Shakib", 75);       
       Cricket cricket = new  Cricket("International match", 20, player);
       cricket.display();
       Football football = new Football();
        
        
       
    }
}
