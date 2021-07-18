import java.util.Scanner;


class games
{
    int game_id, gameno1, gameno2, gameno3, price, total_no_of_games; String gamefranchise;
    Scanner s=new Scanner(System.in);

    void data()
    {
        Scanner s=new Scanner(System.in);
        Scanner v=new Scanner(System.in);
        System.out.println("Enter the game ID and game name");
        game_id=s.nextInt();
        gamefranchise=v.next();
    }
    void data_display()
    {
        System.out.println("game id " + game_id);
        System.out.println("game franchise is   "+ gamefranchise);
    }
}

class game_company extends  games
{
    void games_no()
    {
        System.out.println("Enter the game no");
        gameno1=s.nextInt();
        gameno2=s.nextInt();
        gameno3=s.nextInt();
    }

}

class shop extends game_company
{
    void games_data_process()
    {
        total_no_of_games = gameno1 + gameno2 + gameno3;
    }
    void games_data_display()
    {
        System.out.println("gameno 1 "+ gameno1);
        System.out.println("gameno 2 "+ gameno2);
        System.out.println("gameno 3 "+ gameno3);
        System.out.println("total no of games is " + total_no_of_games);
    }
    void game_price()
    {
        System.out.println("Enter the price");
        price =s.nextInt();
    }
    void display_price_details()
    {
        System.out.println("Each game price is " + price);
    }
}


public class Multi_level_Inheritance {
    public static void main(String[]x)
    {
        shop g=new shop();
        g.data();
        g.data_display();
        g.games_no();
        g.games_data_process();
        g.games_data_display();
        g.game_price();
        g.display_price_details();

    }
}
