/*program: write a program with the main method to print messages */
import java.util.Scanner;

public class MessageTester{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string:");
        String message=input.nextLine();
        System.out.print("The string is: "+message);
        //print in same line 
        System.out.println("continuing in sme line");
        System.out.println("now moving to next line");
    }
}