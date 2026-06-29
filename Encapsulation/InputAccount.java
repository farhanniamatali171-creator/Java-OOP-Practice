import java.util.Scanner;

class bankAccount {

    private static int balance = 1000;
    private int accountNumber;

    public bankAccount() {
    }

    void accountNumber(Scanner input) {
        System.out.print("Enter Account number: ");
        accountNumber = input.nextInt();
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void display() {
        System.out.println("\n--------------------------------------\n");
        System.out.println("Your account number is : " + accountNumber);
        System.out.println("Your current balance is: " + balance);
        System.out.println("\n--------------------------------------\n");
    }

    public static int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class InputAccount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        bankAccount b = new bankAccount();
        b.accountNumber(input);

        System.out.print("Enter amount to deposit: ");
        int amount = input.nextInt();

        b.deposit(amount);
        b.display();

        input.close();
    }
}