package Unit3.Lesson2;
import java.util.Scanner;
public class WordPuzzler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;
        System.out.println("Welcome to Word Puzzler!");
        while (playAgain) {
            //inputs are cool
            System.out.println("\nChoose a word puzzle:");
            System.out.println("1. Word Reverser");
            System.out.println("2. Vowel Counter");
            System.out.println("3. Word Scrambler");
            System.out.println("4. Word Pyramid");
            System.out.println("5. Quit");
            System.out.print("\nEnter your choice (1-5): ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 5) {
                playAgain = false;
                System.out.println("Thanks for playing Word Puzzler!");
                continue;
            }
            System.out.print("Enter a word: ");
            String word = input.nextLine();
            switch (choice) { //user chooses their fate (not so)
                case 1:
                    reverseWord(word);
                    break;
                case 2:
                    countVowels(word);
                    break;
                case 3:
                    scrambleWord(word);
                    break;
                case 4:
                    createWordPyramid(word);
                    break;
                default:
                    System.out.println("That's not a valid choice. Please try again.");
            }
            System.out.print("\nDo you want to play again? (yes/no): ");
            String answer = input.nextLine();
            playAgain = answer.equalsIgnoreCase("yes");
        }
        input.close();
    }
    public static void reverseWord(String word) {
        System.out.print("The reversed word is: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
    public static void countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) { //we use switch to make our lives easier so no lots of if statements
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("There are " + count + " vowels in your word.");
    }
    public static void scrambleWord(String word) {
        char[] WORD = word.toCharArray(); //we convert word to char so we can easily mess with each letter
        for (int i = 0; i < WORD.length; i++) {
            int location = (int)(Math.random() * WORD.length);
            int location2 = (int)(Math.random() * WORD.length);
            char temp = WORD[location];
            WORD[location] = WORD[location2];
            WORD[location2] = temp;
        }
        System.out.println(new String(WORD) /*you know we dont wanna output the char array that would be bad*/ );

    }
    public static void createWordPyramid(String word) {
        System.out.println("Word Pyramid:");
        int i = 1;
        while (i <= 5) {
            for (int i2 = 1; i2 <= i; i2++) {
                System.out.print(" " + word);
            }
            i++;
            System.out.println();
        }
    }
}