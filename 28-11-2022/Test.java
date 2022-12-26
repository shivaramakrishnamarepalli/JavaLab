import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1= input.nextLine();
        System.out.println("Enter another string:");
        String s2= input.nextLine();
        MethodOverWrite obj1=new MethodOverWrite(s1,s2);
        boolean res = obj1.equals();
        if(res==true)
        {
            System.out.println("Both the strings are same");
        }
        else{
            System.out.println("Both the strings are not same");
        }
        if(s1==s2){
            System.out.println("Addresses are same");
        }
        else{
            System.out.println("Addresses are not same");
        }
        // writing tester for concat
        System.out.println("Enter a string to concat:");
        String s3= input.nextLine();
        Add a1= new Add(s1,s2,s3);
        String result=a1.concat();
        System.out.println("The combined string is "+result);
    }
}