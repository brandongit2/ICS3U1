/***
 * Brandon Tsang
 * April 19, 2018
 * Assignment 18.7b: Loop exercises 4 part 7b
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;

public class TsangB_Asgn18_7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        String[] numbers = sc.nextLine().split(" ");
        int number1 = Integer.parseInt(numbers[0]);
        int number2 = Integer.parseInt(numbers[1]);

        ArrayList<Integer> maxima = new ArrayList<>();

        for (int number = number1; number <= number2; number++) {
            ArrayList<Integer> hailstone = new ArrayList<>();

            int i = number;
            while (i != 1) {
                hailstone.add(i);

                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = i * 3 + 1;
                }
            }

            maxima.add(hailstone.size());
        }

        int max = Collections.max(maxima);
        for (int i = 0; i < maxima.size(); i++) {
            if (maxima.get(i) == max) {
                System.out.println("It took the number " + (i + number1) + " " + max + " iterations to reach 4, 2, 1. Here is the series:");

                // Recalculate hailstone numbers
                int j = i + number1;
                while (j != 1) {
                    System.out.print(j + " ");

                    if (j % 2 == 0) {
                        j /= 2;
                    } else {
                        j = j * 3 + 1;
                    }
                }
                System.out.println(j + "\n");
            }
        }
    }
}
