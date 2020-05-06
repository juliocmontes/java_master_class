package com.jcmontes;

public class Main {

    public static void main(String[] args) {
//        getDurationString(61,0);
        System.out.println(getDurationString(80, 30));
        System.out.println(getDurationString(60, 1));
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
        return "Invalid Value";
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59)){
            return "Invalid Value";
        }
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return String.format("%dhh %dmm %dss", hours, remainingMinutes, seconds);
    }


}
