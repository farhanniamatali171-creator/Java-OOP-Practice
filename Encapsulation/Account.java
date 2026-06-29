class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    static String bankName = "HBL";
    final double MIN_BALANCE = 500;

    // Default constructor
    BankAccount() {
        accountHolder = "";
        accountNumber = 0;
        balance = 0;
    }

    // Parameterized constructor
    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    boolean withdraw(double amount) {
        if(balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        }
        return false;
    }

    double getBalance() {
        return balance;
    }

    static void changeBankName(String name) {
        bankName = name;
    }
    void display(){
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println("Account balnce is  : "+balance);
    }
    
}
public class Account{
public static void main(String[] args) {
        BankAccount b=new BankAccount("Farhan",1234,2000);
        b.display();
    }
}