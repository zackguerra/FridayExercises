package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        String name;
        int age;
        System.out.println("Hello.  What is your name?");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.println("Hi, " + n + "! How old are you?");
        Scanner scold = new Scanner(System.in);
        int y = scold.nextInt();

        System.out.println("Did you know that in five years you will be "+ (y+5) + " years old?\n" +
                "And five years ago you were "+ (y-5) +"! Imagine that!");
        Scanner scfin = new Scanner(System.in);



    }






}
