import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts;
    private static int latestAccount;
    double balance=0.00;
    String password ="Zachary";
    int accountNumber=12345;


    Bank() { /*A new bank is defined with a list of bank accounts and a value that keeps track of the account number of the 
			 most recently added account*/
        this.accounts = new ArrayList<Account>();
        Bank.latestAccount = -1;
    }

    public int login() {
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter account number: ");
        int enter=myObj.nextInt();
        myObj.nextLine();
        System.out.print("Enter password: ");
        String pass = myObj.nextLine();
        if (enter == accountNumber && pass.equals(password)) {
            System.out.println("You have successfully logged in, " + accountNumber+"!");
        }
        else if (enter != accountNumber) {
            System.out.println("Invalid account number");
        }

        return accountNumber;
    }

    public void deposit(int number) {
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter how much do you want to deposit: ");
        double deposit=myObj.nextDouble();
        myObj.nextLine();
        balance+=deposit;
        }

    /*This method should ask the user how much money they want to deposit into their account, and correctly update the 
	balance of their account*/


    public void withdraw(int number) {
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter how much do you want to withdraw: ");
        double withdraw=myObj.nextDouble();
        myObj.nextLine();

    /*This method should ask the user how much money they want to withdraw from their account, and correctly update 
	the balance of their account*/
    }

    public void checkBalance(int number) {
        System.out.println("Your account balance is: "+balance);

        //This method should display a message telling the user how much money is in their account
    }

    public void addAccount() {

    /*This method should create a new account with an account number 1 larger than the account number or the last account 
	created, a password given by the user, and a balance of 0. The account should be added to the bank's list of accounts*/
    }
}