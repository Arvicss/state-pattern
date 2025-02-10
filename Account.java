public class Account {
    private Double balance;
    private final String accountNumber;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public void deposit(Double amount) {
        this.accountState.deposit(this, amount);
    }

    public void withdraw(Double amount) {
        this.accountState.withdraw(this, amount);
    }

    public void activate() {
        this.accountState.activate(this);
    }

    public void suspend() {
        this.accountState.suspend(this);
    }

    public void close() {
        this.accountState.close(this);
    }

    @Override
    public String toString() {
       return "Account Number: " + this.accountNumber + "\nBalance: " + this.balance;
    }

    public void setState(AccountState accountState) {
        this.accountState = accountState;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
