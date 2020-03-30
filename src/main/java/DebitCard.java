class Account {
    private int acctNumber;
    private double balance;
    Account(int acctNumber, double balance) {
        this.acctNumber = acctNumber;
        this.balance = balance;
    }
    public float getBalance() { return balance; }
}

class DebitCard extends Account  {   // a Debit Card is also called an ATM Card
    private int PIN;
    DebitCard(int acctNumber, double balance, int PIN) {
        super(acctNumber, balance);
        this.PIN = PIN;
    }
    public String toString() { return "Card balance: " + getBalance(); }
}

class MainDebitCard {
    public static void main(String[] args) {
        DebitCard card = new DebitCard(12345678, 100.00, 9099);
    }
}
