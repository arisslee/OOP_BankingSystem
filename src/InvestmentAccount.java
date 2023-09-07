import java.time.Year;

public class InvestmentAccount implements BankAccount {
    private double balance;

    public InvestmentAccount() {
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". Current balance is " + balance);
        } else {
            System.out.println("Amount to deposit should be more than zero");
        }
    }

    @Override
    public void withdraw(double amount) {
        double serviceCharge;
        if(amount > 0) {
            if(amount <= balance) {
                balance -= amount;
                if(amount > balance / 2) {
                    serviceCharge = balance * 0.30;
                } else {
                    serviceCharge = balance * 0.15;
                }
                balance -= serviceCharge;
                System.out.println("Withdrew " + amount + " with a service charge of " + serviceCharge + ". Current balance is " + balance);
            } else {
                System.out.println("Insufficient balance to withdraw " + amount);
            }
        } else {
            System.out.println("Amount to withdraw should be more than zero");
        }
    }

    @Override
    public double getBalance() {
        System.out.println("Current balance is " + balance);
        return balance;
    }
}
