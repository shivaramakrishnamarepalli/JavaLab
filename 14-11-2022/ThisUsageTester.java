public class ThisUsageTester{
    public static void main(String[] args){
       
        Book b1=new Book();   
        System.out.println("Book b1:");
        b1.display(); 
        Book b2=new Book(300);
        System.out.println("Book b2:");
        b2.display(); 
        
        String s1="classmate";
        Book b3= new Book(s1);
         System.out.println("Book b3:");
        b3.display(); 
    }
}
