package FullYearCourse;

import java.util.Scanner;

public class MyFirstPrograms {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Which program would you like to run? (1-4)");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                Program1();
                break;
            case 2:
                Program2();
                break;
            case 3:
                Program3();
                break;
            case 4:
                Program4();
                break;
            default:
                System.out.println("Invalid choice.");
        }
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
    public static void Program3() {
        System.out.print("Enter a weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.println("Your weight in mercury is: " + weight*0.4);
        System.out.println("Your weight in venus is: " + weight*0.9);
        System.out.println("Your weight in mars is: " + weight*0.38);
        System.out.println("Your weight in jupiter is: " + weight*2.3);
        System.out.println("Your weight in saturn is: " + weight*1.1);
        System.out.println("Your weight in uranus is: " + weight*0.92);
        System.out.println("Your weight in neptune is: " + weight*1.2);
    }
    public static void Program4() {
        System.out.print("Give me any amount of seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(hours+" hours, "+minutes+" minutes, "+remainingSeconds+" seconds.");
    }
}