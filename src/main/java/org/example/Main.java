package org.example;

import org.example.classes.*;
import org.example.classes.Rectangle;
import org.example.classes.enums.TriangleType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Circle circle = new Circle("круг", 25.0);
        Rectangle rectangle = new Rectangle("круг", 35.0, 10);
        Triangle triangle = new Triangle("круг", TriangleType.RightTriangle, 70, 30);
        Square square = new Square("круг", 27.0);

        JFrame frame = new JFrame("Фигуры");
        ShapePanel panel = new ShapePanel();
        frame.setSize(1920, 1024);
        panel.addShape(circle);
        panel.addShape(rectangle);
        panel.addShape(triangle);
        panel.addShape(square);
        JButton button = new JButton("STOP");

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);


        while (true){
            try{
            frame.repaint();
            Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
