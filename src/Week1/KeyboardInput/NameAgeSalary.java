package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
       public static void main(String[] args) {
           String name;
           int age;
           int salary;
           System.out.println("Hello.  What is your name?");
           Scanner sc = new Scanner(System.in);
           String n = sc.nextLine();

           System.out.println("Hi, " + n + "! How old are you?");
           Scanner scold = new Scanner(System.in);
           String y = scold.nextLine();

           System.out.println("So you're " + y + ", eh?  That's not old at all!\nHow much do you make, " + n + "?");
           Scanner scmon = new Scanner(System.in);
           String s = scmon.nextLine();

           System.out.println(s + "!  I hope that's per hour and not per year! LOL!");
           Scanner scfin = new Scanner(System.in);



    }


}
