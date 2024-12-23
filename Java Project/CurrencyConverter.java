import java.util.*;
public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Select operation:");
            System.out.println("1. USD to INR");
            System.out.println("2. INR to USD");
            System.out.println("3. USD to EUR");
            System.out.println("4. EUR to USD");
            System.out.println("5. USD to GBP");
            System.out.println("6. GBP to USD");
            System.out.print("Enter your choice (1-6): ");
            int operation = in.nextInt();
            double result = 0;
            switch (operation) {
                case 1:
                    System.out.println("Enter the amount in USD: ");
                    double usd = in.nextDouble();
                    result = usd * 85.1213;
                    break;
                case 2:
                    System.out.println("Enter the amount in INR: ");
                    double inr = in.nextDouble();
                    result = inr / 85.1213;
                    break;
                case 3:
                    System.out.println("Enter the amount in USD: ");
                    double usd1 = in.nextDouble();
                    result = usd1 * 1.04;
                    break;
                case 4:
                    System.out.println("Enter the amount in EUR: ");
                    double eur = in.nextDouble();
                    result = eur / 1.04;
                    break;
                case 5:
                    System.out.println("Enter the amount in USD: ");
                    double usd2 = in.nextDouble();
                    result = usd2 *0.80;
                    break;
                case 6:
                    System.out.println("Enter the amount in GBP: ");
                    double gbp = in.nextDouble();
                    result = gbp /0.80;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Result: " + result);
            System.out.println("Do you want to perform another operation? (yes/no): ");
            choice = in.next();
        } while (choice.equals("yes"));
        in.close();
    }
}
