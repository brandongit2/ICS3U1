/***
 * Brandon Tsang
 * April 19, 2018
 * Assignment 18.5b: Loop exercises 4 part 5b
 * ICS3U1-07 | Ms. Strelkovska
 */

public class TsangB_Asgn18_5b {
    public static void main(String[] args) {
        for (int i = 0; i <= 9999; i++) {
            String[] n_s = ("" + i).split("");
            int[] n = new int[n_s.length];

            // Converts String[] n_s to int[] n
            for (int j = 0; j < n_s.length; j++) {
                n[j] = Integer.parseInt(n_s[j]);
            }

            int sum = 0;
            for (int k : n) {
                sum += Math.pow(k, 3);
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
