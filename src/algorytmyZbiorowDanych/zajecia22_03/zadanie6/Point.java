package algorytmyZbiorowDanych.zajecia22_03.zadanie6;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point){
            Point point = (Point) obj;
            return point.getX() == this.x && point.getY() == this.y;
        }
        return false;
    }
}
