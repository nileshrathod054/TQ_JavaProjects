package logicalPrograms;

import java.util.Scanner;

class MinimumAccountBalance extends Exception {

    String message;

    public MinimumAccountBalance(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class InsufficientBalanceException {

    static double current_balance = 100;

    public static void main(String[] args) throws MinimumAccountBalance {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount to withdrawal");
        int n = s.nextInt();
        try {
            if (current_balance < n) {
                throw new MinimumAccountBalance("Insufficient funds ! your Current balance is " + current_balance);
            } else {
                System.out.println("Please Take The Money : " + n);
            }

        } catch (MinimumAccountBalance mab) {
            mab.printStackTrace();
        }
    }

}