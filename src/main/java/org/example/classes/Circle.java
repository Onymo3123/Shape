package org.example.classes;

public class Circle extends Shape{

    Double radius;

    public Circle(String title, double radius){
        super(title);
        if(radius < 0 ){
            this.radius = 0.0;
        }else {
            this.radius = radius;
        }
    }


    @Override
    public Double Area() {
        return radius * radius * Math.PI;
    }

    @Override
    public Double Perimeter() {
        return 2.0 * radius * Math.PI;
    }
}
