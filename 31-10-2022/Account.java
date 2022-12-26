public class Account{
    private String AccountId;
    private double balance;

    public Account(String AccountId,double balance){
        this.AccountId=AccountId;
        this.balance=balance;
    }

    public void withDraw(double money){
        System.out.println("\nAccountId: "+this.AccountId+"\nWithdraw: "+money);
        this.balance=this.balance-money;
        System.out.println("Balance: "+this.balance);
    }

    public void deposit(double money){
        System.out.println("\nAccountId: "+this.AccountId+"\nDeposit: "+money);
        this.balance=this.balance+money;
        System.out.println("Balance: "+this.balance);
    }

    public void display(){
        System.out.println("\nAccountId: "+this.AccountId+"\nBalance: "+this.balance+"\n");
    }
}