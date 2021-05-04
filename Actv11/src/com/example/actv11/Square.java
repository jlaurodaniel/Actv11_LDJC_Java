package com.example.actv11;

public class Square implements Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea(){
        return 4*this.side;
    }
    public  double getPerimeter(){
        return Math.pow(this.side,2);
    }
}
