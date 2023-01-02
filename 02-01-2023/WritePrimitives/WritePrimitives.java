package WritePrimitives;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePrimitives {
    public static void main(String[] args) {
        DataOutputStream out = null;
        try {
            out =new DataOutputStream(new FileOutputStream("target2.txt"));
            out.writeBoolean(true);
            out.writeInt(12);
            out.writeChar('c');
        }
        catch (IOException e) 
        {
            e.printStackTrace();
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
