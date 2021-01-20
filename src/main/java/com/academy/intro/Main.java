package com.academy.intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        printData(name, age);

    }

    public static void printData(String name, int age){
        if (age > 65){
            System.out.println("Stop go to the market after 10:AM");
        } else {
            System.out.println("Your name is: " + name);
            System.out.println("Your age is: " + age);
        }

    }
}
