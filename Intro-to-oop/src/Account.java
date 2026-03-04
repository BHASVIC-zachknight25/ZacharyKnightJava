public class Account {
    private int accountNumber;
    private String password;
    private double balance;

        //A new bank account should be defined with a given account number, password and balance
    Account (int number, String password, double balance) {
        this.accountNumber = number;
        this.password ="password";
        this.balance = 0.00;
    }

    public int getNumber() {
        return accountNumber;

    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
        //This method should check if a given password is equal to the password for this account
    }

    public double getBalance() {
        return balance;
        //This method should return the balance of this account
    }

    public void setBalance(float newBalance) {
        balance = newBalance;
        //This method should change the balance of this account to a specified new value
    }
}
