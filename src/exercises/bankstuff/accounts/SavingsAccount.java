package exercises.bankstuff.accounts;

public class SavingsAccount extends BankAccounts {

    private double interestRate;

    public SavingsAccount(int accountNo, double interestRate) {
        super(accountNo);
        this.interestRate = interestRate;
    }

    public void accrueInterest() {

    }
}
