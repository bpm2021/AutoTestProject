package oop;

import oop.classes.Line;

public class TestLine {

    public static void main(String[] args) {
        Line line = new Line(0, 0, 1, 1);

        System.out.printf(line.toString());

        System.out.println("The length of line is " + line.getLength());
    }
}
