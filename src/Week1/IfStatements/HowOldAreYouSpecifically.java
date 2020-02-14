package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        String name;
        int age;
        System.out.print("Hello.  What is your name? (Sorry, I keep forgetting.) ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.print("Hi, " + n + "! How old are you? ");
        Scanner scold = new Scanner(System.in);
        int y = scold.nextInt();

        if (y < 16) {
            System.out.print("\nYou can't drive, " + n + ".");
        }
        else if (y >= 16 && y <= 17) {
            System.out.println("\nYou can drive but not vote, " + n + ".");
        } else if (y >= 18 && y <= 24) {
            System.out.println("\nYou can vote but not rent a car, " + n + ".");
        } else if (y >= 25) {
            System.out.println("\nYou can do pretty much anything, " + n + ".");
        }
    }
}
