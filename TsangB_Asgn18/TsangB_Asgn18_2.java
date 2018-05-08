/***
 * Brandon Tsang
 * April 19, 2018
 * Assignment 18.2: Loop exercises 4 part 2
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.Scanner;

public class TsangB_Asgn18_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:  ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        outerLoop:
        for (int i = number1; i <= number2; i++) {
            if (i != 2) {
                if (i <= 2 || i % 2 == 0) {
                    continue;
                }
                for (int j = 3; j < i; j += 2) {
                    if (i % j == 0) {
                        continue outerLoop;
                    }
                }
            }
            System.out.println(i);
        }
    }
}
