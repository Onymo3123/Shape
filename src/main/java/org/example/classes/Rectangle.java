package org.example.classes;

import java.awt.*;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle(String title, double width, double length){
        super(title);
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
        if(length < 0){
            this.length = 0;
        }else{
            this.length = length;
        }

    }

    @Override
    public Double Area() {
        return this.width * this.length;
    }

    @Override
    public Double Perimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public void paint(Graphics g) {
        int[] position = this.GetRandomPosition();
        g.drawRect(position[0], position[1], (int)this.width, (int)this.length);
    }
}
