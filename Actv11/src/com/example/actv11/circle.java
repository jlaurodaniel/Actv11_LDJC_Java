package com.example.actv11;

public class circle implements Shape{
    public double ratio;
    public static final double pi=3.14159265359;

    public circle(double ratio) {
        this.ratio = ratio;
    }

    public double getArea(){
        return this.pi*Math.pow(ratio,2);
    }
    public  double getPerimeter(){
        return 2*this.pi*ratio;
    }
}
