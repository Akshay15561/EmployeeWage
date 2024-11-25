package org.example;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");
        // Create a Random object
        Random random = new Random();

        // Generate a random number (0 or 1)
        int attendance = random.nextInt(2); // 0 for Absent, 1 for Present

        // Check attendance and display the result
        if (attendance == 1) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }



    }
}