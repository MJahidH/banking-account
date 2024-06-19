import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.print("Hello and welcome!");


    }
}

class BankAccount {
    int balance;
    int previousTransactions;
    String customerName;
    String customerID;

    BankAccount(String cName, String cID) {
    customerName = cName;
    customerID = cID;
    }

    void deposit (int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransactions = amount;
        }
    }

    void withdraw (int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransactions = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransactions > 0)
            System.out.println("Deposited:" + previousTransactions);
        else if (previousTransactions < 0)
            System.out.println("Withdrawn:" + Math.abs(previousTransactions));
        else
            System.out.println("No transactions have occured");
    }

    void showMenu() {
       char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome" +customerName);
        System.out.println("Your ID is " +customerID);
        System.out.println("\n");
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Enter an option");
            System.out.println("-----------------------------------------------");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':
                    System.out.println("-----------------------------------------------");
                    System.out.println("Balance: " +balance);
                    System.out.println("-----------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("-----------------------------------------------");
                    int depositAmount = scanner.nextInt();
                    deposit(depositAmount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("-----------------------------------------------");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------------------------");
                    getPreviousTransaction();;
                    System.out.println("-----------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("-----------------------------------------------");
                    break;

                default:
                    System.out.println("invalid option! Please enter again");
                    break;



            }


        }while (option != 'E');

        System.out.println("Thank you for using our services.");
    }

}