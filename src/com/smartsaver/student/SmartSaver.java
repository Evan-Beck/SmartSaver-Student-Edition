package src.com.smartsaver.student;

import java.util.Scanner;
import java.util.List;

public class SmartSaver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        BankAccount myAccount = new BankAccount(50);
        int choice; 

        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Transaction History\n5. Apply Interest\n6. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
            case 1: // deposit
                System.out.println("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble(); 
                myAccount.deposit(depositAmount); 
                break;
            case 2: // withdraw
                 System.out.println("Enter amount to withdraw: ");
                 double withdrawAmount = scanner.nextDouble();
                 myAccount.withdraw(withdrawAmount);
                 break;
            case 3: // Check Balance
                    System.out.println("Current balance: $" + myAccount.getBalance());
                    break;
            case 4: // Transaction History
                    System.out.println("Transaction History:");
                    List<String> history = myAccount.getTransactionHistory();
                    for (String record : history) {
                        System.out.println(record);
                    }
                        break;
            case 5: // Apply Interest
                    System.out.println("Enter interest rate (as a decimal, e.g., 0.05 for 5%):");
                    double rate = scanner.nextDouble();
                    System.out.println("Enter time period in years: ");
                    double time = scanner.nextDouble();
                    myAccount.applyInterest(rate, time);
                    System.out.println("Interest applied.");
                    break;
            case 6: // Exit
                    System.out.println("Exiting...");
                    break;
                    default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                

            }

           
        
        } while (choice != 6);
        scanner.close ();
    }
    }
