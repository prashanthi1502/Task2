package app;
public class Account {
    private double balance;

    // Default constructor
    public Account() {
        this.balance = 0;
    }

    // Constructor with balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance is " + balance + ".");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance is " + balance + ".");
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current balance is " + balance + ".");
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(100);

        account1.deposit(50);
        account1.withdraw(20);
        account1.displayBalance();

        account2.deposit(150);
        account2.withdraw(50);
        account2.displayBalance();
    }
}

