import java.util.ArrayList;

class Account {

    double balance;
    ArrayList<String> history = new ArrayList<>();

    Account(double initialBalance) {
        balance = initialBalance;
        history.add("Account created with balance: " + balance);
    }

    void deposit(double amount) {
        balance = balance + amount;
        history.add("Deposited: " + amount);
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            history.add("Withdrawn: " + amount);
            System.out.println("Amount Withdrawn Successfully");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void showHistory() {
        System.out.println("\nTransaction History:");
        for (String h : history) {
            System.out.println(h);
        }
    }
}
class Bank_Account {
    public static void main(String[] args) {

        Account acc = new Account(1000);

        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000);

        acc.showBalance();
        acc.showHistory();
    }
}
