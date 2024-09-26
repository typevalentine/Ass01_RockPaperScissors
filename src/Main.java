import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String play1 = "";
        String play2 = "";

        System.out.print("Player 1 enter your move [RPS]: ");
        play1 = in.nextLine();
        System.out.print("Player 2 enter your move [RPS]: ");
        play2 = in.nextLine();
        System.out.println("Player 1 plays: " + play1 + " Player 2 plays: " + play2);

        if (play1.equalsIgnoreCase("R"))
        {
            if (play2.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock! It's a Tie!");
            }
            else if (play2.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock! Player 2 wins!");
            }
            else if (play2.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors! Player 1 wins!");
            }
        }

        else if (play1.equalsIgnoreCase("P"))
        {
            if (play2.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock! Player 1 wins");
            }
            else if (play2.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Paper! It's a Tie!");
            }
            else if (play2.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors cuts Paper! Player 2 wins!");
            }
        }

        else if (play1.equalsIgnoreCase("S"))
        {
            if (play2.equalsIgnoreCase("R"))
            {
                System.out.println("Rocks breaks Scissors! Player 2 wins!");
            }
            else if (play2.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper! Player 1 wins!");
            }
            else if (play2.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors vs Scissors! It's a Tie!");
            }
        }
        else
            System.out.println("Invalid move! Run the program again!");
    }
}
