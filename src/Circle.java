import java.lang.Math;
public class Circle extends Shape{

    double r;
    @Override
    public double calculateArea() {

        return Shape.getPi()*Math.pow(r,2.0);
    }

    @Override
    public void displayArea() {
   System.out.println("The Area of the Circle: "+calculateArea());
    }
    public static void main(String args[]){
        Circle circa = new Circle();
        circa.r = 5;

        circa.calculateArea();
        circa.displayArea();

        //obj.b=200;
    }

}



