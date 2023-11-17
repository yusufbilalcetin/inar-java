package week_11.assignment.Question_11_03;

public class SavingsAccount extends  Account{
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "ID : " + getId() + "\n" +
                "Balance is $" + getBalance();
    }
}
