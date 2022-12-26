public class PermanentEmployee extends Employee{
    private int experience;
    public PermanentEmployee(String name,double salary,String role,int experience)
    {
        super(name,salary,role);
        this.experience=experience;
    }
     public void getDes(){
        System.out.println("The employees name is "+getName()+",salary is "+getSalary()+", role is "+getRole()+"and is "+this.experience+"years experirnced.");
    }
}