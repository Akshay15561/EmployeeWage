package org.example;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EmployeeWage {


    public static void main(String[] args) {


        System.out.println("Welcome to Employee Wage Computation");
        computeEmployeeWage("Company A", 20, 20, 100);
        computeEmployeeWage("Company B", 25, 22, 120);
        computeEmployeeWage("Company C", 18, 18, 90);


    }
    public static void computeEmployeeWage(String companyName, int wagePerHour, int MAX_WORKING_DAYS, int MAX_WORKING_HOURS) {
        System.out.println("\nComputing wages for " + companyName);

        // Local variables
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int monthlyWage = 0;
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
                    dailyHours = 8;
                    break;

                case 2: // Part-Time
                    System.out.println("Present (Part-Time)");
                    dailyHours = 4;
                    break;

                case 0: // Absent
                default:
                    System.out.println("Absent");
                    dailyHours = 0;
                    break;
            }


            if (totalWorkingHours + dailyHours <= MAX_WORKING_HOURS) {
                totalWorkingHours += dailyHours;
                monthlyWage += dailyHours * wagePerHour;
            }

            }
        displaySummary(companyName, totalWorkingDays, totalWorkingHours, monthlyWage);
        }
    public static void displaySummary(String companyName, int totalWorkingDays, int totalWorkingHours, int monthlyWage) {
        System.out.println("\nSummary for " + companyName + ":");
            System.out.println("Total Working Days: " + totalWorkingDays);
            System.out.println("Total Working Hours: " + totalWorkingHours);
            System.out.println("Monthly Wage: $" + monthlyWage);
        }
    }