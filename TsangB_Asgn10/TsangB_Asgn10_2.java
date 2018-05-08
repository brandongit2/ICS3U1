/***
 * Brandon Tsang
 * February 28, 2018
 * Assignment 8.1: If Excercises 2 part 1
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;

public class TsangB_Asgn10_2 extends Butils {
    public static void main(String[] args) {
        int[] nums = new int[3];
        print("You rolled");
        for (int i = 0; i < 3; i++) {
            int num = (int) (Math.random() * 3) + 1;
            nums[i] = num;
            print(" " + num);
        }
        Arrays.sort(nums);
        String nums_s = "";
        for (int i : nums) {
            nums_s += i;
        }
        println(".");
        int tokens = 0;
        if (regex(nums_s, "([0-9])\\1\\1")) {
            tokens = nums[0] * 4;
        } else if (regex(nums_s, "(.)\\1")) {
            tokens = 1;
        } else {
            tokens = 0;
        }
        println("You won " + tokens + " token" + (tokens == 1 ? "" : "s") + ".");
    }
}
