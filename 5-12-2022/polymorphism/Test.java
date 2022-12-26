package polymorphism;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Manager("shiva", 160000, 5000);
        e1.getDes();
        System.out.println(e1.computeSalary(3));
    }
}
