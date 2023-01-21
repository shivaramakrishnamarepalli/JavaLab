package MultiThreading;

public class Employee implements Runnable
{
    private String name ;
    private int age;
    private double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString()
    {
        return "Name : "+this.name+", Age : "+this.age+", Salary : "+this.salary;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(Thread.currentThread().getName() + "iteration " +i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e )
            {
                e.printStackTrace();
            }
        }
    }
}
