//ATM System

import java.util.Scanner;

public class Atm {
    // Display current balance in account 
    public static void displayBalance(int balance) {
        System.out.println("Current balance: " + balance);
        System.out.println();
    }
    
    // Withdraw amount and update the balance
    public static int withdrawAmount(int balance, int withdrawAmount) {
        System.out.println("Withdraw Operation: ");
        System.out.println("Withdrawing Amount: " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and your card.");
            displayBalance(balance);
            return balance;
        } else {
            System.out.println("Sorry! Insufficient balance.");
            System.out.println();
            return -1;
        }
    }

    // Deposit amount and update the balance 
    public static int amountDeposit(int balance, int depositAmount) {
        System.out.println("Deposit Operation: ");
        System.out.println("Depositing Amount: " + depositAmount);
        balance = balance + depositAmount;
        displayBalance(balance);
        return balance;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = 0; // Initialize balance
        boolean running = true;

        while (running) {
            System.out.println("ATM Menu:");
            System.out.println("1. Display Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    displayBalance(balance);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = in.nextInt();
                    balance = withdrawAmount(balance, withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = in.nextInt();
                    balance = amountDeposit(balance, depositAmount);
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        in.close();
    }
}
