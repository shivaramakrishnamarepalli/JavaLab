package WritePrimitives;
import java.io.*;

public class ReadPrimitives {
    public static void main(String[] args) {
        DataInputStream in = null;
        Boolean b=null;
        int i=-1;
        char c='/';
        try {
            in =new DataInputStream(new FileInputStream("target2.txt"));
            b =in.readBoolean();
            i = in.readInt();
            c = in.readChar();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
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
        System.out.println("Boolean = "+b+", int =" +i +"char ="+c);
    }
}
