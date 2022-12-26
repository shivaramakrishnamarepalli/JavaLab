public class ThisUsage{
    private int pages;
    private double cost;
    private String company;

    public ThisUsage()
    {
        this.pages=200;
        this.cost=40.0;
    }

    public ThisUsage(String company)
    {
        this();//this to call another constructor
        this.company=company;//this for instansive field
    }
    
    public void display()
    {
        System.out.println("This book has "+this.pages+" pages and it costs "+this.cost+"rupees");
    }
}