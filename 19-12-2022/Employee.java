public class Employee{
    private String name;
    private double salary;

    public Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }

    public void display()
    {
        System.out.println("\nName: "+this.name+"\nSalary: "+this.salary);
    }

}