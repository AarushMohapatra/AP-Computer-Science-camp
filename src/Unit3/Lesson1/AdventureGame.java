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
        System.out.println("\nHello, " + playerName + "!");
        System.out.println("You find yourself at the entrance of a mysterious cave.");
        System.out.println("You have " + health + " health and " + gold + " gold coins.");
        System.out.println("\nDo you want to enter the cave? (yes/no)");
        String choice = input.nextLine();
        boolean opItem = false;
        if (choice.equals("yes") /*== is not used because it only compares if object same in memory, not the actual string content*/ ) {
            System.out.println("You bravely enter the dark cave...");
            if (playerAge < 13) {
                opItem = true;
                System.out.println("You find a sword. It may be helpful..");
            } else {
                System.out.println("You find a shiny sword, but you're too big to reach it!");
            }
            System.out.println("You found a big pile of gold. Collect it? (yes/no)");
            choice = input.nextLine();
            if (choice.equals("yes")) {
                System.out.println("You collected 25 gold");
                gold += 25;
            } else if (choice.equals("no")) {
                System.out.println("You didn't collect any gold.");
            } else {
                System.out.println("uhhh your player got confused on what you wanted to say and just took 5 of the 25 gold in the pile");
                gold += 5;
                health-=2;
            }
        } else {
            System.out.println("You decide not to enter the cave. There could have been an exciting adventure, but I guess its safe to not go...");
        }
    }
}