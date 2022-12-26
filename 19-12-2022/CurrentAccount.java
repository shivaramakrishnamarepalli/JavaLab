public class CurrentAccount extends Account{
    public static final double minBalance=500.0;
    public CurrentAccount(){}
    public CurrentAccount(int accountNumber,double balance,String acType)
    {
        super(accountNumber, balance,acType);
    }
    public void withDraw(double money)
    {
        if(this.getBalance()<minBalance)
        {
            System.out.println("Balance insufficient!");
            return;
        }
        this.setBalance(this.getBalance()-money);
    }
}
