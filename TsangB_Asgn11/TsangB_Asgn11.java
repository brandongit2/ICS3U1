/***
 * Brandon Tsang
 * March 2, 2018
 * Assignment 11: Rock Paper Scissors (Lizard Spock)
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;

public class TsangB_Asgn11 {
    public static void main(String[] args) {
        game:
        while (true) {
            Scanner sc = new Scanner(System.in);

            String[] items = {"rock", "paper", "scissors", "lizard", "spock"};
            Map<String, List<String>> plays = new HashMap<String, List<String>>();
            plays.put(items[0], Arrays.asList("scissors", "lizard"));
            plays.put(items[1], Arrays.asList("rock", "spock"));
            plays.put(items[2], Arrays.asList("paper", "lizard"));
            plays.put(items[3], Arrays.asList("paper", "spock"));
            plays.put(items[4], Arrays.asList("rock", "scissors"));

            System.out.println("Rock     - rock, R, r");
            System.out.println("Paper    - paper, P, p");
            System.out.println("Scissors - scissors, SC, Sc, sc");
            System.out.println("Lizard   - lizard, L, l");
            System.out.println("Spock    - spock, SP, Sp, sp");

            String play = "";
            while (true) {
                System.out.print("Enter your throw: ");
                play = sc.nextLine().toLowerCase().trim();

                if (play.equals("rock") || play.equals("Rock") || play.equals("R") || play.equals("r")) {
                    play = "rock";
                    break;
                } else if (play.equals("paper") || play.equals("Paper") || play.equals("P") || play.equals("p")) {
                    play = "paper";
                    break;
                } else if (play.equals("scissors") || play.equals("Scissors") || play.equals("SC") || play.equals("Sc") || play.equals("sc")) {
                    play = "scissors";
                    break;
                } else if (play.equals("lizard") || play.equals("Lizard") || play.equals("L") || play.equals("l")) {
                    play = "lizard";
                    break;
                } else if (play.equals("spock") || play.equals("Spock") || play.equals("SP") || play.equals("Sp") || play.equals("sp")) {
                    play = "spock";
                    break;
                } else {
                    System.out.println("Invalid throw. Try again.");
                }
            }

            String compPlay = items[(int) (Math.random() * 5)];
            System.out.println("\nYou threw " + play + ".");
            System.out.println("The computer threw " + compPlay + ".");

            List<String> win = plays.get(play); // A List containing the computer's throws which would cause the player to win
            if (compPlay.equals(win.get(0)) || compPlay.equals(win.get(1))) {
                System.out.println("You win!");
            } else if (play.equals(compPlay)) {
                System.out.println("Tie!");
            } else {
                System.out.println("You lose!");
            }

            while (true) {
                System.out.print("Do you want to play again? (Y/N) ");
                String answer = sc.nextLine().toLowerCase().trim();
                if (answer.equals("yes") || answer.equals("y") || answer.equals("yep") || answer.equals("yea") || answer.equals("heck yes") || answer.equals("hecc yes") || answer.equals("hell yea") || answer.equals("hell yeah") || answer.equals("of course")) {
                    System.out.println("");
                    continue game;
                } else if (answer.equals("no") || answer.equals("n") || answer.equals("nope") || answer.equals("not really") || answer.equals("nah") || answer.equals("i would really rather not")) {
                    break game;
                } else {
                    System.out.println("Invalid answer. Please try again.");
                }
            }
        }
    }
}
