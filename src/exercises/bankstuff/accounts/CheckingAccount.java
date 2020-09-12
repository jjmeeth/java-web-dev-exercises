package exercises.bankstuff.accounts;

public class CheckingAccount extends BankAccounts {

    private double fee;

    public CheckingAccount(int accountNo, double fee) {
        super(accountNo); //calls parent constructor, sets two fields
        this.fee = fee;
    }

    public void collectFee() {
        this.balance -= this.fee;
    }
}
