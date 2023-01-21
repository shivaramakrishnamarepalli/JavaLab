package RunnableInterface;

public class MyThread2Test {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
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
