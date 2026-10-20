package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The values for full name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine().trim();
        System.out.println();


        String fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        System.out.println(fullName);

        scanner.close();


    }
}
