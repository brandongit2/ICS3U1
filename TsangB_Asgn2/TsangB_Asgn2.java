/***
 * Brandon Tsang
 * February 8, 2018
 * Assignment 2: Formatting
 * ICS3U6-07 | Ms. Strelkovska
 */

public class TsangB_Asgn2 {
    public static void main(String[] args) {
        String bar = "---------------";
        System.out.println(String.format("%080d", 0).replace("0", "-"));
        System.out.printf("|%14s|%31s|%31s|\n", "", "SEMESTER 1", "SEMESTER 2");
        System.out.println("|--------------+" + bar + "-" + bar + "-" + bar + "-" + bar + "|");
        System.out.printf("|%14s|%15s|%15s|%15s|%15s|\n", "", "DAY 1", "DAY 2", "DAY 1", "DAY 2");
        System.out.println("|--------------+" + bar + "-" + bar + "-" + bar + "-" + bar + "|");
        System.out.printf("|%14s|%-15s|%-15s|%-15s|%-15s|\n", "PERIOD 1", "SCH3U6-01", "SCH3U6-01", "SPH3U1-05", "SPH3U1-05");
        System.out.printf("|%14s|%-15s|%-15s|%-15s|%-15s|\n", "8:45-10:05 AM", "Mr. Hall", "Mr. Hall", "Ms. Strelkovska", "Ms. Strelkovska");
        System.out.println("|--------------+" + bar + "-" + bar + "-" + bar + "-" + bar + "|");
        System.out.printf("|%14s|%-15s|%-15s|%-15s|%-15s|\n", "PERIOD 2", "ENG3U6-02", "ENG3U6-02", "MCR3U6-06", "MCR3U6-06");
        System.out.printf("|%14s|%-15s|%-15s|%-15s|%-15s|\n", "10:10-11:25 AM", "Ms. Calhoun", "Ms. Calhoun", "Ms. Miron", "Ms. Miron");
        System.out.println("|--------------+" + bar + "-" + bar + "-" + bar + "-" + bar + "|");
        System.out.printf("|%14s|%63s|\n", "LUNCH", "");
        System.out.println("|--------------+" + bar + "-" + bar + "-" + bar + "-" + bar + "|");
        System.out.printf("|%14s|%-15s|%-15s|%-15s|%-15s|\n", "PERIOD 3", "HSP3U1-03", "SBI3U6-04", "ICS3U1-07", "TGJ3M1-08");
        System.out.printf("|%14s|%-15s|%-15s|%-15s|%-15s|\n", "12:30-1:45 PM", "Mr. Czeban", "Ms. Ferreira", "Ms. Strelkovska", "Ms. Matheson");
        System.out.println("|--------------+" + bar + "-" + bar + "-" + bar + "-" + bar + "|");
        System.out.printf("|%14s|%-15s|%-15s|%-15s|%-15s|\n", "PERIOD 4", "SBI3U6-04", "HSP3U1-03", "TGJ3M1-08", "ICS3U1-07");
        System.out.printf("|%14s|%-15s|%-15s|%-15s|%-15s|\n", "1:50-3:05 PM", "Ms. Ferreira", "Mr. Czeban", "Ms. Matheson", "Ms. Strelkovska");
        System.out.println("-" + bar + bar + "-" + bar + "-" + bar + "-" + bar + "-");
    }
}

/*
--------------------------------------------------------------------------------
|              |                     SEMESTER 1|                     SEMESTER 2|
|--------------+-------------------------------+-------------------------------|
|              |          DAY 1|          DAY 2|          DAY 1|          DAY 2|
|--------------+---------------+---------------+---------------+---------------|
|PERIOD 1      |SCH3U6-01      |SCH3U6-01      |SPH3U1-05      |SPH3U1-05      |
|8:45-10:05 AM |Mr. Hall       |Mr. Hall       |Ms. Strelkovska|Ms. Strelkovska|
|--------------+---------------+---------------+---------------+---------------|
|PERIOD 2      |ENG3U6-02      |ENG3U6-02      |MCR3U6-06      |MCR3U6-06      |
|10:10-11:25 AM|Ms. Calhoun    |Ms. Calhoun    |Ms. Miron      |Ms. Miron      |
|--------------+---------------------------------------------------------------|
|LUNCH         |                                                               |
|--------------+---------------------------------------------------------------|
|PERIOD 3      |HSP3U1-03      |SBI3U6-04      |TGJ3M1-07      |ICS3U1-08      |
|12:30-1:45 PM |Mr. Czeban     |Ms. Ferreira   |Ms. Matheson   |Ms. Strelkovska|
|--------------+---------------+---------------+---------------+---------------|
|PERIOD 4      |SBI3U6-04      |HSP3U1-03      |ICS3U1-08      |TGJ3M1-07      |
|1:50-3:05 PM  |Ms. Ferreira   |Mr. Czeban     |Ms. Strelkovska|Ms. Matheson   |
--------------------------------------------------------------------------------
*/
