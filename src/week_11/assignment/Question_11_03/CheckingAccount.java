package week_11.assignment.Question_11_03;

public class CheckingAccount extends Account{
    public final double overDraftLimit;

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return "ID :" + getId() + "\n" +
                "Balance is $" + getBalance() + "\n" +
                "Limit is $" + overDraftLimit;

    }

}
