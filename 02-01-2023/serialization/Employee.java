package serialization;
import java.io.Serializable;

public class Employee implements Serializable
{
    private String name ;
    private int age ;
    private static int companyId =108;
    private transient double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString()
    {
        return "Name :" +this.name +",age :"+this.age+",salary :"+this.salary+",company id is :"+companyId;
    }

}