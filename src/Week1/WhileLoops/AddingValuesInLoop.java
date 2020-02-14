package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("I will add up the numbers you give me.\n");
        System.out.print("Number: ");
        int number = sc.nextInt();

        while (number != 0) {
            System.out.println("The total so far is " + (total += number));
            System.out.print("Number: ");
            number = sc.nextInt();
        }
        System.out.println(total);

    }
}
