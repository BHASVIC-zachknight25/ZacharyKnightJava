public class Main {

    public Main() {
        Bank myBank = new Bank();
        boolean loggedIn = false;
        boolean quitting = false;
        int accountNo = -1;

        while (!loggedIn && !quitting) {
            System.out.println("Do you have an account? (y/n/quit)");
            String response = Console.readLine();
            System.out.println();
            if (response.equals("y")) {
                accountNo = myBank.login();
                if (accountNo != -1)
                    loggedIn = true;
            }
            else if (response.equals("n"))
                myBank.addAccount();
            else if (response.equals("quit"))
                quitting = true;
        }

        while (!quitting) {
            System.out.println(
                    "Press 1 to check your balance\nPress 2 to deposit money\nPress 3 to withdraw money\nPress 4 to exit:\n");
            String option = Console.readLine();
            System.out.println();
            if (option.equals("1"))
                myBank.checkBalance(accountNo);
            else if (option.equals("2")) {
                myBank.deposit(accountNo);
                myBank.checkBalance(accountNo);
            }
            else if (option.equals("3")) {
                myBank.withdraw(accountNo);
                myBank.checkBalance(accountNo);
            }
            else if (option.equals("4"))
                quitting = true;
            else
                System.out.println("Invalid option selected");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
