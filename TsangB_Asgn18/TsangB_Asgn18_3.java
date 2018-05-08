/***
 * Brandon Tsang
 * April 19, 2018
 * Assignment 18.3: Loop exercises 4 part 3
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;

public class TsangB_Asgn18_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        while (!isPrime(number)) {
            for (int i = 2; true; i++) {
                if (isPrime(i) && number % i == 0) {
                    System.out.print(i + " ");
                    number /= i;
                    break;
                }
            }
        }
        System.out.println(number);
    }

    public static boolean isPrime(int a) {
        if (a == 2) {
            return true;
        }
        if (a <= 2 || a % 2 == 0) {
            return false;
        }
        for (int i = 3; i < a; i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
