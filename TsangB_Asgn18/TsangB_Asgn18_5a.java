/***
 * Brandon Tsang
 * April 19, 2018
 * Assignment 18.5a: Loop exercises 4 part 5a
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.Scanner;

public class TsangB_Asgn18_5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        String[] number_s = sc.nextLine().split("");
        int[] number = new int[number_s.length];

        // Converts String[] number_s to int[] number
        for (int s = 0; s < number_s.length; s++) {
            number[s] = Integer.parseInt(number_s[s]);
        }

        int sum = 0;
        for (int i : number) {
            sum += Math.pow(i, 3);
        }

        System.out.println("The sum of the cubes of the digits is " + sum);
    }
}
