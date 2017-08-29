package com.tiy;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AWESOME!");

        for(Month month : Month.values()){
            System.out.println("month in the loop" + month);
            System.out.println("month.ordinal() = " + month.ordinal());
        }
        System.out.println("Please type in one of the months.");
        String monthInput = scanner.nextLine();

        Month selectedMonth = Month.valueOf(monthInput.toUpperCase());

        System.out.println("SelectedMonth =" + selectedMonth);

        for(Month month : Month.values()){
            if(month.ordinal() > selectedMonth.ordinal()){
                System.out.println("Months after selected month. =" + month);
            }
        }
    }
}
