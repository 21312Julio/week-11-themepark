package com.company;

public class Main {

    public static void main(String[] args) {

        int peopleinline = 90;
        int peopleinride = 0;
        int minutes = 0;
        // 40 in ride and 63 in line
        while (peopleinline < 600) {
            peopleinline = peopleinline + 63 - 40;
            peopleinride = 40;
            minutes = minutes + 5;
        }

        System.out.println(minutes);

    }
}

