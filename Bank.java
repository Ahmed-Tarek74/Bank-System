package bank.system;

import java.util.ArrayList;
/**
 * @author  Mostafa Abd-Elbaky Ezzat
 * @version 1.0
 * @since   2021-04-30
 */

public class Bank {
    //attributes

    private String name, address;
    private String phone;
    private ArrayList<Account> Accounts = new ArrayList<Account>();
    private ArrayList<Client> Clients = new ArrayList<Client>();
    private static int NumAccounts;
    private static int NumClients;

    static {
        NumAccounts = NumClients = 0;
    }

    //-----Constructors-----
    /**
     * Default constructor that initialize the name, address ,and phone with ""
     */
    public Bank() {
        name = "";
        address = "";
        phone = "";
    }

     /**
     * constructor that sets name, address ,and phone
     * @param Name Bank's name
     * @param Address Bank's address
     * @param Phone Bank's phone
     */
    public Bank(String Name, String Address, String Phone) {
        name = Name;
        address = Address;
        phone = Phone;
    }

    //-----Setters And Getter-----
    //-----Setter-----

    /**
     * Setter method that set Bank's name
     * @param Name
     */
    public void setName(String Name) {
        name = Name;
    }

    /**
     * Setter method that set Bank's address
     * @param Address
     */
    public void setAddress(String Address) {
        address = Address;
    }

    /**
     * Setter method that set Bank's phone
     * @param Phone
     */
    public void setPhone(String Phone) {
        phone = Phone;
    }

    //-----Getter-----

    /**
     * Getter method that get Bank's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method that get Bank's address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Getter method that get Bank's phone
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Getter method that get all Bank's accounts
     * @return Accounts
     */
     public ArrayList<Account> getAccounts() {
        return Accounts;
    }

    /**
     * Getter method that get all Bank's clients
     * @return Clients
     */
    public ArrayList<Client> getClients() {
        return Clients;
    }

    //Other methods
    //Add

    //Pre-exicting account
    /**
     * Method that add Pre-exicting object from Account or SpecialAccount class
     * @param account client's Account
     */
    public void addNewAccount(Account account) {
        Accounts.add(account);
        NumAccounts++;
    }

    //Pre-exicting 
    /**
     * Method that add Pre-exicting object from Client or CommercialClient class
     * @param client a client of the bank
     */
    public void addNewClient(Client client) {
        Clients.add(client);
        addNewAccount(client.account);
        NumClients++;
    }

    //Display
    /**
     * Method that displays clients' information of the bank
     */
    public void displayInfo() {
        for (int i = 0; i < NumAccounts; i++) {
            System.out.println(Clients.get(i).toString()+"\n_________________________________");
        }
    }

}

