public class SuspendedState implements AccountState {

    @Override
    public void deposit(Account account, Double amount) {
        System.out.println("Cannot deposit on closed account!");
    }

    @Override
    public void withdraw(Account account, Double amount) {
        System.out.println("Cannot Withdraw on closed account!");
    }

    @Override
    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already Suspended!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed!");
    }
}
