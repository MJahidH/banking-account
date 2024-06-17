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
        balance += amount;
    }
}