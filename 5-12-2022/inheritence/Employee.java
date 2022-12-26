public class Employee{
    private String name;
    private double salary;
    private String role;
    public Employee(){}
    public Employee(String name,double salary,String role){
        this.name = name;
        this.salary = salary;
        this.role = role;
    }
    public void incrementSalary(double inc)
    {
        this.salary+=inc;
    }
    public void getDes(){
        System.out.println("The employees name is "+this.name+",salary is "+this.salary+" and role is "+this.role);
    }
    public String getName(){return this.name;}
    public String getRole(){return this.role;}
    public double getSalary(){return this.salary;}
}