public class Tester{
    public static void main(String[] args){
        Employee e1 = new Employee("ravi","1000",24,25000);
        e1.display();
        Employee e2 = new Employee("vara","1001",25,30000);
        e2.display();
        e1.increment(5);
        e2.increment(-10);
      
        Account a1= new Account("100",150000);
        a1.display();
        Account a2= new Account("101",250000);
        a2.display();
        a1.deposit(60000);
        a2.withDraw(70000);

    }
}