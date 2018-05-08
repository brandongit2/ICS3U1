/***
 * Brandon Tsang
 * April 19, 2018
 * Assignment 18.7a: Loop exercises 4 part 7a
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;

public class TsangB_Asgn18_7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        while (number != 1) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
        }
        System.out.println(number);
    }
}
