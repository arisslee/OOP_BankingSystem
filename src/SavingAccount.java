public class SavingAccount implements BankAccount {
    private double balance;

    public SavingAccount() {
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
        double charge = 1.00;
        if(amount > 0) {
            if(amount + charge <= balance) {
                balance -= (amount + charge);
                System.out.println("Withdrew " + amount + " with a charge of " + charge + ". Current balance is " + balance);
            } else {
                System.out.println("Insufficient balance to withdraw " + amount + " with a charge of " + charge);
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
