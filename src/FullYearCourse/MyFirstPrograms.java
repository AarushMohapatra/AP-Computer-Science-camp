package FullYearCourse;

import java.util.Scanner;

public class MyFirstPrograms {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-----Program1-----");
        Program1();
        System.out.println("------------------\n");
        System.out.println("-----Program2-----");
        Program2();
        System.out.println("------------------\n");
    }
    public static void Program1() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", welcome to AP CSA!");
    }
    public static void Program2() {
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Please give me name " + i + ": ");
            names[i] = sc.nextLine();
        }
        System.out.println(names[2] + ", " + names[1] + ", " + names[0]);
    }
}