package org.example.classes;

import org.example.interfaces.Painted;



abstract class Shape implements Painted {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public int[] GetRandomPosition(){
        int[] position = new int[2];
        position[0] = (int) (620 * Math.random() );
        position[1] = (int) (240 * Math.random() );
        return position;
    }

    abstract Double Area() throws Exception;

    abstract Double Perimeter() throws Exception;

}
