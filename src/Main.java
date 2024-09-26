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




// RockPaperScissors
//    Main()
//        String play1 = ""
//        String play2 = ""
//
//        do
//            do
//            output "Player 1 enter your move [RPS]: "
//            input play 1
//            output "Player 2 enter your move [RPS]: "
//            input play 2
//            while(play1 !"R","P","S" or play2 !"R","P","S")
//
//        if play1 == "R" then
//            if play2 == "R" then
//                output "Rock vs Rock, It's a TIE!"
//            elseif play2 == "P" then
//                output "Paper covers Rock, Player 2 wins!"
//            else // play 2 is Scissors
//                 output "Rock breaks Scissors, Player 1 wins!"
//            endIf
//        elseif play1 == "P" then
//             if play2 == "R" then
//                output "Paper covers Rock, Player 1 wins!"
//            elseif play2 == "P" then
//                output "Paper vs Paper, It's a TIE!"
//            else // play 2 is Scissors
//                 output "Scissors cuts paper, Player 2 wins!"
//            endIf
//        else // play1 is Scissors
//             if play2 == "R" then
//                output "Rock breaks Scissors, Player 2 wins!"
//            elseif play2 == "P" then
//                output "Scissors cuts Paper, Player 1 wins!"
//            else // play 2 is Scissors
//                 output "Scissors vs Scissors, It's a TIE!"
//            endIf
//        Output "Wanna play again [YN]?: "
//
//        while(!N)
//
//        Output "Thanks for playing!!"
//    return
//endClass