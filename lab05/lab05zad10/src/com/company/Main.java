package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] v = new Shape[4];
        v[0] = new Circle("Red", true, 2);
        v[1] = new Circle(3);
        v[2] = new Rectangle(2, 3);
        v[3] = new Square (3);

        for (Shape s : v) {
            System.out.println(s);

            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println(r.getWidth());
                System.out.println(r.getHeight());
            }
        }
    }
}

abstract class Shape{
    String color;
    boolean filled;

    public Shape() {
        this.color = "Black";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle() {
        super();
        this.width = 10;
        this.height = 10;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return (width + height) * 2;
    }

    @Override
    public String toString(){
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circle extends Shape {
    double radius;

    public Circle() {
        super();
        this.radius = 10;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }


class Square extends Rectangle {
        double side;

    public Square() {
        super();
        this.side = 10;
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public void setHeight(double side){
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
