package serialization;
import java.io.*;

public class Deserial
{
   public static void main(String[] args) {
        ObjectInputStream in =null;
        try{
            in =  new ObjectInputStream(new FileInputStream("target.txt"));
            Employee e = (Employee) in.readObject();
            System.out.println(e);
        }
        catch(IOException |ClassNotFoundException  e)
        {
            System.out.println(e.getMessage());
        }       
        finally{
            if(in!=null)
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
    }
}