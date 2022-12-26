package polymorphism;

public class Employee{
    private String name;
    private double salary;

    public Employee(){}
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;  
    }
    public double computeSalary(int months)
    {
        return this.salary*months;
    }
    public void getDes(){
        System.out.println("The employees name is "+this.name+" and salary is "+this.salary);
    }
    public String getName(){return this.name;}
    public double getSalary(){return this.salary;}
}