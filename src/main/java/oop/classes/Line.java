package oop.classes;

public class Line {

    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY){
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line{" + "begin=" + begin + ", end=" + end + '}';
    }

    public Point getBegin() {return begin;}

    public void setBegin(Point begin) {this.begin = begin;}

    public Point getEnd() {return end;}

    public void setEnd(Point end) {this.end = end;}

    public String getLength(){return String.valueOf((Math.sqrt(Math.pow((end.getX() - begin.getX()), 2)
            + Math.pow((end.getY() - begin.getY()), 2))));}
}
