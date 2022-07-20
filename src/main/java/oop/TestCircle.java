package oop;

import oop.classes.Circle;

public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(4.0, "black");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and color of " + c3.getColor() + " and area of " + c3.getArea());

        Circle c4 = new Circle();
        c4.setColor("blue");
        c4.setRadius(5.0);
        System.out.printf(c4.toString());
    }
}
