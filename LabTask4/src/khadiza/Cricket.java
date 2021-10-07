
package khadiza;

public class Cricket extends Sports {
    /*
        Name: Khadiza Akther.
        ID: 2012020295.
        Section: 5F.
        Email: cse_2012020295@lus.ac.bd
        Date: 10/09/2021
    */
    
    String matchType;
    int matchOver;
    Player player;
    
    Cricket(String matchType, int matchOver, Player player){
        
        this.matchType = matchType;
        this.matchOver = matchOver;
        this.player = player;
    }
    void display(){
        System.out.println("Match Type: "+matchType);
        System.out.println("Match Over: "+matchOver);
        System.out.println("Player Name: "+player.playerName);
        System.out.println("Jersey Number: "+player.jerseyNumber);
    }
}
