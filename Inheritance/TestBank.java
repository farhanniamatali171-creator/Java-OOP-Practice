class Bank_Account {

    protected int accountID;
    protected double balance;

    // Default constructor
    public Bank_Account() {
        this.accountID = 0;
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Bank_Account(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    // Balance inquiry
    void balanceInquiry() {
        System.out.println("Balance is: " + balance);
    }
}

// 🔹 Current Account Class
class CurrentAccount extends Bank_Account {

    public CurrentAccount(int accountID, double balance) {
        super(accountID, balance);
    }

    // Withdraw with minimum balance 5000
    void amountWithdraw(double amount) {
        if ((balance - amount) >= 5000) {
            balance -= amount;
            System.out.println("Withdraw Successfully!");
        } else {
            System.out.println("Withdraw not possible");
        }
    }

    // Deposit
    void amountDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successfully!");
        } else {
            System.out.println("Invalid amount!");
        }
    }
}

// 🔹 Saving Account Class
class SavingAccount extends Bank_Account {

    public SavingAccount(int accountID, double balance) {
        super(accountID, balance);
    }

    // Withdraw with minimum balance 10000
    void amountWithdraw(double amount) {
        if ((balance - amount) >= 10000) {
            balance -= amount;
            System.out.println("Withdraw Successfully!");
        } else {
            System.out.println("Withdraw not possible");
        }
    }

    // Deposit
    void amountDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successfully!");
        } else {
            System.out.println("Invalid amount!");
        }
    }
}
