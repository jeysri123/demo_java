

public class ATM {
    private double balance;
    void displayBalance() {
        System.out.println("Balance: " + getBalance());
    }

    private double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.balance = 1000.0;
        atm.displayBalance();
    }
}
