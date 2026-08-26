package Unit4.Lesson1;
import java.util.Scanner;
public class SecretCodeGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String secretWord = "";
        while (secretWord.length() < 5) {
            System.out.print("Enter a secret word (at least 5 characters): ");
            secretWord = input.nextLine();
        }
        System.out.println("\nGenerating your secret code...\n");
        String reversedWord = "";
        for (int i = secretWord.length() - 1; i >= 0; i--) {
            reversedWord += secretWord.charAt(i);
        }
        System.out.println("Step 1: Reversed Word: " + reversedWord);
        System.out.println("\nStep 2: Encrypting with ASCII shifts...");
        System.out.print("Original: ");
        for (int i = 0; i < reversedWord.length(); i++) {
            System.out.print(reversedWord.charAt(i) + " ");
        }
        System.out.print("\nEncrypted: ");
        String encryptedWord = "";
        for (int i = 0; i < reversedWord.length(); i++) {
            char shiftedChar = (char)(reversedWord.charAt(i) + 2);
            encryptedWord += shiftedChar;
            System.out.print(shiftedChar + " ");
        }
        System.out.println("\n\nStep 3: Scrambling with a pattern...");
        for (int i = 0; i < reversedWord.length(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(reversedWord.charAt(i) + " ");
            }
            System.out.println();
        }
        System.out.println("\nYour Final Secret Code: " +
            encryptedWord.toUpperCase() + "-" + reversedWord);
        input.close();
    }
}