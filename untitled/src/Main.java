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

}