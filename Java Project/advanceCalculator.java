//Advance Calculator

import java.util.*;
public class advanceCalculator {
         public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           String choice;
           do   {    
            System.out.println("Select operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Sine (sin)");
            System.out.println("6. Cosine (cos)");
            System.out.println("7. Tangent (tan)");
            System.out.print("Enter your choice (1-7): ");
            int operation = in.nextInt();
            double result = 0;
            switch (operation) {
                case 1:
                    System.out.println("Enter the first number: ");
                    double a = in.nextDouble();
                    System.out.println("Enter the second number: ");
                    double b = in.nextDouble();
                    result = a + b;
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    a = in.nextDouble();
                    System.out.println("Enter the second number: ");
                    b = in.nextDouble();
                    result = a - b;
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    a = in.nextDouble();
                    System.out.println("Enter the second number: ");
                    b = in.nextDouble();
                    result = a * b;
                    break;
                case 4:
                    System.out.println("Enter the first number: ");
                    a = in.nextDouble();
                    System.out.println("Enter the second number: ");
                    b = in.nextDouble();
                    result = a / b;
                    break;
                case 5:
                    System.out.println("Enter the degress: ");
                    double degrees = in.nextDouble();
                    result = Math.sin(Math.toRadians(degrees));
                    break;
                   
                case 6:
                    System.out.println("Enter the degress: ");
                    double degrees1 = in.nextDouble();
                    result = Math.cos(Math.toRadians(degrees1));
                    break;
                case 7:
                    System.out.println("Enter the degress: ");
                    double degrees2 = in.nextDouble();
                    result = Math.tan(Math.toRadians(degrees2));
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
            System.out.println("The result is " + result);
            System.out.println("Do you want to continue? (yes/no): ");
            choice = in.next();
              } while (choice.equals("yes"));
              System.out.println("Thank you for using the calculator!");
              in.close(); // Close the scanner                                                                                                                                                                   
           }   
 }

