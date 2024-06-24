package com.globalpayex;

import com.globalpayex.banking.exceptions.LowBalanceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {

    @Test
    void testNegativeAmtWithdrawl(){
        Accounts account1 = new Accounts(5673883848L,AccType.Savings,60000.0);
        assertThrows(IllegalArgumentException.class, ()-> account1.withdrawlogic(-6000));

    }
   @Test
   void testminimumAmtWithdrawllimit(){
       Accounts account1 = new Accounts(5673883848L,AccType.Savings,60000.0);
       assertThrows(LowBalanceException.class, ()-> account1.withdrawlogic(59800));

   }


    @Test
    void testDeposite(){
      Accounts account1 = new Accounts(5673883848L,AccType.Savings,60000.0);
      var expected = 70000.0;
      var actual = account1.depositelogic(10000.0);
      assertEquals(expected,actual);
    }

    @Test
    void testWithdraw(){
        Accounts account1 = new Accounts(5673883848L,AccType.Current,60000.0);
        var expected = 50000.0;
        try {
            var actual = account1.withdrawlogic(10000.0);
        } catch (LowBalanceException e){
            System.out.println(e.getMessage());
        }
//        assertEquals(expected,actual);
//        System.out.println(account1.getDetails().toUpperCase());
//        account1.getDetails().ifPresent(details -> System.out.println(details.toUpperCase()));
        account1.getDetails().ifPresentOrElse(
                details -> System.out.println(details.toUpperCase()),
                () -> System.out.println("Account Not initialized"));
    }

    @Test
    void testEmptyAcount(){
        var acc = new Accounts();
        assertEquals(0.0,acc.getAccountBalance());

        acc.getDetails().ifPresentOrElse(
                details -> System.out.println(details.toUpperCase()),
                () -> System.out.println("Account Not initialized"));
//        String details = acc.getDetails();

//        Null pointer check
//        if(details!=null) {
//            System.out.println(acc.getDetails().toUpperCase());
//        } else {
//            System.out.println("Account Not Initialized");
//        }

    }


}