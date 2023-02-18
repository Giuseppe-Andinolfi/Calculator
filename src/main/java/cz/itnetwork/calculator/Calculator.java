package cz.itnetwork.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Welcome to the calculator");
        String pokracovat = "Yes";
        while (pokracovat.equals("Yes")) {
            System.out.println("Enter the first number:");
            float a = Float.parseFloat(sc.nextLine());
            System.out.println("Enter the second number:");
            float b = Float.parseFloat(sc.nextLine());
            System.out.println("Choose your surgery:");
            System.out.println("1 - addition");
            System.out.println("2 - subtraction");
            System.out.println("3 - multiplication");
            System.out.println("4 - division");
            int choice = Integer.parseInt(sc.nextLine());
            float result = 0;
            switch (choice) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
            }
            if ((choice > 0) && (choice < 5)) {
                System.out.printf("result: %f", result);
            } else {
                System.out.println("Invalid choice");
            }
            System.out.println();
            System.out.println("Would you like to enter another example? [Yes/No]");
            pokracovat = sc.nextLine();
        }
        System.out.println("Thank you for using the calculator.");

    }
}
