package Task2_NumberPattern;

import java.util.Scanner;

public class NumberPattern {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      NUMBER PATTERN GENERATOR");
        System.out.println("==================================");

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();


       System.out.println("\n========== Pattern 1 : Number Triangle ==========\n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
         } 


         System.out.println("\n========== Pattern 2 : Star Triangle ==========\n");

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}


System.out.println("\n========== Pattern 3 : Floyd's Triangle ==========\n");

int num = 1;

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
    }
    System.out.println();
}


System.out.println("\n========== Pattern 4 : Inverted Star Triangle ==========\n");

for (int i = rows; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}


System.out.println("\n========== Pattern 5 : Pyramid Pattern ==========\n");

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}


System.out.println("\n========== Pattern 6 : Diamond Pattern ==========\n");

// Upper Half
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}

// Lower Half
for (int i = rows - 1; i >= 1; i--) {
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}


System.out.println("\n========== Pattern 7 : Butterfly Pattern ==========\n");

// Upper Half
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    for (int j = 1; j <= 2 * (rows - i); j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

// Lower Half
for (int i = rows - 1; i >= 1; i--) {

    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    for (int j = 1; j <= 2 * (rows - i); j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

System.out.println("\n======================================");
System.out.println(" All Patterns Generated Successfully!");
System.out.println(" Thank You for Using This Program.");
System.out.println("======================================");

        sc.close();
    }
}
