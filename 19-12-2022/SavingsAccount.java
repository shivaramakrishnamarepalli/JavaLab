public class SavingsAccount extends Account{
    public static final double interestRate=0.12;

    public SavingsAccount(){}
    public SavingsAccount(int accountNumber,double balance,String acType)
    {
        super(accountNumber, balance,acType);
    }

    public double getInterest(int years)
    {
        this.setBalance(this.getBalance()+(years*this.getBalance()*interestRate));
        return this.getBalance();
    }

}
