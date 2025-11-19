package org.example.classes;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract Double Area() throws Exception;

    abstract Double Perimeter() throws Exception;

}
