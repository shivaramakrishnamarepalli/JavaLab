package ThreadDemo;
public class ThreadDemo
{
    public static void main (String[] args)
    {
        Thread t = Thread.currentThread();
        System.out.println("current Thread :"+t);
        System.out.println(t.getName());
        System.out.println(t.getUncaughtExceptionHandler());
        t.setName("New thread");
        t.setPriority(2);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}