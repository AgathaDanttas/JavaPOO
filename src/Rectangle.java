package src;

public class Rectangle{
    int width;
    int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void calculateArea(){
        int area;

        area = this.width * this.height;
    }
}