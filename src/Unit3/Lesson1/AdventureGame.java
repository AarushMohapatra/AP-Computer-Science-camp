package Unit3.Lesson1;
import java.util.Scanner;
public class AdventureGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerName;
        int playerAge;
        int health = 100;
        int gold = 10;
        System.out.println("Welcome to the Java Adventure Game!");
        System.out.print("What is your name? ");
        playerName = input.nextLine();
        System.out.print("How old are you? ");
        playerAge = input.nextInt();
        input.nextLine();
        System.out.println("\nHello, " + playerName + "!");
        System.out.println("You find yourself at the entrance of a mysterious cave.");
        System.out.println("You have " + health + " health and " + gold + " gold coins.");
        System.out.println("\nDo you want to enter the cave? (yes/no)");
        String choice1 = input.nextLine();
        if (choice1.equals("yes")) {
            System.out.println("You bravely enter the dark cave...");
        } else {
            System.out.println("You decide not to enter the cave.");
        }
    }
}