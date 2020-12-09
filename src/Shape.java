abstract class Shape{
    private double height;  // To hold height.
    private double width;  //To hold width or base
    private double length;
    protected static  double pi =3.14159;
    private double side;
    public void setHeight(double height)
    {
        this.height = height;


    }
    // double pi,double side
    public void setWidth(double width)
    {
        this.width = width;


    }
    public void setLength(double length)
    {
        this.length = length;


    }

    public void setSide(double side)
    {
        this.side = side;


    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }

    public double getSide()
    {
        return side;
    }
    public static double getPi()
    {
        return pi;
    }
    public void display(){
        System.out.println("This is display method");
    }
    abstract public double calculateArea();
    abstract  public void displayArea();
}