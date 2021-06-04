package bank.system;

/**
 * @author Ahmed Tarek Soliman
 * @version 1.0
 * @since 2021-04-30
 */
public class CommercialClient extends Client {

    private String commercialID;

    /**
     * setter to set client's commercial ID
     * @param commercial_ID
     */
    public void setCommercialID(String commercial_ID) {
        commercialID = commercial_ID;
    }

    /**
     * getter to return client's commercial ID
     * @return
     */
    public String getCommercialID() {
        return commercialID;
    }

    //-----Constructors-----
    /**
     * default constructor that sets national ID by 000000000000000
     */
    public CommercialClient() {
        nationalID = "00000000000000";
    }

    /**
     * parameterized constructor that sets name,address, phone number,commercial
     * ID and account
     * @param name_
     * @param address_
     * @param phoneNumber
     * @param commercial_ID
     * @param account_
     */
    public CommercialClient(String name_, String address_, String phoneNumber, String commercial_ID, Account account_) {
        super(name_, address_, phoneNumber, account_);
        commercialID = commercial_ID;
    }

    /**
     * override the method toString to print all CommercialClient's data members
     * values commercial ID instead of national ID
     * @return
     */
    //Other methods
    @Override
    public String toString() {
        return "Company's name is " + name + "\nCompany's national ID is " + commercialID + "\nCompany's address is " + address + "\nCompany's phone is " + phone + "\naccount information:\n" + account;

    }

}
