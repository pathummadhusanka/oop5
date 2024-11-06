package Q3;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited!");
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Error: Insufficient balance to withdraw!");
        }else {
            balance -= amount;
            System.out.println("Withdraw!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
