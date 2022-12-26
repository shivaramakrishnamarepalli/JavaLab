public abstract class Account{
    private int accountNumber;
    private double balance;
    private String acType;

    public Account(){}

    public Account(int accountNumber,double balance,String acType)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.acType=acType;
    }

    public void deposit(double money)
    {
        this.balance+=money;
    }

    public void withDraw(double money)
    {
        if(this.balance<0)
        {
            System.out.println("Balance insufficient!");
            return;
        }
        this.balance-=money;
    }

    public double getBalance()
    {
        return this.balance;
    }
    public double getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setBalance(double setAmount)
    {
        this.balance=setAmount;
    }

    public String getAcType()
    {
        return this.acType;
    }
}