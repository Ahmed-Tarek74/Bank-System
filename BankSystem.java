package bank.system;

import java.util.Scanner;

/**
 *
 * @author Ahmed tarek Soliman
 * @version 1.0
 * @since 2021-04-30
 */
public class BankSystem {

    static public void mainMenu() {
        System.out.println("Enter the number of required serves\n1- Add new client\n2- List all accounts / clients\n3-Registered client options\n4- Exit");
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Cairo", "Giza", "19714");
        Scanner read = new Scanner(System.in);
        OUTER:
        while (true) {
            int choice;
            mainMenu();
            choice = read.nextInt();
            switch (choice) {
                case 1:
                    boolean exist=false;
                    Account a;
                    Client c;
                    String name,id,address,phoneNumber;
                    System.out.println("1- Normal account\n2- Special account");
                    choice = read.nextInt();
                    System.out.println("Enter account number");
                    int number = read.nextInt();
                    for (int i = 0; i < (bank.getAccounts().size()); i++) {
                        if ((bank.getAccounts().get(i).getAccount()) == number) {                           
                            exist=true;
                        }
                    }
                    if(exist){
                        System.out.println("Account number is already taken");
                        break;
                    }
                    else{
                        if (choice == 1) {
                            a = new Account(number);
                        } else {
                            a = new SpecialAccount(number);
                        }
                        System.out.println("1- Client\n2- Commercial client");
                        choice=read.nextInt();
                        if (choice == 1) {
                            System.out.println("Enter client information in this order:\nName- National ID- Address- Phone Number");
                        } else {
                            System.out.println("Enter client information in this order:\nName- Commercial ID- Address- Phone Number");
                        }
                        name = read.next();
                        id = read.next();
                        address = read.next();
                        phoneNumber = read.next();
                        if (choice == 1) {
                            c = new Client(name, id, address, phoneNumber, a);

                        } else {
                            c = new CommercialClient(name, id, address, phoneNumber, a);
                        }
                        bank.addNewClient(c);
                        break;
                    }
                case 2:
                    bank.displayInfo();
                    break;
                case 3:
                    int accountNumber;
                    boolean found = false;
                    System.out.println("Enter account number");
                    accountNumber = read.nextInt();
                    for (int i = 0; i < (bank.getAccounts().size()); i++) {
                        if ((bank.getAccounts().get(i).getAccount()) == accountNumber) {
                            found = true;
                            int index = i;
                            while (true) {
                                System.out.println("1- Deposite\n2- Withdraw");
                                choice = read.nextInt();
                                if (choice == 1) {
                                    double depositValue;
                                    System.out.println("Deposite ammount");
                                    depositValue = read.nextDouble();
                                    bank.getAccounts().get(i).Deposit(depositValue);
                                    break;
                                } else {
                                    double withdrawValue;
                                    System.out.println("Withdraw ammount");
                                    withdrawValue = read.nextDouble();
                                    bank.getAccounts().get(i).Withdraw(withdrawValue);
                                    break;
                                }

                            }

                        }
                    }
                    if (!found) {
                        System.out.println("Does not exist");
                    }

                    break;
                case 4:
                    break OUTER;
                default:
                    break;
            }
        }

    }

}

