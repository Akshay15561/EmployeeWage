package org.example;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EmployeeWage {

        // Constants
        static final int WAGE_PER_HOUR = 20; // Example hourly wage
        static final int FULL_DAY_HOURS = 8;
        static final int PART_TIME_HOURS = 4; // Hours for part-time
        static final int MAX_WORKING_HOURS = 100; // Maximum working hours in a month
        static final int MAX_WORKING_DAYS = 20;   // Maximum working days in a month

        // Variables
        static int totalWorkingHours = 0;
        static int totalWorkingDays = 0;
        static int monthlyWage = 0;

    public static void main(String[] args) {


        System.out.println("Welcome to Employee Wage Computation");

        computeEmployeeWage();
        displaySummary();
    }
        public static void computeEmployeeWage() {
            Random random = new Random();
        // Continue working until either the hours or days limit is reached
        while (totalWorkingHours < MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
            // Increment working days
            totalWorkingDays++;
            // Generate a random number (0 or 1)
            int attendance = random.nextInt(3);// 0 for Absent, 1 for Present
            int dailyHours = 0;

            System.out.print("Day " + totalWorkingDays + ": ");


            // Check attendance and display the result
            switch (attendance) {
                case 1: // Full-Time
                    System.out.println("Present (Full-Time)");
                    dailyHours = FULL_DAY_HOURS;
                    break;

                case 2: // Part-Time
                    System.out.println("Present (Part-Time)");
                    dailyHours = PART_TIME_HOURS;
                    break;

                case 0: // Absent
                default:
                    System.out.println("Absent");
                    break;
            }
            // Add the daily hours to total working hours
            totalWorkingHours += dailyHours;


            // Stop if total working hours exceed the limit
            if (totalWorkingHours >= MAX_WORKING_HOURS) {
                totalWorkingHours -= dailyHours;
                break;
            }
            monthlyWage += dailyHours * WAGE_PER_HOUR;

            }

        }
        public static void displaySummary() {
            System.out.println("\nSummary:");
            System.out.println("Total Working Days: " + totalWorkingDays);
            System.out.println("Total Working Hours: " + totalWorkingHours);
            System.out.println("Monthly Wage: $" + monthlyWage);
        }
    }