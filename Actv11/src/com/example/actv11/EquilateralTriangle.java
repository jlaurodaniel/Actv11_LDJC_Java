package com.example.actv11;

public class EquilateralTriangle implements Shape {
    public double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getArea(){
        return this.side*this.side/2;
    }
    public  double getPerimeter(){
        return this.side*3;
    }
}
