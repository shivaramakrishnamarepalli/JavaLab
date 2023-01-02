package FileDemo;
import java.io.*;

public class FileDemo
{
    public static void main(String[] args) {
        File f =new File("F:/cseb5b1/02-01-2023/FileDemo","target3.txt");
        System.out.println("Name of the file is "+ f.getName());
        System.out.println("Parent of the file is "+ f.getParent());
        System.out.println("Relativepath of the file is "+ f.getPath());
        System.out.println("Absolute path of the file is "+ f.getAbsolutePath());
        System.out.println("file is"+ (f.exists()? "available":"not available"));
        System.out.println("file is"+ (f.canRead()? "readable":"not readable"));
        System.out.println("file is"+ (f.canWrite()? "writeable":"not writeable"));
        System.out.println("file "+f.isFile());
        System.out.println("file directory "+f.isDirectory());
        System.out.println("Modifier "+f.lastModified());
        System.out.println("file length "+f.length());
        System.out.println("delete "+f.delete());
        System.out.println("file rename "+f.renameTo(f));
        System.out.println("readonly"+f.setReadOnly());
        f.deleteOnExit();
        System.out.println("total space "+f.getTotalSpace());
        System.out.println("free space "+f.getFreeSpace());
        System.out.println("usable space "+f.getUsableSpace());
    }
}