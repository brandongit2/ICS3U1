/***
 * Brandon Tsang
 * April 24, 2018
 * Assignment 19: String game exercise - Doublets
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.Scanner;

public class TsangB_Asgn19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting word: ");
        String word1 = sc.nextLine();
        while (true) {
            System.out.print("Enter the next word:     ");
            String word2 = sc.nextLine();
            if (word1.length() != word2.length()) {
                System.out.println("The lengths of the two words don't match.");
                break;
            } else if (word1.equals(word2)) {
                System.out.println("The two words are the same.");
                break;
            }
            int lettersChanged = 0;
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) != word2.charAt(i)) {
                    lettersChanged++;
                }
            }
            if (lettersChanged > 1) {
                System.out.println("Incorrect");
                break;
            } else {
                System.out.println("Correct");
            }
            word1 = word2;
        }
        System.out.println("Bye.");
    }
}
