import java.io.*;

public class ByteData{
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("input.txt");
            out =new FileOutputStream("output.txt");
            int c = -1;
            while((c=in.read())!=-1)
            {
                out.write(c);
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
            if(out != null)
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