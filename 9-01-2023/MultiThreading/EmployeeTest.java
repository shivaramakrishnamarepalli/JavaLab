package MultiThreading;

public class EmployeeTest {
    public static void main(String[] args) {
        Runnable e1= new Employee("shiva", 19, 32000);
        Runnable e2= new Employee("rama", 32, 20000);
        Runnable e3= new Employee("krishna", 24, 96000);
        Thread t1 = new Thread(e1,"Thread - One ");
        Thread t2 = new Thread(e2,"Thread - two ");
        Thread t3 = new Thread(e3,"Thread - Three ");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getName()+" is alive "+t1.isAlive());
        System.out.println(t2.getName()+" is alive "+t2.isAlive());
        System.out.println(t3.getName()+" is alive "+t3.isAlive());
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch(InterruptedException e )
        {
            e.printStackTrace();
        }
        System.out.println(t1.getName()+" is alive "+t1.isAlive());
        System.out.println(t2.getName()+" is alive "+t2.isAlive());
        System.out.println(t3.getName()+" is alive "+t3.isAlive());
        System.out.println("Main Thread Finished!");
    }
}
