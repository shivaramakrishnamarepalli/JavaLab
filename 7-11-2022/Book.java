public class Book{
    private int pages;
    private double cost;
    private String company;

    public Book()
    {
        this.pages=200;
        this.cost=40.0;
    }

    public Book(String company)
    {
        this();
        this.company=company;
    }
    public Book(int pages)
    {
        this.pages=pages;
        this.cost=(pages/5);
    }
    
    public void display()
    {
        System.out.println("This book has "+this.pages+" pages and it costs "+this.cost+"rupees");
    }
}