/***
 * Brandon Tsang
 * 2018
 * Brandon's Utils Class
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.*;

public class Butils {
    public static void print(Object str) {
        System.out.print(str);
    }

    public static void println(Object str) {
        System.out.println(str);
    }

    public static void printf(String str, Object... args) {
        System.out.printf(str, args);
    }

    /***
     * Requests input from the user.
     * Identical to input() in Python.
     *
     * @return One line of user input.
     */
    public static String input() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    /***
     * Prints a given string, then immediately requests input from the user.
     * Identical to input() in Python.
     *
     * @param str The string to be printed.
     * @return One line of user input.
     */
    public static String input(String str) {
        print(str);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    /***
     * Prints a given string, then immediately requests input from the user.
     * Gets first integer entered.
     *
     * @param str The string to be printed.
     * @return The first integer entered.
     */
    public static int inputInt(String str) {
        print(str);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    /***
     * Prints a given string, then immediately requests input from the user.
     * Gets first double entered.
     *
     * @param str The string to be printed.
     * @return The first double entered.
     */
    public static double inputDouble(String str) {
        print(str);
        Scanner s = new Scanner(System.in);
        return s.nextDouble();
    }

    /***
     * Validates strings using given regex.
     *
     * @param str   The string to be validated.
     * @param regex The regex code to check against.
     * @return str, if validation passes.
     */
    public static String validate(String str, String regex) throws InvalidInputException {
        if (regex(str, regex)) {
            return str;
        } else {
            throw new InvalidInputException("Invalid input.");
        }
    }

    public static boolean regex(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    /***
     * Gets user input and validates it immediately, outputting a String. Equivalent to input() then validate().
     *
     * @param msg   The message prompting user input.
     * @param regex The regex to check input against.
     */
    public static String validateInput(String msg, String regex) throws InvalidInputException {
        String in = validate(input(msg), regex);
        return in;
    }

    public static double numInput(String msg) throws InvalidInputException {
        String input = validateInput(msg, "^-?[0-9]+(\\.[0-9]+)?$");
        return Double.parseDouble(input);
    }

    public static ArrayList<Double> spaceSepNumInput(String msg, int len) throws InvalidInputException {
        String in = validateInput(msg, "^(-?[0-9]+(\\.[0-9]+)? |-?[0-9]+(\\.[0-9]+)?)+$");
        String[] array_s = in.split(" ");
        ArrayList<Double> array_d = new ArrayList<>();
        for (String a : array_s) {
            array_d.add(Double.parseDouble(a));
        }
        if (array_d.size() == len) {
            return array_d;
        } else {
            throw new InvalidInputException("Please enter only two numbers.");
        }
    }

    public static class InvalidInputException extends Exception {
        /***
         * A generic exception.
         *
         * @param message The message to be printed.
         */
        public InvalidInputException(String message) {
            super(message);
        }
    }
}
