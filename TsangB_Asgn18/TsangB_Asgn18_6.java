/***
 * Brandon Tsang
 * April 19, 2018
 * Assignment 18.6: Loop exercises 4 part 6
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;

public class TsangB_Asgn18_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:  ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = number1; i > 0; i--) {
            if (number1 % i == 0) {
                divisors.add(i);
            }
        }

        for (Integer divisor : divisors) {
            if (number2 % divisor == 0) {
                System.out.println("The greatest common divisor is " + divisor);
                return;
            }
        }
    }
}
