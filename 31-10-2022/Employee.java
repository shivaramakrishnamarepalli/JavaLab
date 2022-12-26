public class Employee{
    private String name;
    private String id;
    private int age;
    private double salary;
    private static String organisation= "Microsoft";

    public Employee(String name,String id,int age,double salary)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
    }

    public void increment(double percent)
    {
        System.out.println("\n"+this.name+": "+percent+" percent Increment");
        this.salary=(this.salary)*((100+percent)/100);
        System.out.println("Salary after increment : "+this.salary);
    }

    public void display()
    {
        System.out.println("\nName: "+this.name+"\nId: "+this.id+"\nAge: "+this.age+"\nSalary: "+this.salary+"\nOrganisation: "+organisation+"\n");
    }

}