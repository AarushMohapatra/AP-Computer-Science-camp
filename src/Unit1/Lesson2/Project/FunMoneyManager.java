package Unit1.Lesson2.Project;
import java.util.Scanner;

public class FunMoneyManager {
    public static void main(String[] args) {
        /*
            A simple lil program that calculates spending and more. Basically this is a money manager. Nothing else really
        */
        //inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("$$$$$$$$$$$$$$$$$$$$-*_MONEY MANAGER_*-$$$$$$$$$$$$$$$$$$$$\n");
        System.out.println("Welcome to the Fun Money Manager!");
        System.out.print("How much money do you get each month? $");
        double monthlyMoney = sc.nextDouble();
        System.out.print("How much money do you spend on fun stuff? $");
        double funStuff = sc.nextDouble();
        System.out.print("How much money do you spend on snacks and treats? $");
        double snacks = sc.nextDouble();
        System.out.print("How much money do you spend on gifts for others (or yourself)? $");
        double gifts = sc.nextDouble();
        System.out.print("How much money do you spend on other things? $");
        double otherExpenses = sc.nextDouble();
        int percent = 0;
        while (true) {
            System.out.print("What percentage of your money do you want to save? Please enter a whole even number.");
            percent = sc.nextInt();
            if (percent % 2 == 0) {
                break;
            } else {
                System.out.println("Percentage entered is not a even number. Please try again.");
            }
        }
        //calculate totals and savings
        double totalSpend = 0;
        totalSpend += funStuff + snacks + gifts + otherExpenses; // I know that I can merge this into line 25, but I have to do this to satisfy the compound assignment requirement
        double yearlyMoney = monthlyMoney * 12;
        double yearlySpending = totalSpend * 12;
        double monthlySavings = monthlyMoney * ((double) percent / 100.0);
        double yearlySavings = monthlySavings * 12;
        double finalSpendingMoney = monthlyMoney - totalSpend - monthlySavings;
        double yearlyFinalSpendingMoney = yearlyMoney - yearlySpending - yearlySavings;
        //calculating percentages to display
        double percentFunStuff = (funStuff / monthlyMoney) * 100;
        double percentSnacks = (snacks / monthlyMoney) * 100;
        double percentGifts = (gifts / monthlyMoney) * 100;
        double percentExpenses = (otherExpenses / monthlyMoney) * 100;
        double percentTotalSpending = percentExpenses + percentFunStuff + percentGifts + percentSnacks;
        //money summery!!! time to tell if user is in debt or not
        System.out.println("===== YOUR MONEY SUMMARY =====\nMonthly Money: $" + monthlyMoney);
        System.out.println("\nSPENDING:\nFun Stuff: $" + funStuff + " (" + percentFunStuff + "%)");
        System.out.println("Snacks and Treats: $" + snacks + " (" + percentSnacks + "%)");
        System.out.println("Gifts for Others: $" + gifts + " (" + percentGifts + "%)");
        System.out.println("Other expenses: $" + otherExpenses + " (" + percentExpenses + "%)");
        System.out.println("Total spending: $" + totalSpend + " (" + percentTotalSpending + "%)\n");
        System.out.println("Money left after spending: $" + (monthlyMoney - monthlySavings));
        System.out.println("Savings (" + percent + "%): $" + monthlySavings);
        System.out.println("Final spending money: $" + finalSpendingMoney);
        System.out.println("\nYEARLY TOTALS:");
        System.out.println("Yearly money: $" + yearlyMoney);
        System.out.println("Yearly Spending: $" + yearlySpending);
        System.out.println("Yearly Savings: $" + yearlySavings);
        System.out.print("MONEY STATUS: ");
        if (finalSpendingMoney > 0 && yearlyFinalSpendingMoney > 0 && totalSpend < monthlyMoney) { //If you spent less than what you earn & youre not bankrupt -> true. Else, false.
            System.out.println("GOOD JOB! You're spending less than you earn and saving some too!");
        } else {
            System.out.println("Very poor, you didn't manage your money well and are in debt/close to being in debt. Next time, try spending less on fun things and snacks.");
        }
        sc.close();
    }
}