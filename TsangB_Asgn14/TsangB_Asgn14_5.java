/***
 * Brandon Tsang
 * March 28, 2018
 * Assignment 14.5: Loop exercises part 5
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.Scanner;

public class TsangB_Asgn14_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("The sum of the numbers from 1 to " + input + " is " + sum + ".");
    }
}
