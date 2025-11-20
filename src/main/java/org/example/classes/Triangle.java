package org.example.classes;

import org.example.classes.enums.TriangleType;
import org.example.classes.exceptions.TirangleTypeException;

import java.awt.*;

public class Triangle extends Shape{
    TriangleType type;
    double height;
    double width;//

    public Triangle(String title, TriangleType type, double height, double width){
        super(title);
        this.type = type;
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    @Override
    public Double Area() {
        return ( this.height * this.width ) / 2;
    }

    @Override
    public Double Perimeter() throws TirangleTypeException {
        if(this.type == TriangleType.EquilateralTriangle){
            return this.width*3;
        }else{
            throw new TirangleTypeException("Невозможно вычислить периметр данного треугольника");
        }
    }

    @Override
    public void paint(Graphics g) {
        int[] position = this.GetRandomPosition();
        g.drawOval(position[0], position[1], (int)this.width, (int)this.height);
        g.drawRect(position[0], position[1], (int)this.width, (int)this.height);
    }
}
