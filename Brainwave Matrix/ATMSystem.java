import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    private static final Map<String, UserAccount> accounts = new HashMap<>();
    private static String currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeAccounts(scanner); 

        if (authenticateUser(scanner)) {
            UserAccount userAccount = accounts.get(currentUser);
            int choice;

            do {
                System.out.print("Enter your choice (1: Display Balance, 2: Withdraw, 3: Deposit, 4: Exit): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        displayBalance(userAccount);
                        break;
                    case 2:
                        System.out.print("Withdraw Amount: ");
                        int withdrawAmount = scanner.nextInt();
                        userAccount.setBalance(withdraw(userAccount.getBalance(), withdrawAmount));
                        break;
                    case 3:
                        System.out.print("Enter Deposit Amount: ");
                        int amountDeposit = scanner.nextInt();
                        userAccount.setBalance(deposit(userAccount.getBalance(), amountDeposit));
                        break;
                    case 4:
                        System.out.println("Exiting. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);
        }

        scanner.close(); 
    }

    private static void initializeAccounts(Scanner scanner) {
        System.out.print("How many accounts would you like to create? ");
        int numberOfAccounts = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.print("Enter username for account " + (i + 1) + ": ");
            String username = scanner.nextLine();
            System.out.print("Enter initial balance for " + username + ": ");
            int initialBalance = scanner.nextInt();
            scanner.nextLine(); 

            int pin = generateRandomPIN(); 

            accounts.put(username, new UserAccount(initialBalance, pin));
            System.out.println("Account for " + username + " created with balance: " + initialBalance + " and PIN: " + pin);
        }
    }

    private static boolean authenticateUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        if (accounts.containsKey(username)) {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();
            if (accounts.get(username).getPin() == pin) {
                currentUser = username;
                System.out.println("Authentication successful!");
                return true;
            } else {
                System.out.println("Authentication failed! Incorrect PIN.");
            }
        } else {
            System.out.println("Authentication failed! Username not found.");
        }
        return false;
    }

    private static void displayBalance(UserAccount userAccount) {
        System.out.println("Current balance: " + userAccount.getBalance());
    }

    private static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Please collect your money.");
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Sorry! Insufficient funds.");
        }
        return balance;
    }

    private static int deposit(int balance, int amountDeposit) {
        balance += amountDeposit;
        System.out.println("Your money has been successfully deposited.");
        return balance;
    }

    private static int generateRandomPIN() {
        Random random = new Random();
        return 1000 + random.nextInt(9000); 
    }

    private static class UserAccount {
        private int balance;
        private int pin;

        public UserAccount(int balance, int pin) {
            this.balance = balance;
            this.pin = pin;
        }

        public int getBalance() {
            return balance;
        }

        public int getPin() {
            return pin;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }
    }
}
