public class Rectangle{
    private double length;
    private double width;

    public Rectangle()
    {
        this(1.0,1.0);
    }
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public Rectangle(double side)
    {
        this.length=side;
        this.width=side;
    }

    public double area()
    {
        return this.length*this.width;
    }
    public double perimeter()
    {
        return 2*(this.length+this.width);
    }

}