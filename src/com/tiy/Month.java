package com.tiy;

import java.util.Scanner;

public enum Month {

    JANUARY(true),
    FEBRUARY(true),
    MARCH(true),
    APRIL(true),
    MAY(true),
    JUNE(true),
    JULY(true),
    AUGUST(true),
    SEPTEMBER(true),
    OCTOBER(true),
    NOVEMBER(true),
    DECEMBER(true);
    private final boolean selectedMonth;

    Month(Boolean selectedMonth) {
        this.selectedMonth = selectedMonth;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("AWESOME!");
//
//        for(Month month : Month.values()){
//            System.out.println("month in the loop" + month);
//            System.out.println("month.ordinal() = " + month.ordinal());
//        }
//        System.out.println("Please type in one of the months.");
//        String monthInput = scanner.nextLine();
//
//        Month selectedMonth = Month.valueOf(monthInput.toUpperCase());
//
//        System.out.println("SelectedMonth =" + selectedMonth);
//
//        for(Month month : Month.values()){
//            if(month.ordinal() > selectedMonth.ordinal()){
//                System.out.println("Months after selected month. =" + month);
//            }
//        }
//    }


}