import java.util.Scanner;

public class Operators{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number :");
        int num1=input.nextInt();
        System.out.println("The number is "+ num1);

        System.out.print("Enter another number: ");
        int num2=input.nextInt();
        System.out.println("The number is "+num2);

        if(num1>num2)
        {
             System.out.println("num1 is greater than num2");
        }   
        else if(num1<num2)
        {
             System.out.println("num2 is greater than num1");
        }
        else if(num1==num2)
        {
             System.out.println("num1 and num2 are equal");
        }
        
        // operators
        int result=num1+num2;
        System.out.println("num1+num2= "+result);
        result=num1+num2;
        System.out.println("num1-num2= "+result);
        result=num1*num2;
        System.out.println("num1*num2= "+result);
        result=num1%num2;
        System.out.println("num1%num2= "+result);
        result=num1/num2;
        System.out.println("num1/num2= "+result);
    }
}








































