package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = calculateHours(seconds);
        int minutes = calculateMinutes(seconds);
        seconds = seconds%SECONDS_PER_MINUTE;

        System.out.println(hours + zeroAtFront(minutes) + minutes + zeroAtFront(seconds) + seconds);
    }

    //Calculates if given value is a digit
    private static String zeroAtFront(int value) {
        String str = value <=MAX_DIGIT ? ":0":":";
        return str;
    }
    //Calculates  hours display for electronic watch
    private static int calculateHours(int seconds) {
        int hours= (seconds/SECONDS_PER_HOUR)%(HOURS_PER_DAY);
        return hours;
    }

    //Calculates minutes display for electronic watch
    private static int calculateMinutes(int seconds) {
        int minutes = (seconds/SECONDS_PER_MINUTE)%SECONDS_PER_MINUTE;
        return minutes;
    }
    private static final int SECONDS_PER_HOUR = 3600; //Seconds per hour
    private static final int HOURS_PER_DAY = 24; //Hours per day
    private static final int SECONDS_PER_MINUTE = 60; //Seconds per minute
    private static final int MAX_DIGIT = 9; //Max value for digits

}
