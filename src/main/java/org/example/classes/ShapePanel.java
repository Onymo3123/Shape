package org.example.classes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel {
    private ArrayList<Shape> shapes;
    public ShapePanel(){
        this.shapes = new ArrayList<>();
    }
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Shape shape : shapes){
            shape.paint(g);
        }
    }

    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        for(Shape shape : shapes){
            shape.paint(g);
        }
    }
}
