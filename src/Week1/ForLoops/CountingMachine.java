package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Count to: ");
        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {

            System.out.print(i + " ");


        }

    }


}
