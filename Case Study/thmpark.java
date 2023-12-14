/* Define an abstract class ‘Themepark’ and inherit 2 classes ‘Queensland’ and ‘Wonderla’ from the abstract class.
In both the theme parks, the entrance fee for adults is Rs. 500 and for children it is Rs. 300.
If a family buys ‘n’ adult tickets and ‘m’ children tickets, define a method in the abstract class
to calculate the total cost. Also, declare an abstract method playGame() which must be redefined in the subclasses.
In Queensland, there are a total of 30 games. Hence, create a Boolean array named ‘Games’ of size 30
which initially stores false values for all the elements. If the player enters any game code that has already been played,
a warning message should be displayed and the user should be asked for another choice. In Wonderla, there are a total of 40 different games.
Thus create an integer array with 40 elements.Here, the games can be replayed, until the user wants to quit.
Finally, display the total count of games that were repeated and count of the games which were not played at all.       */

import java.util.Scanner;
import java.util.Arrays;

abstract class Themepark{
    public static int total_cost(int adultTickets, int childTickets){
        return 500 * adultTickets + 300 * childTickets;
    }
    abstract void playGame();
}
class Queensland extends Themepark{
    public void playGame(){
        Scanner in = new Scanner(System.in);
        boolean[] Games = new boolean[30];
        Arrays.fill(Games, false);
        boolean keepPlaying=true;
        while(keepPlaying){
            System.out.println("which game do you want to play? (1-30). 0 to quit");
            if(in.hasNextInt()){ // check if there is an integer input
                int game=in.nextInt();
                if(game==0) keepPlaying=false;
                else if(game>30 || game<1)  System.out.println("please input valid number");
                else if(Games[game]) System.out.println("Warning! play each game at most once.");
                else{
                    System.out.println("Successfully played game " + game);
                    Games[game]=true;
                }
            }
            else{ // handle invalid input
                System.out.println("please input a valid number");
                in.next(); // consume the invalid input
            }
        }
    }
}
class Wonderla extends Themepark{
    public void playGame(){
        int[] Games;
        try (Scanner in = new Scanner(System.in)) {
            Games = new int[40];
            Arrays.fill(Games, 0);
            boolean keepPlaying = true;
            while (keepPlaying) {
                System.out.println("which game do you want to play? (1-40). 0 to quit");
                if(in.hasNextInt()){ // check if there is an integer input
                    int game = in.nextInt();
                    if (game == 0) {
                        keepPlaying = false;
                    } else if (game > 40 || game < 1) {
                        System.out.println("Please input a valid number");
                    } else {
                        System.out.println("Successfully played game " + game);
                        Games[game]++;
                    }
                }
                else{ // handle invalid input
                    System.out.println("please input a valid number");
                    in.next(); // consume the invalid input
                }
            }
        }
        System.out.println("Games repeated in Wonderland = ");
        for (int i = 0; i < 40; i++) {
            if (Games[i] > 1) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nGames not played in Wonderland = ");
        for (int i = 0; i < 40; i++) {
            if (Games[i] == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nGames played once in Wonderland = ");
        for (int i = 0; i < 40; i++) {
            if (Games[i] == 1) {
                System.out.print(i + ", ");
            }
        }
    }
}
public class thmpark{
    public static void main(String[] args) {
        int adultTickets, childTickets;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter number of adult tickets: ");
            adultTickets = in.nextInt();
            System.out.println("Enter number of child tickets: ");
            childTickets = in.nextInt();

            int total_cost = Themepark.total_cost(adultTickets, childTickets);
            System.out.println("Total cost = " + total_cost);
            Themepark[] parks = {new Queensland(), new Wonderla()};
            for(Themepark park: parks) {
                System.out.println(park.getClass().getSimpleName());
                park.playGame();
            }
        }
    }
}