public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer("shiva","savings",120000,101);
        Customer c2 = new Customer("rama","current",180000,102);
        c1.getDes();
        c2.getDes();
        //
        System.out.println(((SavingsAccount)c1.ac).getInterest(6));
    }
}