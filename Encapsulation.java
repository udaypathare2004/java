class BankAccount {
    // Private variables (data hiding)
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    // Getter method to get account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter method to get balance
    public double getBalance() {
        return balance;
    }

    // Setter method to deposit money (modifies balance)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Setter method to withdraw money (modifies balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount myAccount = new BankAccount("Uday Pathare", 5000);

        // Accessing data using getter methods
        System.out.println("Account Holder: " + myAccount.getAccountHolderName());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Modifying balance using setter methods
        myAccount.deposit(2000);
        myAccount.withdraw(1500);

        // Printing updated balance
        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}

