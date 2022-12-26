public class PartTimeEmployee extends Employee{
    private int workTime;
    public PartTimeEmployee(String name,double salary,String role,int workTime)
    {
        super(name,salary,role);
        this.workTime=workTime;
    }
     public void getDes(){
        System.out.println("The employees name is "+getName()+",salary is "+getSalary()+", role is "+getRole()+"and works for "+this.workTime+"hours.");
    }
}