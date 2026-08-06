import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the calculator!");
        boolean play = true;
        while (play) {
            //input
            System.out.println("Whats your first number");
            double num1 = sc.nextDouble();
            System.out.println("Whats your second number");
            double num2 = sc.nextDouble();
            //calculation
            double sum = num1 + num2, subtract = num1 - num2, product = num1 * num2, division = num1 / num2, remain = num1 % num2;
            System.out.println("The sum is "+sum);
            System.out.println("The difference is "+subtract);
            System.out.println("The product is "+product);
            System.out.println("The quotient is "+division);
            System.out.println("The remainder is "+remain);
            //ask user if they wanna run again
            System.out.println("Do you want to do another calculation? (y/n)");
            char ans = sc.nextLine().charAt(0);
            if (ans == 'n') {
                play=false;
            }
        }
        System.out.println("Well then, please come again to do a calculation later, bye bye! :D");
        sc.close();
    }
}
