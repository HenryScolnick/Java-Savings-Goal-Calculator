import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);

        System.out.println("How much money are you depositing?");
        double deposit = K.nextDouble();
        double startingDeposit = deposit;

        System.out.println("How much interest are you earning per year in %?");
        double interest = K.nextDouble();

        System.out.println("What is your target account balance?");
        double goal = K.nextDouble();

        int years = 0;

        if (deposit <= 0 || interest < 0 || goal <= 0) {
            System.out.println("Please enter a positive deposit and goal, and a non-negative interest rate.");
        }
        else if (deposit >= goal) {
            System.out.println("You have already reached your goal!");
            System.out.println("Your account balance is $" + deposit);
        }
        else if (interest == 0) {
            System.out.println("Your goal cannot be reached because your interest rate is 0%.");
        }
        else {
            double rate = (interest + 100) / 100.0;

            while (deposit < goal) {
                deposit = deposit * rate;
                years++;

                System.out.println("End of year " + years + ": $" + deposit);
            }

            System.out.println("\n===== RESULTS =====");
            System.out.println("Years to reach your goal: " + years);
            System.out.println("Target balance: $" + goal);
            System.out.println("Final account balance: $" + deposit);
            System.out.println("Total growth: $" + (deposit - startingDeposit));
        }
    }
}
