public class Test{
    public static void main(String[] args){
        Employee e1 =new PartTimeEmployee("shiva",21000,"mentor",4);
        Employee e2 =new PermanentEmployee("rama",82000,"assistant professor",16);
        e1.getDes();
        e2.getDes();
        e1.incrementSalary(1000);
        System.out.println(e1.getSalary());
    }
}