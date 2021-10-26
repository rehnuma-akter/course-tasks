package rehnuma;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;

    Cricket(String matchType,int over,Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player=player;
    }

    void display()
    {
        System.out.println("Match Type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+player.playerName);
        System.out.println("Jersey Number: "+player.jerseyNumber);

    }

}

/*
Name: Rehnuma Akter Ruhi
ID: 2012020052
Section: B
Email: cse_2012020052@lus.ac.bd
Date: 11-09-2021
*/


