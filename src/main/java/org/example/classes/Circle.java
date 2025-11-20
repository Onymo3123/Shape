package org.example.classes;

import java.awt.*;

public class Circle extends Shape{

    double radius;

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

    @Override
    public void paint(Graphics g) {
        int[] position = this.GetRandomPosition();
        g.drawOval(position[0], position[1], (int)this.radius, (int)this.radius);
        System.out.println(123);
    }
}
