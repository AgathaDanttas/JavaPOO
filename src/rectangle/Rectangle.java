package src.rectangle;

public class Rectangle{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return this.width * this.height;
        
    }

    public double calculatePerimeter(){
        return ((this.width * 2) + (this.height * 2));
    }


    public void displayPerimeterAndArea(){
        System.out.println("Perimetro: "+calculatePerimeter());
        System.out.println("Area: "+calculateArea());
    }
    
}