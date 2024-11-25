package org.example;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EmployeeWage {
    public static void main(String[] args) {
        // Constants
        final int WAGE_PER_HOUR = 20; // Example hourly wage
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4; // Hours for part-time


        System.out.println("Welcome to Employee Wage Computation");
        // Create a Random object
        Random random = new Random();

        // Generate a random number (0 or 1)
        int attendance = random.nextInt(3); // 0 for Absent, 1 for Present

        // Check attendance and display the result
        if (attendance == 1) {
            System.out.println("Present");
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Daily Wage: $" + dailyWage);
        } else if(attendance == 2) {
            System.out.println("Present (Part-Time)");
            int dailyWage = WAGE_PER_HOUR * PART_TIME_HOURS;
            System.out.println("Daily Wage: $" + dailyWage);
        } else{
            System.out.println("Absent");
            System.out.println("Daily Wage: $0");
        }



    }
}