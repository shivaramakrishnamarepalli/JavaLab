public class Test{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(1.0,2.0);
        Rectangle r3=new Rectangle(2.0);
        double r1Area=r1.area();
        double r2Area=r2.area();
        double r3Area=r3.area();
        System.out.println("Area of rectangles:\nr1 = "+r1Area+"\nr2 = "+r2Area+"\nr3 = "+r3Area);

        double r1Perimeter=r1.perimeter();
        double r2Perimeter=r2.perimeter();
        double r3Perimeter=r3.perimeter();
        System.out.println("Perimeter of rectangles:\nr1 = "+r1Perimeter+"\nr2 = "+r2Perimeter+"\nr3 = "+r3Perimeter);

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
