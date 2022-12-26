package polymorphism;

public class Manager extends Employee{
    private double incentive;
    public Manager(String name,double salary,double incentive){
        super(name,salary);
        this.incentive=incentive;
    }
    public double computeSalary(int months)
    {
        return (getSalary()+incentive)*months;
    }
}
