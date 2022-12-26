import java.util.Scanner;

public class Grades{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your marks ");
        int marks=input.nextInt();
        char grade;
        if(marks>90)
        {
            grade='A';
        }
        else if(marks>80)
        {
            grade='B';
        }
        else if(marks>70)
        {
            grade='C';
        }
        else if(marks>60){
            grade='D';
        }
        else if(marks>50){
            grade='E';
        }
        else if(marks>=40){
            grade='p';
        }
        else{
            grade='F';
        }
        System.out.println("Your grade is "+grade);
    }
}