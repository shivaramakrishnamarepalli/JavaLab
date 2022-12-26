public class Customer {
    private String name;
    public Account ac;

    public Customer(String name,String acType,double balance,int accountNumber)
    {
        this.name=name;

        if(acType.toLowerCase()=="savings")
        {
            ac=new SavingsAccount(accountNumber,balance,acType);
        }
        if(acType.toLowerCase()=="current")
        {
            ac=new CurrentAccount(accountNumber,balance,acType);
        }
    }
    public void getDes()
    {
        System.out.println("The customer name is "+this.name+",Account type is "+this.ac.getAcType());
        System.out.println("The account number is "+this.ac.getAccountNumber()+" and balance is "+this.ac.getBalance()+"\n");
    }
}
