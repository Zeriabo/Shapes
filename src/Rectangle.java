public class Rectangle extends Shape{
    double length,width,a = 0;

    public double calculateArea(){

        return  getLength()*getWidth();

    }
    public void displayArea(){
        System.out.println("The Area of the Rectangle is: "+calculateArea());
    }

    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.width= 6;
        rect.setLength(5);
        rect.setWidth(6);

        rect.calculateArea();
        rect.displayArea();

        //obj.b=200;
    }
   
}
