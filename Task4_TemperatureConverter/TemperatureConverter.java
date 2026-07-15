package Task4_TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("     TEMPERATURE CONVERTER");
            System.out.println("======================================");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                     System.out.print("\nEnter Temperature in Celsius: ");
                     double celsius = sc.nextDouble();

                     double fahrenheit = (celsius * 9 / 5) + 32;

                     System.out.printf("\n%.2f °C = %.2f °F%n", celsius, fahrenheit);
           
                break;

                case 2:

    System.out.print("\nEnter Temperature in Fahrenheit: ");
    double fahrenheitValue = sc.nextDouble();

    double celsiusValue = (fahrenheitValue - 32) * 5 / 9;

    System.out.printf("\n%.2f °F = %.2f °C%n", fahrenheitValue, celsiusValue);

    break;

                case 3:

                    System.out.println("\n=============================================");
                    System.out.println(" Thank You for Using Temperature Converter!");
                    System.out.println(" Have a Great Day!");
                    System.out.println("=============================================");
                    break;

                default:

                    System.out.println("Invalid Choice! Please enter a number between 1 and 3.");
            }

        } while (choice != 3);

        sc.close();
    }
}
