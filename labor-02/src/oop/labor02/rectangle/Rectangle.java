package oop.labor02.rectangle;

public class Rectangle {
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = Math.abs(length);
        this.width = Math.abs(width);
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double area(){
        return this.width * this.length;
    }
    public double perimeter(){
        return 2 * this.length + 2 * this.width;
    }
}
