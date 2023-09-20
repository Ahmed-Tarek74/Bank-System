package bank.system;
/**
 * @author  Ziad Mohmed Nomaan Mohmed Zeater
 * @version 1.0
 * @since   2021-04-30
 */
public class Account {

    //attributes
    protected double balance;
    protected int accountNum;

    //-----Constructors-----
    /**
     * Parameterized Constructor that initialize Balance and set account number value ""
     * @param accountNum number 
     */
    public Account(int accountNum) {
        this.accountNum = accountNum;
        balance = 0.0;
    }

    public Account() {
    }

    //-----Setters And Getter-----
    //-----Setter-----

    /**
     * Setter method that set Balance value
     * @param givenBalance
     */
    public void setBalance(double givenBalance) {
        balance = givenBalance;
    }
    /**
     * Setter method that set Account Number
     * @param givenAccount
     */

    public void setAccountNum(int givenAccount) {
        accountNum = givenAccount;
    }

    //-----Getter-----
    /**
     * Getter method that get Balance value
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Getter method that get Account number
     * @return accountNum
     */

    public int getAccount() {
        return accountNum;
    }

    //Other methods
    /**
     * Method that displays Account information
     * @return 
     */
    @Override
    public String toString() {
        return "Balance= " + balance + " , AccountNum= " + accountNum ;
    }
    /**
     * Method that Deposit value in Account balance 
     * @param d
     */

    public void Deposit(double d) {
        balance += d;
        System.out.println("Deposit amount =" + d);
        System.out.println("New Balance =" + balance);
    }  
    /**
     * Method that Withdraw value from Account balance 
     * @param w
     */

    public void Withdraw(double w) {
        if (balance < w) {
            System.out.println("Insufficient balance");
            System.out.println("Balance =" + balance);
        } else {
            balance -= w;
            System.out.println("Withdraw amount =" + w);
            System.out.println("New Balance =" + balance);
        }
    }
}
