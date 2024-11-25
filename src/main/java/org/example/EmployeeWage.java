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
        final int WORKING_DAYS_PER_MONTH = 20; // Total working days in a month

        // Variables
        int monthlyWage = 0;


        System.out.println("Welcome to Employee Wage Computation");
        // Create a Random object
        Random random = new Random();

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {

            // Generate a random number (0 or 1)
            int attendance = random.nextInt(3); // 0 for Absent, 1 for Present

            System.out.print("Day " + day + ": ");

            // Check attendance and display the result
            switch (attendance) {
                case 1: // Full-Time
                    System.out.println("Present (Full-Time)");
                    monthlyWage += WAGE_PER_HOUR * FULL_DAY_HOURS;
                    break;

                case 2: // Part-Time
                    System.out.println("Present (Part-Time)");
                    monthlyWage += WAGE_PER_HOUR * PART_TIME_HOURS;
                    break;

                case 0: // Absent
                default:
                    System.out.println("Absent");
                    break;
            }

        }
        System.out.println("Monthly Wage: $" + monthlyWage);

    }
}