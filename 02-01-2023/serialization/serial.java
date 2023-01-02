package serialization;
import java.io.*;

public class serial {
  public static void main(String[] args) {
    ObjectOutputStream out =null;
    try{
        out =  new ObjectOutputStream(new FileOutputStream("target.txt"));
        Employee e = new Employee("shiva",19,190000);
        System.out.println(e);
        out.writeObject(e);
        out.flush();
    }
    catch(IOException  e)
    {
        System.out.println(e.getMessage());
    }      
    finally{
        if(out!=null)
        {
            try{
                out.close();
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage()); 
            }
        }
    }

  }  
}
