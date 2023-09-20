package bank.system;

/**
 * @author Ahmed Tarek Soliman
 * @version 1.1
 * @since 2021-04-30
 */
public class Client {

    //attributes
    protected String name;
    protected String nationalID;
    protected String phone;
    protected String address;
    protected Account account;

    //-----Constructors-----
    /**
     * default constructor
     */
    public Client() {
    }
    /**
     * parameterized constructor that sets name, nationalID ,address, phone and account
     * @param name_
     * @param nationalID_
     * @param address_
     * @param phoneNumber
     * @param account_ 
     */

    public Client(String name_, String nationalID_, String address_, String phoneNumber, Account account_) {
        name = name_;
        nationalID = nationalID_;
        address = address_;
        phone = phoneNumber;
        account = account_;
    }

    /**
     * parameterized constructor that sets name, address, phone and account and set nationalID by 0000000000000
     * @param name_
     * @param address_
     * @param phoneNumber
     * @param account_ 
     */
    public Client(String name_, String address_, String phoneNumber, Account account_) {
        name = name_;
        nationalID = "00000000000000";
        address = address_;
        phone = phoneNumber;
        account = account_;
    }

    //-----Setters And Getter-----
    //-----Setter-----
    /**
     * Setter method that set client's name
     * @param name_ 
     */
    public void setName(String name_) {
        name = name_;
    }

    /**
     * Setter method that set client's nationalID
     * @param nationalID_ 
     */
    public void setNationalID(String nationalID_) {
        nationalID = nationalID_;
    }

    /**
     * Setter method that set client's address
     * @param address_ 
     */
    public void setAddress(String address_) {
        address = address_;
    }

    /**
     * Setter method that set client's phone number
     * @param phoneNumber 
     */
    public void setPhone(String phoneNumber) {
        phone = phoneNumber;
    }

    //-----Getter-----
    /**
     * Getter method that get client's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method that get client's nationalID
     * @return national ID
     */
    public String getNationalID() {
        return nationalID;
    }
    /**
     * Getter method that get client's address
     * @return address     
     */

    public String getAddress() {
        return address;
    }

    /**
     * Getter method that get client's phone number
     * @return phone number
     */
    public String getPhone() {
        return phone;
    }

    //Other methods
    @Override
    /**
     * override the method toString to print all client's data member values 
     */
    public String toString() {
        return "Client's name is: " + name + "\nClient's national ID is: " + nationalID + "\nClient's address is: " + address + "\nClient's phone is: " + phone + "\nClient's account info is:\n" + account;//+Account.toString
    }
}
