package ThreadDemo;
public class ThreadDemo2 
{
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            System.out.println("i : "+i);
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }    
}
