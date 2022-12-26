import java.io.*;

public class CountCharacters
{
    public static void main(String[] args) 
    {
        FileInputStream in = null;
        int i = 0;
        try{
            in = new FileInputStream("input.txt");
            while(in.read()!=-1)
            {
                i++;
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(in != null)
            {
                try{
                    in.close();
                }
                catch(IOException e)
                {
                    System.out.println(e.getMessage());  
                }
            }
        }
        System.out.println("The number of characters are = "+i);
    }
}
