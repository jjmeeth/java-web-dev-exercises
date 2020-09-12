package exercises.bankstuff.accounts;

public class BankAccounts {

    private int accountNo;

    protected double balance;

    public BankAccounts(int accountNo) {
        this.accountNo = accountNo;
        this.balance = 0;
    }
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }
}
