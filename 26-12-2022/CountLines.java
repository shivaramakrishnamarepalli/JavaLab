import java.io.*;

public class CountLines {
    public static void main(String[] args) {
        BufferedReader in = null;
        int i = 0;
        try{
            in = new BufferedReader(new FileReader("input.txt"));
            while(in.readLine()!=null)
            {
                i++;
            }

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
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
        System.out.println("The number of lines are = "+i);
    }
}
