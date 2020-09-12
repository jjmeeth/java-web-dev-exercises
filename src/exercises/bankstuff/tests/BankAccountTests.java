package exercises.bankstuff.tests;

import exercises.bankstuff.accounts.BankAccounts;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankAccountTests {
    //has-a's
        //accountNumber
        //balance
        //Owner(s) - Joint?


        //type - checking, savings, etc.


    //can-do's
        //deposit
        //withdrawal
        //transfer
        //accrueInterest

    private BankAccounts ba;

    @Before
    public void makeBankAccount() {
       ba = new BankAccounts(10);
    }
    @Test
    public void testSimpleDeposit() {
        ba.deposit(1.00);
        assertEquals(1.00, ba.getBalance(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeValue() {
        ba.deposit(-2.00);
        fail("Should not be able to deposit a negative amount.");

    }

//    @Test
//    public void testSimpleWithdrawal() {
//        ba.withdraw(5);
//        assertEquals(11, ba.getBalance());
//    }


}


