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


        /*String fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        System.out.println(fullName);*/

        // Alternative: move the building logic into its own method (see generateFullName below)
        //String fullName = generateFullName(firstName, middleName, lastName, suffix);

        // Start with the part that is always there
        String fullName = firstName;

        // Middle name is optional: only add it when it is not empty.
        // charAt(0) takes the first letter, so "Charles" or "C." both become "C."
        if (!middleName.isEmpty()) {
            fullName += " " + middleName.charAt(0) + ".";
        }

        // Last name is always there
        fullName += " " + lastName;

        // Suffix is optional; when present it goes after a comma: "Glen Williams, PhD"
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // \n prints an empty line first, to separate the answers from the result
        System.out.println("\nFull name: " + fullName);

        scanner.close();


    }
}
