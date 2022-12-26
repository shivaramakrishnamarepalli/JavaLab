public class MethodOverloading{
    private int pages;
    private double cost;
    private String company;

    public MethodOverLoading(int pages,double cost,String company)
    {
        this.pages=pages;
        this.cost=cost;
        this.company=company;
    }

    public void display(int papers,int money)
    {
        System.out.println("This book has "+papers+" pages and it costs "+money+"rupees");
    }

    public void display()
    {
        System.out.println("This book has "+this.pages+" pages and it costs "+this.cost+"rupees.It is made by "+this.company);
    }
}