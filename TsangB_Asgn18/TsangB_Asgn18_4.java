/***
 * Brandon Tsang
 * April 19, 2018
 * Assignment 18.4: Loop exercises 4 part 4
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.Scanner;

public class TsangB_Asgn18_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        String[] number = sc.nextLine().split("");

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);
        }
    }
}
