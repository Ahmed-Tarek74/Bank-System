package bank.system;
/**
 * @author Ahmed Tarek Soliman
 * @version 1.1
 * @since 2021-04-30
 */

public class SpecialAccount extends Account {

    //-----Constructors-----
    /**
     * Parameterized Constructor that initialize Balance and set account number value ""
     * @param accountNum number 
     */
    public SpecialAccount(int accountNum) {
        this.accountNum = accountNum;
        balance = 0.0;
    }

    public SpecialAccount() {
    }

    //Other methods
    /**
     * Method that Withdraw value from Account balance 
     * @param w
     */
    @Override
    public void Withdraw(double w) {
        if (balance - w >= -1000) {
            balance -= w;
            System.out.println("Withdraw amount =" + w);
            System.out.println("New Balance =" + balance);
        } else {
            System.out.println("Insufficient balance");
            System.out.println("Balance =" + balance);
        }
    }
}
